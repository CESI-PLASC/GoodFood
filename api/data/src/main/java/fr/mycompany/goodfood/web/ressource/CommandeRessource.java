package fr.mycompany.goodfood.web.ressource;

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
import org.springframework.web.bind.annotation.RestController;

import fr.mycompany.goodfood.entity.Commande;
import fr.mycompany.goodfood.service.CommandeService;

@RestController
public class CommandeRessource {
    
    @Autowired
    private CommandeService commandeService;

    @PostMapping("/commandes")
    public EntityModel<Commande> create(@RequestBody Commande commande){
        Commande newCommande = this.commandeService.create(commande);

        return EntityModel.of(newCommande, 
            linkTo(methodOn(CommandeRessource.class).create(commande)).withSelfRel()
        );
    }

    @PutMapping("/commandes")
    public EntityModel<Commande> update(@RequestBody Commande commande){
        Commande updatedCommande = this.commandeService.update(commande);

        return EntityModel.of(updatedCommande,
            linkTo(methodOn(CommandeRessource.class).update(commande)).withSelfRel()
        );
    }

    @GetMapping("/commandes/{id}")
    public EntityModel<Commande> one(@PathVariable Long id){
        Commande commande = this.commandeService.one(id);

        return EntityModel.of(commande,
            linkTo(methodOn(CommandeRessource.class).one(id)).withSelfRel(),
            linkTo(methodOn(CommandeRessource.class).all()).withRel("commandes")
        );
    }

    @GetMapping("commandes")
    public CollectionModel<Commande> all(){
        List<Commande> commandes = this.commandeService.all();

        return CollectionModel.of(commandes,
            linkTo(methodOn(CommandeRessource.class).all()).withSelfRel()
        );
    }

    @DeleteMapping("commandes/{id}")
    public void delete(@PathVariable Long id){
        this.commandeService.delete(id);
    }
}
