package fr.goodfood.web.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import fr.goodfood.dto.franchise.FranchiseDTO;
import fr.goodfood.entity.Franchise;
import fr.goodfood.service.FranchiseService;
import fr.goodfood.service.mapper.FranchiseMapper;

@RestController
@RequestMapping("/api/franchises")
public class FranchiseRessource {

    @Autowired
    private FranchiseService franchiseService;

    @Inject
    private FranchiseMapper franchiseMapper;

    @GetMapping
    public CollectionModel<FranchiseDTO> all() {
        List<Franchise> franchises = this.franchiseService.all();
        List<FranchiseDTO> franchisesDto = this.franchiseMapper.toDtos(franchises);

        return CollectionModel.of(franchisesDto, linkTo(methodOn(FormuleRessource.class).all()).withSelfRel());
    }

    @PostMapping
    public EntityModel<FranchiseDTO> create(@RequestBody Franchise franchiseJson) {
        Franchise franchise = this.franchiseService.create(franchiseJson);
        FranchiseDTO franchiseDto = this.franchiseMapper.toDto(franchise);

        return EntityModel.of(franchiseDto, linkTo(methodOn(FranchiseRessource.class).create(franchise)).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<FranchiseDTO> one(@PathVariable Long id) {
        Franchise franchise = this.franchiseService.one(id);
        FranchiseDTO franchiseDto = this.franchiseMapper.toDto(franchise);

        return EntityModel.of(franchiseDto, linkTo(methodOn(FranchiseRessource.class).one(id)).withSelfRel(),
                linkTo(methodOn(FranchiseRessource.class).all()).withRel("franchises"));
    }
}
