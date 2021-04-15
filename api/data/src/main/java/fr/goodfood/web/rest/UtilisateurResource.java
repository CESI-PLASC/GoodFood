package fr.goodfood.web.rest;

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

import fr.goodfood.dto.utilisateur.UtilisateurDTO;
import fr.goodfood.entity.Utilisateur;
import fr.goodfood.service.UtilisateurService;
import fr.goodfood.service.mapper.UtilisateurMapper;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import com.stripe.exception.StripeException;

@RestController
@RequestMapping("api/utilisateurs")
public class UtilisateurResource {

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private UtilisateurMapper utilisateurMapper;

    @GetMapping
    public CollectionModel<UtilisateurDTO> all() {
        List<Utilisateur> utilisateurs = this.utilisateurService.all();
        List<UtilisateurDTO> utilisateursDto = this.utilisateurMapper.toDtos(utilisateurs);

        return CollectionModel.of(utilisateursDto, linkTo(methodOn(UtilisateurResource.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public EntityModel<UtilisateurDTO> one(@PathVariable Long id) {
        Utilisateur utilisateur = this.utilisateurService.one(id);
        UtilisateurDTO utilisateurDto = this.utilisateurMapper.toDto(utilisateur);

        return EntityModel.of(utilisateurDto, linkTo(methodOn(CommandeRessource.class).one(id)).withSelfRel(),
                linkTo(methodOn(UtilisateurResource.class).all()).withRel("utilisateurs"));
    }

    @PostMapping
    public EntityModel<UtilisateurDTO> create(@RequestBody Utilisateur utilisateurJson) throws StripeException {
        Utilisateur utilisateur = this.utilisateurService.create(utilisateurJson);
        UtilisateurDTO utilisateurDto = this.utilisateurMapper.toDto(utilisateur);

        return EntityModel.of(utilisateurDto,
                linkTo(methodOn(UtilisateurResource.class).create(utilisateurJson)).withSelfRel());
    }

    @PutMapping("/{id}")
    public EntityModel<UtilisateurDTO> update(@PathVariable Long id, @RequestBody Utilisateur utilisateurJson)
            throws StripeException {
        Utilisateur utilisateur = this.utilisateurService.update(utilisateurJson);
        UtilisateurDTO utilisateurDto = this.utilisateurMapper.toDto(utilisateur);

        return EntityModel.of(utilisateurDto,
                linkTo(methodOn(UtilisateurResource.class).update(id, utilisateurJson)).withSelfRel());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.utilisateurService.delete(id);
    }
}
