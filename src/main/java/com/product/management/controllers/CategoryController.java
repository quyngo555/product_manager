package com.product.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "categories")
public class CategoryController {
    //return name of "jsp file"
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap) {
        // data sent to jsp => Modelmap
        System.out.println("Hello World");
        return "category";
    }
}
