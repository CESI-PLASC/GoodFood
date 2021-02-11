package fr.goodfood.dto.panier;

public class ProduitPanierDto {
    
    private Long id;
    private Integer quantite;
    private String designation;

    public Long getId(){
        return this.id;
    }

    public ProduitPanierDto setId(Long id){
        this.id = id;
        return this;
    }

    public String getDesignation(){
        return this.designation;
    }

    public Integer getQuantite(){
        return this.quantite;
    }

    public ProduitPanierDto setQuantite(Integer quantite){
        this.quantite = quantite;
        return this;
    }

    public ProduitPanierDto setDesignation(String designation){
        this.designation = designation;
        return this;
    }
}
