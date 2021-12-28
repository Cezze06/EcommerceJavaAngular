package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Accessing through URL
//@RepositoryRestResource(collectionResourceRel = "product", path = "product")
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
