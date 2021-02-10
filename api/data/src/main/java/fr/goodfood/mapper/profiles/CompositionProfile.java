package fr.goodfood.mapper.profiles;

import org.modelmapper.ModelMapper;

import fr.goodfood.dto.composition.CompositionBase;
import fr.goodfood.dto.composition.CompositionCreateDto;
import fr.goodfood.dto.composition.CompositionDto;
import fr.goodfood.entity.Composition;

public class CompositionProfile{
    
    public CompositionProfile(ModelMapper modelMapper){

        // Base
        modelMapper.createTypeMap(Composition.class, CompositionBase.class);
        modelMapper.createTypeMap(CompositionBase.class, Composition.class);

        // Dto
        modelMapper.createTypeMap(Composition.class, CompositionDto.class);
        modelMapper.createTypeMap(CompositionCreateDto.class, Composition.class);
    }
}
