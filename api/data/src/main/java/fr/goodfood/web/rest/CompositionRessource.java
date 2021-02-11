package fr.goodfood.web.rest;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import com.google.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.goodfood.dto.composition.SimpleCompositionDTO;
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
    public CollectionModel<Composition> all(){
        List<Composition> compositions = this.compositionService.all();

        return CollectionModel.of(
            compositions,
            // this.compositionMapper.toSimpleDtos(compositions),
            linkTo(methodOn(CommandeRessource.class).all()).withSelfRel()
        );
    }

    @PostMapping
    public EntityModel<Composition> create(@RequestBody Composition nouvelleComposition){
        Composition composition = this.compositionService.create(nouvelleComposition);

        return EntityModel.of(
            composition,
            // this.compositionMapper.toSimpleDto(composition),
            linkTo(methodOn(CompositionRessource.class).create(nouvelleComposition)).withSelfRel()
        );
    }
}
