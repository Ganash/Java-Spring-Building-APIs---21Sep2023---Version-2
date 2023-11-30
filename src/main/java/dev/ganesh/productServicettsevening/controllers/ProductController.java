package dev.ganesh.productServicettsevening.controllers;

import dev.ganesh.productServicettsevening.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

/*
*
* RestController tells Spring that this particular class (ProductController) is having
* restapis internally. This particular class has some api implemented.
*
* so basically @RestController annotation will basically register that particular class in
* spring dispatcher.
*
* So @RestController annotation tells spring that in this particular class there are
* endpoints are implemented, please register those in your dispatcher, if you get some
* rest request.
*
*
*
* */
@RestController
public class ProductController {

    /*
    *
    * Controller is nothing but a set of methods, Each method serves particular request.
    *
    * */

    @GetMapping("/products")
    public String getAllProducts(){

        return "Getting ALL Products";
    }

    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){

        return "Returning Single Product with id: " + productId;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDto productDto){

        return "Adding new product" + productDto;
    }

    @PostMapping("/products/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId){

        return "Updating a Product with id: " + productId;
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){

        return "Deleting a Product with id: " + productId;
    }

}
