package com.dhairya.demo.Controller;


import com.dhairya.demo.Model.Product;
import com.dhairya.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List Product(){
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable  int prodId){
        return service.getProductById(prodId);
    }


    @PostMapping("/products")
    public void addProd(@RequestBody Product prod){
        service.addProduct(prod);

    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.UpdateProduct(prod);
    }

    @DeleteMapping("/products")
    public void deleteProd(@RequestBody Product prod){
        service.DeleteProduct(prod);

    }

}
