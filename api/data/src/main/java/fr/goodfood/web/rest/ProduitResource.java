package fr.goodfood.web.rest;

import fr.goodfood.dto.produit.ProduitDTO;
import fr.goodfood.entity.Produit;
import fr.goodfood.service.ProduitService;
import fr.goodfood.service.mapper.ProduitMapper;

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

import javax.inject.Inject;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/produits")
public class ProduitResource {

    @Autowired
    private ProduitService produitService;

    @Inject
    private ProduitMapper produitMapper;

    @PostMapping
    public EntityModel<ProduitDTO> create(@RequestBody Produit produitJson) {
        Produit produit = this.produitService.create(produitJson);
        ProduitDTO produitDto = this.produitMapper.toDto(produit);

        return EntityModel.of(produitDto, linkTo(methodOn(ProduitResource.class).create(produit)).withSelfRel());
    }

    @PutMapping
    public EntityModel<ProduitDTO> update(@RequestBody Produit produitJson) {
        Produit produit = this.produitService.update(produitJson);
        ProduitDTO produitDTO = this.produitMapper.toDto(produit);

        return EntityModel.of(produitDTO, linkTo(methodOn(ProduitResource.class).update(produit)).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<ProduitDTO> one(@PathVariable Long id) {
        Produit produit = this.produitService.one(id);
        ProduitDTO produitDto = this.produitMapper.toDto(produit);

        return EntityModel.of(produitDto, linkTo(methodOn(ProduitResource.class).one(id)).withSelfRel(),
                linkTo(methodOn(ProduitResource.class).all()).withRel("produits"));
    }

    @GetMapping
    public CollectionModel<ProduitDTO> all() {
        List<Produit> produits = this.produitService.all();
        List<ProduitDTO> produitsDto = this.produitMapper.toDtos(produits);

        return CollectionModel.of(produitsDto, linkTo(methodOn(ProduitResource.class).all()).withSelfRel());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.produitService.delete(id);
    }
}
