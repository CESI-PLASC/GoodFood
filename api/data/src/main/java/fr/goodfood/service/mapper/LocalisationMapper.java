package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.localisation.LocalisationDTO;
import fr.goodfood.dto.localisation.LocalisationSDTO;
import fr.goodfood.entity.Localisation;

@Mapper(componentModel = "spring", uses = { UtilisateurMapper.class, AdresseMapper.class })
public interface LocalisationMapper extends EntityMapper<LocalisationDTO, LocalisationSDTO, Localisation> {

}
