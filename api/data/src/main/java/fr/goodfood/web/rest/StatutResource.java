package fr.goodfood.web.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import fr.goodfood.dto.statut.StatutDTO;
import fr.goodfood.entity.Statut;
import fr.goodfood.service.StatutService;
import fr.goodfood.service.mapper.StatutMapper;

@RestController
@RequestMapping("api/statuts")
public class StatutResource {

    @Autowired
    private StatutService statutService;

    @Inject
    private StatutMapper statutMapper;

    @GetMapping
    public CollectionModel<StatutDTO> all() {
        List<Statut> statuts = this.statutService.all();
        List<StatutDTO> statutsDto = this.statutMapper.toDtos(statuts);

        return CollectionModel.of(statutsDto, linkTo(methodOn(StatutResource.class).all()).withSelfRel());
    }
}
