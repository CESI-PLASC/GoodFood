package fr.goodfood.service.mapper.panier;

import org.mapstruct.Mapper;

import fr.goodfood.dto.panier.CommandePanierDto;
import fr.goodfood.entity.Commande;

@Mapper(componentModel = "spring")
public interface PanierMapper {
    
    CommandePanierDto toDto(Commande commande);
}
