using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;


namespace GoodFood.Auth.Infrastructure.Entities
{
    [Table("franchise")]
    public class Franchise
    {
        [Key]
        [Column("id")]
        public int id {get; set;}

        [Column("designation")]
        [Required]
        public string designation {get; set;}

        [Column("email")]
        [Required]
        public string email {get; set;}

        [Column("telephone_fixe")]
        public string telephoneFixe {get; set;}

        [Column("telephone_modile")]
        public string telephoneMobile {get; set;}

        [Column("est_supprime")]
        public string estSupprime {get; set;}

        [Required]
        [ForeignKey("fk_franchise_adresse_id")]
        public Adresse adresse {get; set;}
    }
}