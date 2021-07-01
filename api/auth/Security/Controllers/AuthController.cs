using System.Threading.Tasks;
using Microsoft.Extensions.Logging;
using Microsoft.AspNetCore.Mvc;

using GoodFood.Auth.Security.Models;
using GoodFood.Auth.Security.Services;

namespace GoodFood.Auth.Security.Controller
{

    [ApiController]
    [Route("api/v1/auth")]
    public class AuthController : ControllerBase
    {
        private ILogger _logger;

        private IAuthService _authService;

        public AuthController(IAuthService authService, ILogger<AuthController> logger)
        {
            _authService = authService;
            _logger = logger;
        }

        [HttpPost("signin")]
        public async Task<IActionResult> Signin([FromBody] SigninRequest model)
        {
            _logger.LogInformation("Request to login user : {email}", model.email);

            var response = await _authService.Signin(model);

            if (response == null)
                return BadRequest(new { message = "Username or password is incorrect" });

            return Ok(response);
        }

        [HttpPost("signup")]
        public async Task<IActionResult> Signup([FromBody] SignupRequest model)
        {
            _logger.LogInformation("Request to register new user : {nom} {prenom}", model.nom, model.prenom);

            var response = await _authService.Signup(model);

            return Ok(response);
        }
    }
}