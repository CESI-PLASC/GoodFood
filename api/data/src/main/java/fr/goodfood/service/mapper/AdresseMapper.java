package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.adresse.AdresseDTO;
import fr.goodfood.dto.adresse.SimpleAdresseDTO;
import fr.goodfood.entity.Adresse;

@Mapper(componentModel = "spring")
public interface AdresseMapper extends EntityMapper<AdresseDTO, SimpleAdresseDTO, Adresse> {

}
