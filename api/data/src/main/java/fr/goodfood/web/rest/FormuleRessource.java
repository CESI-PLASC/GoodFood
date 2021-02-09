package fr.goodfood.web.rest;

import java.util.List;

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

import fr.goodfood.entity.Formule;
import fr.goodfood.service.FormuleService;

@RestController
@RequestMapping("api/formules")
public class FormuleRessource {
    @Autowired
    private FormuleService formuleService;

    @GetMapping
    public CollectionModel<Formule> all(){
        List<Formule> formules = this.formuleService.all();

        return CollectionModel.of(formules,
            linkTo(methodOn(FormuleRessource.class).all()).withSelfRel()
        );
    }

    @GetMapping("/{id}")
    public EntityModel<Formule> one(@PathVariable Long id){
        Formule formule = this.formuleService.one(id);

        return EntityModel.of(formule,
            linkTo(methodOn(FormuleRessource.class).one(id)).withSelfRel(),
            linkTo(methodOn(FormuleRessource.class).all()).withRel("formules")
        );
    }

    @PostMapping
    public EntityModel<Formule> create(@RequestBody Formule formule){
        Formule nouvelleFormule = this.formuleService.create(formule);

        return EntityModel.of(nouvelleFormule, 
            linkTo(methodOn(FormuleRessource.class).create(formule)).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<Formule> update(@RequestBody Formule formule){
        Formule formuleModifiee = this.formuleService.update(formule);

        return EntityModel.of(formuleModifiee,
            linkTo(methodOn(FormuleRessource.class).update(formule)).withSelfRel()
        );
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.formuleService.delete(id);
    }
}
