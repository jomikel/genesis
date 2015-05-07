package io.theoperator.genesis.restcontroller;

import io.theoperator.genesis.model.Planschi;
import io.theoperator.genesis.service.PlanschiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by andreas on 5/6/15.
 */

@RestController
@RequestMapping("/services/planschi")
public class PlanschiRestController {

    private PlanschiService planschiService;

    @Autowired
    public void setPlanschiService(PlanschiService planschiService) {
        this.planschiService = planschiService;
    }

    public Map<String, Object> getPage(
            @RequestParam("sidx") String sidx,
            @RequestParam("sord") String sord,
            @RequestParam("page") Integer page,
            @RequestParam("rows") Integer rows
    ) {

        List<Planschi> lst = this.planschiService.getAll();

        return null;
    }

}
