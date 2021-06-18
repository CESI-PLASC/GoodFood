package fr.goodfood.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Contient;
import fr.goodfood.entity.keys.ContientKey;
import fr.goodfood.repository.ContientRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
@Transactional
public class ContientService {
    @Autowired
    private ContientRepository contientRepository;

    @PersistenceContext
    private EntityManager em;

    public Contient create(Contient contient) {
        contient = this.contientRepository.save(contient);
        // this.em.refresh(contient);
        return contient;
    }

    public Contient update(Contient contient) {
        if (contient != null && contient.getId() != null) {
            contient = this.contientRepository.saveAndFlush(contient);
            this.em.refresh(contient);
        }

        return contient;
    }

    public Contient one(ContientKey id) {
        return this.contientRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Contient> all() {
        return this.contientRepository.findAll();
    }

    public void delete(ContientKey id) {
        this.contientRepository.deleteById(id);
    }

    public ContientKey getKey(String id) {
        // Récupération de la clé primaire
        Pattern pattern = Pattern.compile("^([0-9]+)_([0-9]+)$");
        Matcher matcher = pattern.matcher(id);
        matcher.find();
        return new ContientKey(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)));
    }
}
