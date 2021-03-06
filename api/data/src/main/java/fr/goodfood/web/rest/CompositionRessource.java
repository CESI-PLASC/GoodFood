package fr.goodfood.web.rest;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.goodfood.dto.composition.CompositionDTO;
import fr.goodfood.entity.Composition;
import fr.goodfood.service.CompositionService;
import fr.goodfood.service.mapper.CompositionMapper;

@RestController
@RequestMapping("api/compositions")
public class CompositionRessource {

    @Autowired
    private CompositionService compositionService;

    @Inject
    CompositionMapper compositionMapper;

    @GetMapping
    public CollectionModel<CompositionDTO> all() {
        List<Composition> compositions = this.compositionService.all();
        List<CompositionDTO> compositionsDto = this.compositionMapper.toDtos(compositions);

        return CollectionModel.of(compositionsDto, linkTo(methodOn(CommandeRessource.class).all()).withSelfRel());
    }

    @GetMapping("/commandes/{idCommande}")
    public CollectionModel<CompositionDTO> commande(@PathVariable Long idCommande) {
        List<Composition> compositions = this.compositionService.commande(idCommande);
        List<CompositionDTO> compositionsDto = this.compositionMapper.toDtos(compositions);

        return CollectionModel.of(compositionsDto,
                linkTo(methodOn(CompositionRessource.class).commande(idCommande)).withSelfRel());
    }

    // @PostMapping
    // public EntityModel<CompositionDTO> create(@RequestBody Composition
    // compositionJson) {
    // Composition composition = this.compositionService.create(compositionJson);
    // CompositionDTO compositionDto = this.compositionMapper.toDto(composition);

    // return EntityModel.of(compositionDto,
    // linkTo(methodOn(CompositionRessource.class).create(compositionJson)).withSelfRel());
    // }
}
