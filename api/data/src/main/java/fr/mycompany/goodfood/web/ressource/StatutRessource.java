package fr.mycompany.goodfood.web.ressource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import fr.mycompany.goodfood.entity.Statut;
import fr.mycompany.goodfood.service.StatutService;

@RestController
public class StatutRessource {
    
    @Autowired
    private StatutService statutService;

    @GetMapping("/statuts")
    public CollectionModel<Statut> all(){
        List<Statut> statuts = this.statutService.all();

        return CollectionModel.of(statuts, 
            linkTo(methodOn(StatutRessource.class).all()).withSelfRel()
        );
    }
}
