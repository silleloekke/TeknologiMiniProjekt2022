package com.example.miniprojekttek.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {


    @GetMapping("/")
    public String frontpage(){
        return "index";
    }

    @GetMapping("/modul1")
    public String modul1(){
        return "modul1";
    }

    @GetMapping("/modul2")
    public String modul2(){
        return "modul2";
    }

    @GetMapping("/modul3")
    public String modul3(){
        return "modul3";
    }

    @GetMapping("/modul4")
    public String modul4(){
        return "modul4";
    }

}
