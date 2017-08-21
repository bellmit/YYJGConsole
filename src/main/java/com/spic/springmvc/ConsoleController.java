package com.spic.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsoleController {
    @RequestMapping("/console")
    public String console(/*Model model*/) {

       //model.addAttribute("greeting", "Hello Spring MVC");

        return "console";
    }

    @RequestMapping("/someView")
    public String someView(/*Model model*/) {

        //model.addAttribute("greeting", "Hello Spring MVC");

        return "someView";
    }
    @RequestMapping("/mod/mod_home.html")
    public String mod_home (/*Model model*/) {

        //model.addAttribute("greeting", "Hello Spring MVC");

        return "mod/mod_home";
    }
}
