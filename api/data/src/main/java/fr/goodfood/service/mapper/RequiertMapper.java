package fr.goodfood.service.mapper;

import org.mapstruct.Mapper;

import fr.goodfood.dto.requiert.RequiertDTO;
import fr.goodfood.dto.requiert.RequiertSDTO;
import fr.goodfood.entity.Requiert;

@Mapper(componentModel = "spring", uses = { CategorieMapper.class })
public interface RequiertMapper extends EntityMapper<RequiertDTO, RequiertSDTO, Requiert> {

}
