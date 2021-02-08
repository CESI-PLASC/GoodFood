using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace auth.entities
{
    [Table("adresse")]
    public class Adresse
    {
        [Key, Column("id")]
        public int Id { get; set; }

        [Column("pays"), Required]
        public string Pays {get; set;} 

        [Column("codePostal"), Required]
        public string CodePostal {get; set;}

        [Column("rue"), Required]
        public string Rue {get; set;}

        [Column("ville"), Required]
        public string Ville {get; set;}

        [Column("complement")]
        public string Complement {get; set;}

        public ICollection<Franchise> Franchises {get; set;}
    }
}