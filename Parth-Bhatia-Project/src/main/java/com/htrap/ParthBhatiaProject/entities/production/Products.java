package com.htrap.ParthBhatiaProject.entities.production;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "production",name = "products")
public class Products {
    @Id
    @Column(name = "product_id")
    Integer productId;

    @Column(name = "product_name")
    String productName;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    Brands brandId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Categories categoryId;

    @Column(name = "model_year")
    Integer modelYear;

    @Column(name = "list_price")
    Integer listPrice;
}
