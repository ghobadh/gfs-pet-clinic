package ca.gforcesoftware.gargamelclinic.controllers;

import ca.gforcesoftware.gargamelclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2024-10-06
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    /*
    Note that because we have request maping in the class level so when we call this method "/owners" will be added to the method request mapping
    so the list below would be /owners . /owners/index and /owners/index.html
     */
    @RequestMapping({"","/index", "/index.html"})
    public String listOwner(Model model) {
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping({"/find", "oups"})
    public String findOwner(Model model) {
        return "notimplemented";
    }
}
