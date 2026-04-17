package com.dhairya.demo.Service;

import com.dhairya.demo.Model.Product;
import com.dhairya.demo.Repsitory.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Service
@Component
public class ProductService {


    @Autowired
    private Productrepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int ProdId){
        return repo.findById(ProdId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void UpdateProduct(Product prod){
        repo.save(prod);
    }

    public void DeleteProduct(Product prod){
        repo.delete(prod);
    }
}
