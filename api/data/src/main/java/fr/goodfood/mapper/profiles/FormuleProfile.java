package fr.goodfood.mapper.profiles;

import org.modelmapper.ModelMapper;

import fr.goodfood.dto.formule.FormuleCreateDto;
import fr.goodfood.dto.formule.FormuleDto;
import fr.goodfood.dto.formule.FormuleUpdateDto;
import fr.goodfood.entity.Formule;

public class FormuleProfile{
    
    public FormuleProfile(ModelMapper modelMapper){
        modelMapper.createTypeMap(Formule.class, FormuleDto.class);
        modelMapper.createTypeMap(FormuleCreateDto.class, Formule.class);
        modelMapper.createTypeMap(FormuleUpdateDto.class, Formule.class);
    }
}
