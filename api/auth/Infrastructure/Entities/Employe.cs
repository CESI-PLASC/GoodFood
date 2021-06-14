using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace GoodFood.Auth.Infrastructure.Entities
{
    [Table("employe")]
    public class Employe
    {
        [Key]
        [Column("id")]
        public int id {get; set;}

        [Column("nom")]
        [Required]
        public string nom {get; set;}

        [Column("prenom")]
        [Required]
        public string prenom {get; set;}

        [Column("email")]
        [Required]
        public string email {get; set;}

        [Column("telephone_mobile")]
        public string telephoneMobile {get; set;}

        [Column("franchise_id")]
        [Required]
        [ForeignKey("fk_employe_franchise_id")]
        public int franchiseId {get; set;}
        public Franchise franchise {get; set;}

        [Required]
        [ForeignKey("fk_possede_franchise_id")]
        public ICollection<Privilege> privileges {get; set;}
    }
}