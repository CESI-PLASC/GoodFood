using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace GoodFood.Auth.Infrastructure.Entities
{
    public class Privilege
    {
        [Key]
        [Column("id")]
        public int id {get; set;}
        
        [Column("designation")]
        [Required]
        public string designation {get; set;}

        [Required]
        [ForeignKey("fregroupe_privilege_enfant_id")]
        public ICollection<Privilege> regroupe {get; set;}
    }
}