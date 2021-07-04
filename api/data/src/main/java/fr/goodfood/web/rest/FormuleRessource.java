package fr.goodfood.web.rest;

import java.util.List;

import javax.inject.Inject;

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

import fr.goodfood.dto.formule.FormuleDTO;
import fr.goodfood.entity.Formule;
import fr.goodfood.service.FormuleService;
import fr.goodfood.service.mapper.FormuleMapper;

@RestController
@RequestMapping("api/formules")
public class FormuleRessource {
    @Autowired
    private FormuleService formuleService;

    @Inject
    private FormuleMapper formuleMapper;

    @GetMapping
    public CollectionModel<FormuleDTO> all() {
        List<Formule> formules = this.formuleService.all();
        List<FormuleDTO> formulesDto = this.formuleMapper.toDtos(formules);

        return CollectionModel.of(formulesDto, linkTo(methodOn(FormuleRessource.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<FormuleDTO> one(@PathVariable Long id) {
        Formule formule = this.formuleService.one(id);
        FormuleDTO formuleDto = this.formuleMapper.toDto(formule);

        return EntityModel.of(formuleDto, linkTo(methodOn(FormuleRessource.class).one(id)).withSelfRel(),
                linkTo(methodOn(FormuleRessource.class).all()).withRel("formules"));
    }

    @PostMapping
    public EntityModel<FormuleDTO> create(@RequestBody Formule formuleJson) {
        System.out.println(formuleJson);
        Formule formule = this.formuleService.create(formuleJson);
        FormuleDTO formuleDto = this.formuleMapper.toDto(formule);

        return EntityModel.of(formuleDto, linkTo(methodOn(FormuleRessource.class).create(formuleJson)).withSelfRel());
    }

    @PutMapping
    public EntityModel<FormuleDTO> update(@RequestBody Formule formuleJson) {
        Formule formule = this.formuleService.update(formuleJson);
        FormuleDTO formuleDto = this.formuleMapper.toDto(formule);

        return EntityModel.of(formuleDto, linkTo(methodOn(FormuleRessource.class).update(formuleJson)).withSelfRel());
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.formuleService.delete(id);
    }
}
