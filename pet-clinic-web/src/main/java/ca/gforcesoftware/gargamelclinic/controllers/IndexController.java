package ca.gforcesoftware.gargamelclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2024-10-05
 */
@Controller
public class IndexController {

    @RequestMapping({"/","","index","index.html"})
    public String index() {
        return "index";
    }
}
