package fr.goodfood.web.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.goodfood.dto.commande.SimpleCommandeDTO;
import fr.goodfood.dto.panier.CommandePanierDto;
import fr.goodfood.entity.Commande;
import fr.goodfood.service.CommandeService;
import fr.goodfood.service.mapper.CommandeMapper;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

@RestController
@RequestMapping("api/commandes")
public class CommandeRessource {
    
    @Autowired
    private CommandeService commandeService;

    @Inject
    CommandeMapper commandeMapper;

    @PostMapping
    public EntityModel<SimpleCommandeDTO> create(@RequestBody Commande nouvelleCommande){
        Commande commande = this.commandeService.create(nouvelleCommande);

        return EntityModel.of(this.commandeMapper.toSimpleDto(commande),
            linkTo(methodOn(CommandeRessource.class).create(nouvelleCommande)).withSelfRel()
        );
    }

    // @PutMapping
    // public EntityModel<CommandeDto> update(@RequestBody CommandeUpdateDto commandeUpdateDto){
    //     Commande commande = this.commandeService.update(this.modelMapper.map(commandeUpdateDto, Commande.class));

    //     return EntityModel.of(this.modelMapper.map(commande, CommandeDto.class),
    //         linkTo(methodOn(CommandeRessource.class).update(commandeUpdateDto)).withSelfRel()
    //     );
    // }

    @GetMapping("/{id}")
    public EntityModel<SimpleCommandeDTO> one(@PathVariable Long id){
        Commande commande = this.commandeService.one(id);

        return EntityModel.of(this.commandeMapper.toSimpleDto(commande),
            linkTo(methodOn(CommandeRessource.class).one(id)).withSelfRel(),
            linkTo(methodOn(CommandeRessource.class).all()).withRel("commandes")
        );
    }

    @GetMapping
    public CollectionModel<SimpleCommandeDTO> all(){
        List<Commande> commandes = this.commandeService.all();

        return CollectionModel.of(
            this.commandeMapper.toSimpleDtos(commandes),
            linkTo(methodOn(CommandeRessource.class).all()).withSelfRel()
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.commandeService.delete(id);
    }

    @GetMapping("/{id}/panier")
    public EntityModel<CommandePanierDto> panier(@PathVariable Long id){
        CommandePanierDto commande = this.commandeService.panier(id);

        return EntityModel.of(commande,
            linkTo(methodOn(CommandeRessource.class).panier(id)).withSelfRel(),
            linkTo(methodOn(CommandeRessource.class).one(id)).withRel("commande"),
            linkTo(methodOn(CommandeRessource.class).all()).withRel("commandes")
        ); 
    }
}
