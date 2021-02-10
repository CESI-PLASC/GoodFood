package fr.goodfood.mapper.profiles;

import org.modelmapper.ModelMapper;

import fr.goodfood.dto.commande.CommandeBase;
import fr.goodfood.dto.commande.CommandeCreateDto;
import fr.goodfood.dto.commande.CommandeDto;
import fr.goodfood.dto.commande.CommandeUpdateDto;
import fr.goodfood.entity.Commande;

public class CommandeProfile{
    
    public CommandeProfile(ModelMapper modelMapper){

        // Bases
        modelMapper.createTypeMap(Commande.class, CommandeBase.class);
        modelMapper.createTypeMap(CommandeBase.class, Commande.class);

        // // DTOs
        modelMapper.createTypeMap(Commande.class, CommandeDto.class);
        modelMapper.createTypeMap(CommandeCreateDto.class, Commande.class);
        modelMapper.createTypeMap(CommandeUpdateDto.class, Commande.class);
    }
}
