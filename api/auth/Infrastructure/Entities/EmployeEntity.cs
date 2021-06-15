using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace GoodFood.Auth.Infrastructure.Entities
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

        [Column("telephone_mobile")]
        public string TelephoneMobile {get; set;}

        [Column("franchise_id")]
        [Required]
        [ForeignKey("fk_employe_franchise_id")]
        public int FranchiseId {get; set;}
        public Franchise Franchise {get; set;}

        [Required]
        [ForeignKey("fk_possede_franchise_id")]
        public ICollection<Privilege> Privileges {get; set;}
    }
}