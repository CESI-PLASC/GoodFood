package fr.mycompany.goodfood.mapper.profiles;

import org.modelmapper.ModelMapper;

import fr.mycompany.goodfood.dto.commande.CommandeCreateDto;
import fr.mycompany.goodfood.dto.commande.CommandeDto;
import fr.mycompany.goodfood.dto.commande.CommandeUpdateDto;
import fr.mycompany.goodfood.entity.Commande;

public class CommandeProfile {
    
    public ModelMapper setup(ModelMapper modelMapper){
        modelMapper.createTypeMap(Commande.class, CommandeDto.class).addMappings(mapper -> {
            mapper.map(Commande::getDateCreation, CommandeDto::setDateCreation);
            mapper.map(Commande::getDateDonnee, CommandeDto::setDateDonnee);
        });
        modelMapper.createTypeMap(CommandeCreateDto.class, Commande.class).addMappings(mapper -> {
            mapper.map(CommandeCreateDto::getDateCreation, Commande::setDateCreation);
            mapper.map(CommandeCreateDto::getDateDonnee, Commande::setDateDonnee);
        });
        modelMapper.createTypeMap(CommandeUpdateDto.class, Commande.class).addMappings(mapper -> {
            mapper.map(CommandeUpdateDto::getDateCreation, Commande::setDateCreation);
            mapper.map(CommandeUpdateDto::getDateDonnee, Commande::setDateDonnee);
            mapper.map(CommandeUpdateDto::getId, Commande::setId);
        });
        return modelMapper;
    }
}