package com.luv2code.ecommerce.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
//@Data  --known bug
@Getter
@Setter
public class ProductCategory {

    @Id                                                     //Este es el ID de la tabla product
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //GeneratedValue -> Autoincrementable
    @Column(name = "id")                                    //Nombre de la columna en la tabla
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "category")       //Relacion uno a mucho en esta tabla,
            //Cascade indica que Persist, Remove, Refresh, Merge, Detach, se propagará a las entidades relacionadas
    private Set<Product> products;          //Colección de objetos tipo Products (la otra tabla)

}
