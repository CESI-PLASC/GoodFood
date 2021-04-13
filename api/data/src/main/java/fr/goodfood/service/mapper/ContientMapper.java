package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.contient.ContientDTO;
import fr.goodfood.dto.contient.SimpleContientDTO;
import fr.goodfood.entity.Contient;

@Mapper(componentModel = "spring", uses = { ContenuMapper.class, ProduitMapper.class })
public interface ContientMapper extends EntityMapper<ContientDTO, SimpleContientDTO, Contient> {

}
