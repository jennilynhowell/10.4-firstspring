package com.jennilyn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "data", required = false) String data,
                        @RequestParam(value = "data2", required = false) String data2,
                        ModelMap model){
        System.out.println(data);
        System.out.println(data2);

        model.addAttribute("pageData", data + " " + data2);
        return "index";
    }

}
