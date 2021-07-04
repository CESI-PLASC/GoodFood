package fr.goodfood.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Propose;
import fr.goodfood.repository.ProposeRepository;

import java.util.List;

@Service
public class ProposeService {

    @Autowired
    private ProposeRepository proposeRepository;

    public Propose create(Propose newPropose) {
        return this.proposeRepository.save(newPropose);
    }

    public List<Propose> all() {
        return this.proposeRepository.findAll();
    }

}
