package fr.goodfood.web.rest;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.goodfood.dto.composition.CompositionCreateDto;
import fr.goodfood.dto.composition.CompositionDto;
import fr.goodfood.entity.Composition;
import fr.goodfood.service.CompositionService;

@RestController
@RequestMapping("api/compositions")
public class CompositionRessource {
    
    @Autowired
    private CompositionService compositionService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public CollectionModel<CompositionDto> all(){
        List<Composition> compositions = this.compositionService.all();

        return CollectionModel.of(
            compositions.stream().map((Composition composition) -> this.modelMapper.map(composition, CompositionDto.class)).collect(Collectors.toList()),
            linkTo(methodOn(CommandeRessource.class).all()).withSelfRel()
        );
    }

    @PostMapping
    public EntityModel<CompositionDto> create(@RequestBody CompositionCreateDto compositionCreateDto){
        Composition composition = this.compositionService.create(
            this.modelMapper.map(compositionCreateDto, Composition.class)
        );

        return EntityModel.of(
            this.modelMapper.map(composition, CompositionDto.class),
            linkTo(methodOn(CompositionRessource.class).create(compositionCreateDto)).withSelfRel()
        );
    }
}
