using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

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
    }
}