using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using Newtonsoft.Json;

namespace GoodFood.Auth.Entities
{
    [Table("employe")]
    public class EmployeEntity
    {
        [Key]
        [Column("id")]
        public int Id {get; set;}

        [Column("nom")]
        [Required]
        public string Nom {get; set;}

        [Column("prenom")]
        [Required]
        public string Prenom {get; set;}

        [Column("email")]
        [Required]
        public string Email {get; set;}

        [Column("password")]
        [Required]
        [JsonIgnore]
        public string Password {get; set;}

        [Column("franchise_id")]
        [Required]
        public int FranchiseId {get; set;}
    }
}