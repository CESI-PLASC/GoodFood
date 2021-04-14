package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.formule.FormuleDTO;
import fr.goodfood.dto.formule.SimpleFormuleDTO;
import fr.goodfood.entity.Formule;

@Mapper(componentModel = "spring")
public interface FormuleMapper extends EntityMapper<FormuleDTO, SimpleFormuleDTO, Formule> {
}
