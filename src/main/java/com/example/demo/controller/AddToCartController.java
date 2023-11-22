package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/cart"})
public class AddToCartController {
    
    @GetMapping(produces = {"text/html"})
    public String add2Cart(Model m){
        return "cart";
    }
}
