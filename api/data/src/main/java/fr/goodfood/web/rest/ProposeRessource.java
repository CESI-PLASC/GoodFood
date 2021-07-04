package fr.goodfood.web.rest;

import fr.goodfood.dto.propose.ProposeDTO;
import fr.goodfood.entity.Propose;
import fr.goodfood.service.ProposeService;
import fr.goodfood.service.mapper.ProposeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.inject.Inject;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/propose")
public class ProposeRessource {

    @Autowired
    private ProposeService proposeService;

    @Inject
    private ProposeMapper proposeMapper;

    @PostMapping
    public EntityModel<ProposeDTO> create(@RequestBody Propose proposeJson) {
        Propose propose = this.proposeService.create(proposeJson);
        ProposeDTO proposeDto = this.proposeMapper.toDto(propose);

        return EntityModel.of(proposeDto, linkTo(methodOn(ProposeRessource.class).create(propose)).withSelfRel());
    }

    @GetMapping
    public CollectionModel<ProposeDTO> all() {
        List<Propose> propose = this.proposeService.all();
        List<ProposeDTO> proposeDto = this.proposeMapper.toDtos(propose);
        return CollectionModel.of(proposeDto, linkTo(methodOn(ProposeService.class).all()).withSelfRel());
    }

}
