package fr.goodfood.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import fr.goodfood.entity.Statut;
import fr.goodfood.service.StatutService;

@RestController
@RequestMapping("api/status")
public class StatutResource {
    
    @Autowired
    private StatutService statutService;

    @GetMapping
    public CollectionModel<Statut> all(){
        List<Statut> statuts = this.statutService.all();

        return CollectionModel.of(statuts, 
            linkTo(methodOn(StatutResource.class).all()).withSelfRel()
        );
    }
}
