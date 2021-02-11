package fr.goodfood.service.mapper;

import fr.goodfood.dto.categorie.CategorieDTO;
import fr.goodfood.dto.categorie.SimpleCategorieDTO;
import fr.goodfood.entity.Categorie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        ProduitMapper.class,
        FranchiseMapper.class
})
public interface CategorieMapper extends EntityMapper<CategorieDTO, SimpleCategorieDTO, Categorie> {
}
