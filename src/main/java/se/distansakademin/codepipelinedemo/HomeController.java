package se.distansakademin.codepipelinedemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(){

        return "home";
    }


    @GetMapping("/Projects")
    public String getProjects(){

    return "Projects";
    }

    @GetMapping("/Contact")
    public String getContact(){
        return "Contact";
    }

    @GetMapping("/Skills")
    public String getSkills(){
        return "Skills";
    }
}
