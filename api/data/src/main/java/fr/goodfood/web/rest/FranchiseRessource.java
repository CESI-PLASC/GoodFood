package fr.goodfood.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import fr.goodfood.entity.Franchise;
import fr.goodfood.service.FranchiseService;

@RestController
@RequestMapping("/api/franchises")
public class FranchiseRessource {

    @Autowired
    private FranchiseService franchiseService;

    @GetMapping
    public CollectionModel<Franchise> all() {
        List<Franchise> franchises = this.franchiseService.all();

        return CollectionModel.of(franchises, linkTo(methodOn(FormuleRessource.class).all()).withSelfRel());
    }

    @PostMapping
    public EntityModel<Franchise> create(@RequestBody Franchise franchise) {
        Franchise nouveauFranchise = this.franchiseService.create(franchise);

        return EntityModel.of(nouveauFranchise,
                linkTo(methodOn(FranchiseRessource.class).create(franchise)).withSelfRel());
    }
}
