using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace auth.entity
{
    [Table("adresse")]
    public class Adresse
    {
        [Key, Column("id")]
        public int id { get; set; }

        [Column("pays"), Required]
        public string pays {get; set;} 

        [Column("codePostal"), Required]
        public string codePostal {get; set;}

        [Column("rue"), Required]
        public string rue {get; set;}

        [Column("ville"), Required]
        public string ville {get; set;}

        [Column("complement")]
        public string complement {get; set;}

        public ICollection<Franchise> franchises {get; set;}
    }
}