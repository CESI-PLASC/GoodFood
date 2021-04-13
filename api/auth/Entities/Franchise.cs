using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace auth.entities
{
    [Table("franchise")]
    public class Franchise
    {
        
        [Key, Column("id")]
        public int Id{get; set;}

        [Required, Column("designation")]
        public string Designation { get; set; }

        [Column("tel")]
        public string Tel {get;set;}

        [Column("mail")]
        public string Mail {get;set;}


        [Column("estSupprime")]
        public bool EstSupprime { get; set; } = false;


     //   [ForeignKey("adresse")]
    //    public int IdAdresse {get; set;}
     //   public Adresse Adresse {get; set;}
    }
}