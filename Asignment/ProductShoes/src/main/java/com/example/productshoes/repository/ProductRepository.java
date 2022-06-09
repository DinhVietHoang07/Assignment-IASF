package com.example.productshoes.repository;

import com.example.productshoes.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,String> {

}

