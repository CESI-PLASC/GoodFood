package fr.goodfood.service.mapper;

import fr.goodfood.dto.franchise.FranchiseDTO;
import fr.goodfood.dto.franchise.SimpleFranchiseDTO;
import fr.goodfood.dto.produit.ProduitDTO;
import fr.goodfood.dto.produit.SimpleProduitDTO;
import fr.goodfood.entity.Franchise;
import fr.goodfood.entity.Produit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        CategorieMapper.class
})
public interface FranchiseMapper extends EntityMapper<FranchiseDTO, SimpleFranchiseDTO, Franchise> {
}
