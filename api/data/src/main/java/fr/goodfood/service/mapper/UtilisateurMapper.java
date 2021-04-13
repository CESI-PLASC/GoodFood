package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.utilisateur.UtilisateurDTO;
import fr.goodfood.dto.utilisateur.UtilisateurSDTO;
import fr.goodfood.entity.Utilisateur;

@Mapper(componentModel = "spring", uses = { LocalisationMapper.class, CommandeMapper.class })
public interface UtilisateurMapper extends EntityMapper<UtilisateurDTO, UtilisateurSDTO, Utilisateur> {

}
