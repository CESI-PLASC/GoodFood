package fr.goodfood.web.rest;

import fr.goodfood.entity.Produit;
import fr.goodfood.service.ProduitService;
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

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/produits")
public class ProduitResource {
    
    @Autowired
    private ProduitService produitService;

    @PostMapping
    public EntityModel<Produit> create(@RequestBody Produit produit){
        Produit newProduit = this.produitService.create(produit);

        return EntityModel.of(newProduit,
                linkTo(methodOn(ProduitResource.class).create(produit)).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<Produit> update(@RequestBody Produit produit){
        Produit updatedProduit = this.produitService.update(produit);

        return EntityModel.of(updatedProduit,
                linkTo(methodOn(ProduitResource.class).update(produit)).withSelfRel()
        );
    }

    @GetMapping("/{id}")
    public EntityModel<Produit> one(@PathVariable Long id){
        Produit produit = this.produitService.one(id);

        return EntityModel.of(produit,
                linkTo(methodOn(ProduitResource.class).one(id)).withSelfRel(),
                linkTo(methodOn(ProduitResource.class).all()).withRel("produits")
        );
    }

    @GetMapping
    public CollectionModel<Produit> all(){
        List<Produit> produits = this.produitService.all();

        return CollectionModel.of(produits,
                linkTo(methodOn(ProduitResource.class).all()).withSelfRel()
        );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.produitService.delete(id);
    }
}
