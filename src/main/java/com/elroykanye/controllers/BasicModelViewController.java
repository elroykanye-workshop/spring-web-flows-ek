package com.elroykanye.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicModelViewController {
    @RequestMapping(value = "welcome-model-view")
    public ModelAndView welcome(ModelMap model) {
        model.put("name", "Elroy Kanye");
        return new ModelAndView("welcome-mv", model);
    }
}
