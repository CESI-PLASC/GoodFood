using System;
namespace GoodFood.Auth.Infrastructure.Exceptions
{
    public class ExistingEmailException : Exception
    {
        private const string _defaultMessage = "This email is already taken !";
        public ExistingEmailException() : base(_defaultMessage) {}

        /// <summary>
        /// Constructor.
        /// </summary>
        /// <param name="innerException"></param>
        public ExistingEmailException(Exception innerException)
            : base(_defaultMessage, innerException){}

        /// <summary>
        /// Constructor.
        /// </summary>
        /// <param name="message"></param>
        public ExistingEmailException(string message) : base(message){}

        /// <summary>
        /// Constructor.
        /// </summary>
        /// <param name="message"></param>
        /// <param name="innerException"></param>
        public ExistingEmailException(string message, Exception innerException)
            : base(message, innerException){}
    }
}