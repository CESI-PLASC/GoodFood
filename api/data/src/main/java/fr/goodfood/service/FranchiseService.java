package fr.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Franchise;
import fr.goodfood.repository.FranchiseRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
public class FranchiseService {
    @Autowired
    private FranchiseRepository franchiseRepository;

    public Franchise create(Franchise franchise) {
        return this.franchiseRepository.save(franchise);
    }

    public Franchise update(Franchise franchise) {
        if (franchise != null && franchise.getId() != null) {
            franchise = this.franchiseRepository.save(franchise);
        } else {
            franchise = this.create(franchise);
        }

        return franchise;
    }

    public Franchise one(Long id) {
        return this.franchiseRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Franchise> all() {
        return this.franchiseRepository.findAll();
    }

    public void delete(Long id) {
        this.franchiseRepository.deleteById(id);
    }
}
