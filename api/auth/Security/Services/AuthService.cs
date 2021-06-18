using Microsoft.Extensions.Options;
using Microsoft.IdentityModel.Tokens;
using System;
using System.Collections.Generic;
using System.IdentityModel.Tokens.Jwt;
using System.Linq;
using System.Security.Claims;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Logging;

using GoodFood.Auth.Entities;
using GoodFood.Auth.Security.Models;
using GoodFood.Auth.Infrastructure.Helpers;
using GoodFood.Auth.Infrastructure.Services.Employe;
using System.Security.Cryptography;
using Microsoft.AspNetCore.Cryptography.KeyDerivation;

namespace GoodFood.Auth.Security.Services
{
    public class AuthService : IAuthService
    {
        private ILogger _logger;

        private readonly AppSettings _appSettings;
        private readonly IPasswordHasher _hasher;
        private readonly IEmployeService _employeService;

        public AuthService(IOptions<AppSettings> appSettings, IEmployeService employeService, IPasswordHasher hasher, ILogger<AuthService> logger)
        {
            _appSettings = appSettings.Value;
            _hasher = hasher;
            _employeService = employeService;
            _logger = logger;
        }

        public async Task<AuthResponse> Signin(SigninRequest model)
        {
            var user = await _employeService.GetOneByEmail(model.email);

            // return null if user not found
            if (user == null) return null;

            (bool verified, bool needUpdate) = _hasher.Check(user.Password, model.password);

            if (!verified) return null;

            // authentication successful so generate jwt token
            var token = generateJwtToken(user);

            return new AuthResponse(user, token);
        }

        public async Task<AuthResponse> Signup(SignupRequest model)
        {

            var userRequestData = new EmployeEntity();
            userRequestData.Nom = model.nom;
            userRequestData.Prenom = model.prenom;
            userRequestData.Email = model.email;
            userRequestData.FranchiseId = model.franchiseId;
            userRequestData.Password = _hasher.Hash(model.password);

            var userResponseData = await _employeService.Add(userRequestData);

            // return null if user not found
            if (userResponseData == null) return null;

            // authentication successful so generate jwt token
            var token = generateJwtToken(userResponseData);

            return new AuthResponse(userResponseData, token);
        }

        // helper methods

        private string generateJwtToken(EmployeEntity user)
        {
            // generate token that is valid for 7 days
            var tokenHandler = new JwtSecurityTokenHandler();
            var key = Encoding.ASCII.GetBytes(_appSettings.Secret);
            var tokenDescriptor = new SecurityTokenDescriptor
            {
                Subject = new ClaimsIdentity(new[] { new Claim("id", user.Id.ToString()) }),
                Expires = DateTime.UtcNow.AddDays(7),
                SigningCredentials = new SigningCredentials(new SymmetricSecurityKey(key), SecurityAlgorithms.HmacSha256Signature)
            };
            var token = tokenHandler.CreateToken(tokenDescriptor);
            return tokenHandler.WriteToken(token);
        }
    }
}