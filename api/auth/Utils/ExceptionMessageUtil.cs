namespace auth.Utils
{
    /// <summary>
    /// Exception message util.
    /// </summary>
    public static class ExceptionMessageUtil
    {
        /// <summary>
        /// Forbidden exception message.
        /// </summary>
        public const string FORBIDDEN = "You don't have access rights.";
        
        /// <summary>
        /// NotFound exception message.
        /// </summary>
        public const string NOT_FOUND = "No results.";
        
        /// <summary>
        /// Get failed exception message.
        /// </summary>
        public const string GET_FAILED = "Error getting.";
        
        /// <summary>
        /// Add failed exception message.
        /// </summary>
        public const string ADD_FAILED = "Error adding.";
        
        /// <summary>
        /// Update failed exception message.
        /// </summary>
        public const string UPDATE_FAILED = "Error updating.";
        
        /// <summary>
        /// Delete failed exception message.
        /// </summary>
        public const string DELETE_FAILED = "Error deleting.";
    }
}