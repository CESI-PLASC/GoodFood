package fr.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Formule;
import fr.goodfood.repository.FormuleRepository;
import fr.goodfood.ressource.error.FormuleNotFoundException;

@Service
public class FormuleService {
    @Autowired
    private FormuleRepository formuleRepository;

    public Formule create(Formule formule){
        return this.formuleRepository.save(formule);
    }

    public Formule update(Formule formule){
        if(formule != null && formule.getId() != null){
            formule = this.formuleRepository.save(formule);
        } else {
            formule = this.create(formule);
        }

        return formule;
    }

    public Formule one(Long id){
        return this.formuleRepository.findById(id).orElseThrow(() -> new FormuleNotFoundException(id));
    }

    public List<Formule> all(){
        return this.formuleRepository.findAll();
    }

    public void delete(Long id){
        this.formuleRepository.deleteById(id);
    }
}
