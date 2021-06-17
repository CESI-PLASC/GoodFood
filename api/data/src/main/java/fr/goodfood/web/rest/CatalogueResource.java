package fr.goodfood.web.rest;

import fr.goodfood.dto.categorie.CategorieDTO;
import fr.goodfood.service.CatalogueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.goodfood.service.mapper.CategorieMapper;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import fr.goodfood.entity.Categorie;

import java.util.List;
import javax.inject.Inject;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
@RequestMapping("/api")
public class CatalogueResource {

    @Autowired
    CatalogueService catalogueService;

    @Inject
    CategorieMapper categorieMapper;

    // @GetMapping("/franchises/{id}/catalogue")
    // public CollectionModel<CategorieDTO> getCatalogueByFranchiseId(@PathVariable String id) {
    //     List<Categorie> categories = catalogueService.getAllCategoriesByFranchise(Long.parseLong(id));
    //     List<CategorieDTO> categoriesDto = this.categorieMapper.toDtos(categories);
        
    //     return CollectionModel.of(categoriesDto, 
    //         linkTo(methodOn(CatalogueResource.class).getCatalogueByFranchiseId(id)).withSelfRel()
    //     );
    // }
    @GetMapping("/franchises/{id}/catalogue")
    public ResponseEntity<List<CategorieDTO>> getCatalogueByFranchiseId(@PathVariable String id) {
        List<CategorieDTO> result = catalogueService.getCatalogueByFranchiseId(Long.parseLong(id));
        return ResponseEntity.ok().body(result);
    }
}
