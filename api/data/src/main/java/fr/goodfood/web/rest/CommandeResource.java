package fr.goodfood.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.goodfood.entity.Commande;
import fr.goodfood.service.CommandeService;

@RestController
@RequestMapping("api/commandes")
public class CommandeResource {
    
    @Autowired
    private CommandeService commandeService;

    @PostMapping
    public EntityModel<Commande> create(@RequestBody Commande commande){
        Commande newCommande = this.commandeService.create(commande);

        return EntityModel.of(newCommande, 
            linkTo(methodOn(CommandeResource.class).create(commande)).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<Commande> update(@RequestBody Commande commande){
        Commande updatedCommande = this.commandeService.update(commande);

        return EntityModel.of(updatedCommande,
            linkTo(methodOn(CommandeResource.class).update(commande)).withSelfRel()
        );
    }

    @GetMapping("/{id}")
    public EntityModel<Commande> one(@PathVariable Long id){
        Commande commande = this.commandeService.one(id);

        return EntityModel.of(commande,
            linkTo(methodOn(CommandeResource.class).one(id)).withSelfRel(),
            linkTo(methodOn(CommandeResource.class).all()).withRel("commandes")
        );
    }

    @GetMapping
    public CollectionModel<Commande> all(){
        List<Commande> commandes = this.commandeService.all();

        return CollectionModel.of(commandes,
            linkTo(methodOn(CommandeResource.class).all()).withSelfRel()
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.commandeService.delete(id);
    }
}
