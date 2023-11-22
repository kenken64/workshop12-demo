package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Item;

@Controller
@RequestMapping(path={"/index2.html"})
public class IndexPageController {

    @GetMapping(produces = {"text/html"})
    public String index(Model m){
        List items = new ArrayList<Item>();
        Item i = new Item();
        i.setItemName("Milo");
        i.setQuantity(20);
        
        items.add(i);
        i = new Item();
        i.setItemName("Nescafe");
        i.setQuantity(50);
        items.add(i);
        
        System.out.println("items size > " + items.size());
        m.addAttribute("firstName", "Kenneth");
        m.addAttribute("currDate", new Date().toString());
        m.addAttribute("myAge", 15);
        m.addAttribute("items", items);
        return "index2";
    }
    
}
