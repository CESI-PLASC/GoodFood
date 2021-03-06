package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.commande.CommandeDTO;
import fr.goodfood.dto.commande.SimpleCommandeDTO;
import fr.goodfood.entity.Commande;

@Mapper(componentModel = "spring", uses = { CompositionMapper.class, FranchiseMapper.class })
public interface CommandeMapper extends EntityMapper<CommandeDTO, SimpleCommandeDTO, Commande> {

}
