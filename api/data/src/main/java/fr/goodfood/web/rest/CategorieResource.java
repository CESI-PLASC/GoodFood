package fr.goodfood.web.rest;

import fr.goodfood.dto.categorie.CategorieDTO;
import fr.goodfood.entity.Categorie;
import fr.goodfood.service.CategorieService;
import fr.goodfood.service.mapper.CategorieMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.inject.Inject;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/categories")
public class CategorieResource {

    @Autowired
    private CategorieService categorieService;

    @Inject
    CategorieMapper categorieMapper;

    @GetMapping
    public CollectionModel<CategorieDTO> all() {
        List<Categorie> categories = this.categorieService.all();

        return CollectionModel.of(this.categorieMapper.toDtos(categories), linkTo(methodOn(CategorieResource.class).all()).withSelfRel());
    }

    @PostMapping
    public EntityModel<CategorieDTO> create(@RequestBody Categorie categorie) {
        Categorie nouvelleCategorie = this.categorieService.create(categorie);

        return EntityModel.of(this.categorieMapper.toDto(nouvelleCategorie),
                linkTo(methodOn(CategorieResource.class).create(categorie)).withSelfRel());
    }
}
