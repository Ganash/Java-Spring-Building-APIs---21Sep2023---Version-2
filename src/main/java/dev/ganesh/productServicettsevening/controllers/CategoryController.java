package dev.ganesh.productServicettsevening.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/categories")
    public String getAllCategories(){

        return "Getting All Categories";
    }

    public String getProductsInCategory(){

        return "Get Products in Category";
    }

}
