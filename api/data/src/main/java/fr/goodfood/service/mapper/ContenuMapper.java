package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.contenu.ContenuDTO;
import fr.goodfood.dto.contenu.SimpleContenuDTO;
import fr.goodfood.entity.Contenu;

@Mapper(componentModel = "spring", uses = { FormuleMapper.class, ContientMapper.class })
public interface ContenuMapper extends EntityMapper<ContenuDTO, SimpleContenuDTO, Contenu> {

}
