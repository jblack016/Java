package com.jaredblack.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoppersController {

    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Steve Jobs";
        String itemName = "Copper wire";
        double price = 10.59;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Big Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
    
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vender", vendor);
        
        return "index.jsp";
    }
}
