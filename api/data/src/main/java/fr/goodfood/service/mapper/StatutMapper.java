package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.statut.SimpleStatutDTO;
import fr.goodfood.dto.statut.StatutDTO;
import fr.goodfood.entity.Statut;

@Mapper(componentModel = "spring", uses = { CommandeMapper.class })
public interface StatutMapper extends EntityMapper<StatutDTO, SimpleStatutDTO, Statut> {
}
