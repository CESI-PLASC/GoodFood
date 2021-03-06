package fr.goodfood.web.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.goodfood.dto.commande.CommandeDTO;
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

    @GetMapping
    public CollectionModel<CommandeDTO> all() {
        List<Commande> commandes = this.commandeService.all();
        List<CommandeDTO> commandesDto = this.commandeMapper.toDtos(commandes);

        return CollectionModel.of(commandesDto, linkTo(methodOn(CommandeRessource.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<CommandeDTO> one(@PathVariable Long id) {
        Commande commande = this.commandeService.one(id);
        CommandeDTO commandeDto = this.commandeMapper.toDto(commande);

        return EntityModel.of(commandeDto, linkTo(methodOn(CommandeRessource.class).one(id)).withSelfRel(),
                linkTo(methodOn(CommandeRessource.class).all()).withRel("commandes"));
    }

    @PostMapping
    public EntityModel<CommandeDTO> create(@RequestBody Commande commandeJson) {
        Commande commande = this.commandeService.create(commandeJson);
        CommandeDTO commandeDto = this.commandeMapper.toDto(commande);

        return EntityModel.of(commandeDto,
                linkTo(methodOn(CommandeRessource.class).create(commandeJson)).withSelfRel());
    }

    @PutMapping("/{id}")
    public EntityModel<CommandeDTO> update(@PathVariable Long id, @RequestBody Commande commandeJson) {
        Commande commande = this.commandeService.update(commandeJson);
        CommandeDTO commandeDto = this.commandeMapper.toDto(commande);

        return EntityModel.of(commandeDto,
                linkTo(methodOn(CommandeRessource.class).update(id, commandeJson)).withSelfRel());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.commandeService.delete(id);
    }

    @GetMapping("/{id}/panier")
    public EntityModel<CommandePanierDto> panier(@PathVariable Long id) {
        CommandePanierDto commande = this.commandeService.panier(id);

        return EntityModel.of(commande, linkTo(methodOn(CommandeRessource.class).panier(id)).withSelfRel(),
                linkTo(methodOn(CommandeRessource.class).one(id)).withRel("commande"),
                linkTo(methodOn(CommandeRessource.class).all()).withRel("commandes"));
    }
}
