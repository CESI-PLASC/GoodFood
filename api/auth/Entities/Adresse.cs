using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;


namespace GoodFood.Auth.Entities
{
    [Table("adresse")]
    public class Adresse
    {
        [Key]
        [Column("id")]
        public int id {get; set;}

        [Column("pays")]
        [Required]
        public string pays {get; set;}

        [Column("ville")]
        [Required]
        public string ville {get; set;}

        [Column("code_postal")]
        [Required]
        public string codePostal {get; set;}

        [Column("rue")]
        [Required]
        public string rue {get; set;}

        [Column("complement")]
        public string complement {get; set;}
    }
}