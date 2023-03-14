package com.todoapp.controllers;

import com.todoapp.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String Home(Model model){
        model.addAttribute("page", "home");
        return "index";
    }
    
    @RequestMapping("/add")
    public String Add(Model model){
        model.addAttribute("page", "add");
        
        Todo todo = new Todo();
        model.addAttribute("todo", todo);
        return "index";
    }
}
