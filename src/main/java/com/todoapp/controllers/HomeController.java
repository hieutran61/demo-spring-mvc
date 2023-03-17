package com.todoapp.controllers;

import com.todoapp.dao.ITodoDAO;
import com.todoapp.dao.impl.TodoDAOImpl;
import com.todoapp.models.Todo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    @Autowired
    private ITodoDAO todoDAO;
    
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
    
    @GetMapping("/getAll")
    public List<Todo> getAllTodos(){
        List<Todo> list = todoDAO.list();
        System.out.println("getAll ne`````````````````");
        System.out.println(list.get(1).getTodoTitle());
        return list;
    }
    
    @RequestMapping(value = "/saveTodo", method = RequestMethod.POST)
    public String SaveTodo(@ModelAttribute("todo") Todo todo, Model model ){
        System.out.println(todo);
        
        
        return "index";
    }
    
        
    public static void main(String[] args){
        HomeController control = new HomeController();
        System.out.println(control.getAllTodos());
    }
    
    

}
