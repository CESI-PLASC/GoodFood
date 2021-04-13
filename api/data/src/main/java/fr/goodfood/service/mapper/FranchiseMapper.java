package fr.goodfood.service.mapper;

import fr.goodfood.dto.franchise.FranchiseDTO;
import fr.goodfood.dto.franchise.SimpleFranchiseDTO;
import fr.goodfood.entity.Franchise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { CategorieMapper.class, AdresseMapper.class, CommandeMapper.class })
public interface FranchiseMapper extends EntityMapper<FranchiseDTO, SimpleFranchiseDTO, Franchise> {
}
