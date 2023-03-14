package com.todoapp.controllers;

import com.todoapp.models.Todo;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
    
    @RequestMapping(value = "/saveTodo", method = RequestMethod.POST)
    public String SaveTodo(@ModelAttribute("todo") Todo todo, Model model ){
        System.out.println(todo);
        todo.setTodoDate(new Date());
        return "index";
    }
}
