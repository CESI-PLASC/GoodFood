package fr.goodfood.web.rest;

import fr.goodfood.entity.Categorie;
import fr.goodfood.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/categories")
public class CategorieResource {

    @Autowired
    private CategorieService categorieService;

    @GetMapping
    public CollectionModel<Categorie> all(){
        List<Categorie> categories = this.categorieService.all();

        return CollectionModel.of(categories,
                linkTo(methodOn(CategorieResource.class).all()).withSelfRel()
        );
    }
}