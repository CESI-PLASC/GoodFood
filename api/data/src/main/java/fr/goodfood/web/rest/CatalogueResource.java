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

import java.util.List;


@RestController
@RequestMapping("/api")
public class CatalogueResource {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CatalogueService catalogueService;

    @GetMapping("/franchises/{id}/catalogue")
    public ResponseEntity<List<CategorieDTO>> getCatalogueByFranchiseId(@PathVariable String id) {
        log.debug("Request to get catalogue by franchise with id {}", id);
        List<CategorieDTO> result = catalogueService.getCatalogueByFranchiseId(Long.parseLong(id));
        return ResponseEntity.ok().body(result);
    }
}
