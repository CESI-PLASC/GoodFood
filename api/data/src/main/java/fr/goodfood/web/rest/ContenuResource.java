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

import fr.goodfood.dto.contenu.ContenuDTO;
import fr.goodfood.entity.Contenu;
import fr.goodfood.service.ContenuService;
import fr.goodfood.service.mapper.ContenuMapper;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/contenus")
public class ContenuResource {
    @Autowired
    private ContenuService contenuService;

    @Inject
    private ContenuMapper contenuMapper;

    @GetMapping
    public CollectionModel<ContenuDTO> all() {
        List<Contenu> contenus = this.contenuService.all();
        List<ContenuDTO> contenusDto = this.contenuMapper.toDtos(contenus);

        return CollectionModel.of(contenusDto, linkTo(methodOn(ContenuResource.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<ContenuDTO> one(@PathVariable Long id) {
        Contenu contenu = this.contenuService.one(id);
        ContenuDTO contenuDto = this.contenuMapper.toDto(contenu);

        return EntityModel.of(contenuDto, linkTo(methodOn(ContenuResource.class).one(id)).withSelfRel(),
                linkTo(methodOn(ContenuResource.class).all()).withRel("contenus"));
    }

    @PostMapping
    public EntityModel<ContenuDTO> create(@RequestBody Contenu contenuJson) {
        Contenu contenu = this.contenuService.save(contenuJson);
        ContenuDTO contenuDto = this.contenuMapper.toDto(contenu);

        return EntityModel.of(contenuDto, linkTo(methodOn(ContenuResource.class).create(contenuJson)).withSelfRel());
    }

    @PutMapping("/{id}")
    public EntityModel<ContenuDTO> update(@PathVariable Long id, @RequestBody Contenu contenuJson) {
        Contenu contenu = this.contenuService.save(contenuJson);
        ContenuDTO contenuDto = this.contenuMapper.toDto(contenu);

        return EntityModel.of(contenuDto,
                linkTo(methodOn(ContenuResource.class).update(id, contenuJson)).withSelfRel());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.contenuService.delete(id);
    }
}
