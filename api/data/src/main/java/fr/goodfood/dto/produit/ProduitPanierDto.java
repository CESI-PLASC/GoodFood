package fr.goodfood.dto.produit;

public class ProduitPanierDto {
    
    private Long id;
    private Integer quantite;

    public Long getId(){
        return this.id;
    }

    public ProduitPanierDto setId(Long id){
        this.id = id;
        return this;
    }

    public Integer getQuantite(){
        return this.quantite;
    }

    public ProduitPanierDto setQuantite(Integer quantite){
        this.quantite = quantite;
        return this;
    }
}
