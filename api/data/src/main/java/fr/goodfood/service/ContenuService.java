package fr.goodfood.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Contenu;
import fr.goodfood.repository.ContenuRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
@Transactional
public class ContenuService {
    @Autowired
    private ContenuRepository contenuRepository;

    @PersistenceContext
    private EntityManager em;

    public Contenu save(Contenu contenu) {
        contenu = this.contenuRepository.save(contenu);
        this.em.refresh(contenu);
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
