package fr.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Localisation;
import fr.goodfood.entity.keys.LocalisationKey;
import fr.goodfood.repository.LocalisationRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
public class LocalisationService {
    @Autowired
    private LocalisationRepository localisationRepository;

    public Localisation create(Localisation localisation) {
        return this.localisationRepository.save(localisation);
    }

    public Localisation update(Localisation localisation) {
        if (localisation != null && localisation.getId() != null) {
            localisation = this.localisationRepository.save(localisation);
        } else {
            localisation = this.create(localisation);
        }

        return localisation;
    }

    public Localisation one(LocalisationKey id) {
        return this.localisationRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Localisation> all() {
        return this.localisationRepository.findAll();
    }

    public void delete(LocalisationKey id) {
        this.localisationRepository.deleteById(id);
    }
}
