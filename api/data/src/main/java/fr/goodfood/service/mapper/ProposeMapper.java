package fr.goodfood.service.mapper;

import fr.goodfood.dto.propose.ProposeDTO;
import fr.goodfood.dto.propose.SimpleProposeDTO;
import fr.goodfood.entity.Propose;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { FormuleMapper.class, FranchiseMapper.class })
public interface ProposeMapper extends EntityMapper<ProposeDTO, SimpleProposeDTO, Propose> {

}
