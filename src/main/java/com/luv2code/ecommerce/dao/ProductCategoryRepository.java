package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//Name of JSOn entry      Path actual
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")   //Custom options, Este se usa para acceder desde URL
                                                                                                //localhost:8080/api/product-category

@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
