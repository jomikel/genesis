package io.theoperator.genesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by andreas on 5/6/15.
 */

@Controller
@RequestMapping(value = "planschis")
public class PlanschiController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("planschi/list");
    }

}
