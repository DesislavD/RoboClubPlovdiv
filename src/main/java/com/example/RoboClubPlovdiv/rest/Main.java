package com.example.RoboClubPlovdiv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {



    @GetMapping(path = "/")
    public String getMain(){
        return "index";
    }

    @GetMapping(path ="/register")
    public String getRegister(){
        return "register";
    }

    @GetMapping(path ="/contact")
    public String getContactPage(){

        return "contact";
    }
}