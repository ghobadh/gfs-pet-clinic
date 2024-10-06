package ca.gforcesoftware.gargamelclinic.controllers;

import ca.gforcesoftware.gargamelclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2024-10-06
 */
@Controller
public class VetController {

    public static final String VET_VIEW = "vets/index";

    //public final VetService vetService;


   // public VetController(@Qualifier("vet") VetService vetService) {
    //    this.vetService = vetService;
  //  }

    @RequestMapping({"/vets", "vets/index","/vets/index.html"})
    public String listVets(Model model) {
      //  model.addAttribute("vetlist", vetService.findAll());
        return VET_VIEW;
    }
}
