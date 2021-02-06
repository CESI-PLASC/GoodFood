package fr.mycompany.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mycompany.goodfood.entity.Statut;
import fr.mycompany.goodfood.repository.StatutRepository;

@Service
public class StatutService {
    
    @Autowired
    private StatutRepository statutRepository;

    public List<Statut> all(){
        return this.statutRepository.findAll();
    }
}
