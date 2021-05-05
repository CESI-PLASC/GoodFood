package fr.goodfood.web.rest;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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

import fr.goodfood.dto.localisation.LocalisationDTO;
import fr.goodfood.entity.Localisation;
import fr.goodfood.entity.keys.LocalisationKey;
import fr.goodfood.service.LocalisationService;
import fr.goodfood.service.mapper.LocalisationMapper;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/localisations")
public class LocalisationResource {
    @Autowired
    private LocalisationService localisationService;

    @Inject
    private LocalisationMapper localisationMapper;

    @GetMapping
    public CollectionModel<LocalisationDTO> all() {
        List<Localisation> localisations = this.localisationService.all();
        List<LocalisationDTO> localisationsDto = this.localisationMapper.toDtos(localisations);

        return CollectionModel.of(localisationsDto, linkTo(methodOn(LocalisationResource.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<LocalisationDTO> one(@PathVariable String id) {
        System.out.println(id);
        // Récupération de la clé primaire
        Pattern pattern = Pattern.compile("^([0-9]+)_([0-9]+)$");
        Matcher matcher = pattern.matcher(id);
        matcher.find();
        LocalisationKey key = new LocalisationKey(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)));

        Localisation localisation = this.localisationService.one(key);
        LocalisationDTO localisationDto = this.localisationMapper.toDto(localisation);

        return EntityModel.of(localisationDto, linkTo(methodOn(LocalisationResource.class).one(id)).withSelfRel(),
                linkTo(methodOn(LocalisationResource.class).all()).withRel("localisations"));
    }

    @PostMapping
    public EntityModel<LocalisationDTO> create(@RequestBody Localisation localisationJson) {
        Localisation localisation = this.localisationService.create(localisationJson);
        LocalisationDTO localisationDto = this.localisationMapper.toDto(localisation);

        return EntityModel.of(localisationDto,
                linkTo(methodOn(LocalisationResource.class).create(localisation)).withSelfRel());
    }
}
