package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.composition.CompositionDTO;
import fr.goodfood.dto.composition.SimpleCompositionDTO;
import fr.goodfood.entity.Composition;

@Mapper(componentModel = "spring", uses = {})
public interface CompositionMapper extends EntityMapper<CompositionDTO, SimpleCompositionDTO, Composition> {
}
