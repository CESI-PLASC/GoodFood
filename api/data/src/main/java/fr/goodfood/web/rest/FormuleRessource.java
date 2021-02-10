package fr.goodfood.web.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import fr.goodfood.dto.formule.FormuleCreateDto;
import fr.goodfood.dto.formule.FormuleDto;
import fr.goodfood.dto.formule.FormuleUpdateDto;
import fr.goodfood.entity.Formule;
import fr.goodfood.service.FormuleService;

@RestController
@RequestMapping("api/formules")
public class FormuleRessource {
    @Autowired
    private FormuleService formuleService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public CollectionModel<FormuleDto> all(){
        List<Formule> formules = this.formuleService.all();

        return CollectionModel.of(
            formules.stream().map((Formule composition) -> this.modelMapper.map(composition, FormuleDto.class)).collect(Collectors.toList()),
            linkTo(methodOn(FormuleRessource.class).all()).withSelfRel()
        );
    }

    @GetMapping("/{id}")
    public EntityModel<FormuleDto> one(@PathVariable Long id){
        Formule formule = this.formuleService.one(id);

        return EntityModel.of(this.modelMapper.map(formule, FormuleDto.class),
            linkTo(methodOn(FormuleRessource.class).one(id)).withSelfRel(),
            linkTo(methodOn(FormuleRessource.class).all()).withRel("formules")
        );
    }

    @PostMapping
    public EntityModel<FormuleDto> create(@RequestBody FormuleCreateDto formuleCreateDto){
        Formule formule = this.formuleService.create(
            this.modelMapper.map(formuleCreateDto, Formule.class)
        );

        return EntityModel.of(this.modelMapper.map(formule, FormuleDto.class), 
            linkTo(methodOn(FormuleRessource.class).create(formuleCreateDto)).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<FormuleDto> update(@RequestBody FormuleUpdateDto formuleUpdateDto){
        Formule formule = this.formuleService.update(
            this.modelMapper.map(formuleUpdateDto, Formule.class)
        );

        return EntityModel.of(
            this.modelMapper.map(formule, FormuleDto.class),
            linkTo(methodOn(FormuleRessource.class).update(formuleUpdateDto)).withSelfRel()
        );
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.formuleService.delete(id);
    }
}
