package fr.goodfood.mapper.profiles;

import org.modelmapper.ModelMapper;

import fr.goodfood.dto.composition.CompositionCreateDto;
import fr.goodfood.dto.composition.CompositionDto;
import fr.goodfood.entity.Composition;

public class CompositionProfile {
    
    public ModelMapper setup(ModelMapper modelMapper){
        modelMapper.createTypeMap(Composition.class, CompositionDto.class).addMappings(mapper -> {
            mapper.map(Composition::getQuantite, CompositionDto::setQuantite);
        });
        modelMapper.createTypeMap(CompositionCreateDto.class, Composition.class).addMappings(mapper -> {
            mapper.map(CompositionCreateDto::getId, Composition::setId);
            mapper.map(CompositionCreateDto::getQuantite, Composition::setQuantite);
        });
        return modelMapper;
    }
}
