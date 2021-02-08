using System;
namespace auth.infrastructure.Exceptions
{
    public class NotFoundException : Exception
    {
        public NotFoundException(){}

        /// <summary>
        /// Constructor.
        /// </summary>
        /// <param name="message"></param>
        public NotFoundException(string message) : base(message){}

        /// <summary>
        /// Constructor.
        /// </summary>
        /// <param name="message"></param>
        /// <param name="innerException"></param>
        public NotFoundException(string message, Exception innerException)
            : base(message, innerException){}
    }
}