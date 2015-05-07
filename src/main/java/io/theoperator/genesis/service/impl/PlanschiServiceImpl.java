package io.theoperator.genesis.service.impl;

import io.theoperator.genesis.model.Planschi;
import io.theoperator.genesis.repository.PlanschiRepository;
import io.theoperator.genesis.service.PlanschiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andreas on 5/6/15.
 */

@Service
public class PlanschiServiceImpl implements PlanschiService {

    private PlanschiRepository planschiRepository;

    @Autowired
    public void setPlanschiRepository(PlanschiRepository planschiRepository) {
        this.planschiRepository = planschiRepository;
    }

    public List<Planschi> getAll() {
        return (List)this.planschiRepository.findAll();
    }

}
