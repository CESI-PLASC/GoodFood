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

import fr.goodfood.dto.commande.CommandeCreateDto;
import fr.goodfood.dto.commande.CommandeDto;
import fr.goodfood.dto.commande.CommandeUpdateDto;
import fr.goodfood.entity.Commande;
import fr.goodfood.service.CommandeService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/commandes")
public class CommandeRessource {
    
    @Autowired
    private CommandeService commandeService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public EntityModel<CommandeDto> create(@RequestBody CommandeCreateDto commandeCreateDto){
        Commande commande = this.commandeService.create(this.modelMapper.map(commandeCreateDto, Commande.class));

        return EntityModel.of(this.modelMapper.map(commande, CommandeDto.class),
            linkTo(methodOn(CommandeRessource.class).create(commandeCreateDto)).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<CommandeDto> update(@RequestBody CommandeUpdateDto commandeUpdateDto){
        Commande commande = this.commandeService.update(this.modelMapper.map(commandeUpdateDto, Commande.class));

        return EntityModel.of(this.modelMapper.map(commande, CommandeDto.class),
            linkTo(methodOn(CommandeRessource.class).update(commandeUpdateDto)).withSelfRel()
        );
    }

    @GetMapping("/{id}")
    public EntityModel<CommandeDto> one(@PathVariable Long id){
        Commande commande = this.commandeService.one(id);

        return EntityModel.of(this.modelMapper.map(commande, CommandeDto.class),
            linkTo(methodOn(CommandeRessource.class).one(id)).withSelfRel(),
            linkTo(methodOn(CommandeRessource.class).all()).withRel("commandes")
        );
    }

    @GetMapping
    public CollectionModel<CommandeDto> all(){
        List<Commande> commandes = this.commandeService.all();

        return CollectionModel.of(
            commandes.stream().map((Commande commande) -> this.modelMapper.map(commande, CommandeDto.class)).collect(Collectors.toList()),
            linkTo(methodOn(CommandeRessource.class).all()).withSelfRel()
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.commandeService.delete(id);
    }
}
