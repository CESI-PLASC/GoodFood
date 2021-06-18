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

import fr.goodfood.dto.contient.ContientDTO;
import fr.goodfood.entity.Contient;
import fr.goodfood.entity.keys.ContientKey;
import fr.goodfood.service.ContientService;
import fr.goodfood.service.mapper.ContientMapper;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/contients")
public class ContientResource {
    @Autowired
    private ContientService contientService;

    @Inject
    private ContientMapper contientMapper;

    @GetMapping
    public CollectionModel<ContientDTO> all() {
        List<Contient> contients = this.contientService.all();
        List<ContientDTO> contientsDto = this.contientMapper.toDtos(contients);

        return CollectionModel.of(contientsDto, linkTo(methodOn(ContientResource.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<ContientDTO> one(@PathVariable String id) {
        ContientKey key = this.contientService.getKey(id);

        Contient contient = this.contientService.one(key);
        ContientDTO contientDto = this.contientMapper.toDto(contient);

        return EntityModel.of(contientDto, linkTo(methodOn(ContientResource.class).one(id)).withSelfRel(),
                linkTo(methodOn(ContientResource.class).all()).withRel("contient"));
    }

    @PostMapping
    public EntityModel<ContientDTO> create(@RequestBody Contient contientJson) {
        Contient contient = this.contientService.create(contientJson);
        ContientDTO contientDto = this.contientMapper.toDto(contient);

        return EntityModel.of(contientDto, linkTo(methodOn(ContientResource.class).create(contient)).withSelfRel());
    }

    @PutMapping
    public EntityModel<ContientDTO> update(@RequestBody Contient contientJson) {
        Contient contient = this.contientService.update(contientJson);
        ContientDTO contientDto = this.contientMapper.toDto(contient);

        return EntityModel.of(contientDto, linkTo(methodOn(ContientResource.class).update(contientJson)).withSelfRel());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        ContientKey key = this.contientService.getKey(id);

        this.contientService.delete(key);
    }
}
