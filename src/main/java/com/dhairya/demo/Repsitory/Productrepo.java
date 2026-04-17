package com.dhairya.demo.Repsitory;

import com.dhairya.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepo extends JpaRepository<Product,Integer> {
}
   