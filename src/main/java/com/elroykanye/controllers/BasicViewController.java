package com.elroykanye.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicViewController {
    @RequestMapping(value = "/welcome-view")
    public String welcome() {
        return "welcome";
    }
}
