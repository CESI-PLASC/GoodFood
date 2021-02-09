package fr.mycompany.goodfood.dto.commande;

public class CommandeDto extends CommandeBase {

    private Long id;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
