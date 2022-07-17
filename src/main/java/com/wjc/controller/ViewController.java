package com.wjc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
    @GetMapping("/packages.html")
    public String toPage() {
        return "packages";
    }

    @GetMapping("/login.html")
    public String login() {
        System.out.println(1);
        return "login";
    }

    @GetMapping("/manager.html")
    public String manager()
    {
        return "manager";
    }


    @GetMapping("/drivers.html")
    public String driver()
    {
        return "drivers";
    }


    @GetMapping("/repair.html")
    public String repair()
    {
        return "repair";
    }
}
