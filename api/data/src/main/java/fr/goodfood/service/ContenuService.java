package fr.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Contenu;
import fr.goodfood.repository.ContenuRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
public class ContenuService {
    @Autowired
    private ContenuRepository contenuRepository;

    public Contenu create(Contenu contenu) {
        return this.contenuRepository.save(contenu);
    }

    public Contenu update(Contenu contenu) {
        if (contenu != null && contenu.getId() != null) {
            contenu = this.contenuRepository.save(contenu);
        } else {
            contenu = this.create(contenu);
        }

        return contenu;
    }

    public Contenu one(Long id) {
        return this.contenuRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Contenu> all() {
        return this.contenuRepository.findAll();
    }

    public void delete(Long id) {
        this.contenuRepository.deleteById(id);
    }
}
