package fr.goodfood.service.mapper;

import fr.goodfood.dto.produit.ProduitDTO;
import fr.goodfood.dto.produit.SimpleProduitDTO;
import fr.goodfood.entity.Produit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        CategorieMapper.class
})
public interface ProduitMapper extends EntityMapper<ProduitDTO, SimpleProduitDTO, Produit> {
}
