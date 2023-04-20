package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/card")
    public String card(Model model) {
        model.addAttribute("page", "card");
        return "index";
    }

    @RequestMapping("/chart")
    public String chart(Model model) {
        model.addAttribute("page", "chart");
        return "index";
    }

    @RequestMapping("/table")
    public String table(Model model) {
        model.addAttribute("page", "table");
        return "index";
    }

}
