using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace auth.entity
{
    [Table("franchise")]
    public class Franchise
    {
        
        [Key, Column("id")]
        public int id{get; set;}

        [Required, Column("designation")]
        public string designation { get; set; }

        [ForeignKey("adresse")]
        public int idAdresse {get; set;}

        public Adresse adresse {get; set;}
    }
}