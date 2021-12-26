package com.luv2code.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

//JPA Annotations
@Entity                     //Especifica que es de tipo Entidad DB
@Table(name="product")      //Nombre de la tabla literal de la DB
@Data                       //Genera los getters/setters gracias a Lombok
//

public class Product {

    @Id                                                     //Este es el ID de la tabla product
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //GeneratedValue -> Autoincrementable
    @Column(name = "id")                                    //Nombre de la columna en la tabla
    private Long id;

    @ManyToOne                                              //Relacion muchos a uno en esta tabla
    @JoinColumn(name = "category_id", nullable = false)     //Join con la primaria de la otra tabla (category_id es el nombre en esta tabla)
    private ProductCategory category;


    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")                            //Nombres exactos de la columna (_)
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}