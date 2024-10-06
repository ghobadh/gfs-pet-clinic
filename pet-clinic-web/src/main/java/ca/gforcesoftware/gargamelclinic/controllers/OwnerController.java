package ca.gforcesoftware.gargamelclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2024-10-06
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
    /*
    Note that becauese we have request maapping in the class level so when we call this method "/owners" will be added to the method request mapping
    so the list below would be /owners . /owners/index and /owners/index.html
     */
    @RequestMapping({"","/index", "/index.html"})
    public String listOwner(Model model) {

        return "owners/index";
    }
}
