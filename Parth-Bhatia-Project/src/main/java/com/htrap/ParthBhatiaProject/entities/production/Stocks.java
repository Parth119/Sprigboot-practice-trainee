package com.htrap.ParthBhatiaProject.entities.production;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "production", name = "stocks")
@IdClass(StocksId.class)
public class Stocks {
    @Id
    @Column(name = "store_id")
    Integer storeId;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    Products productId;

    @Column(name = "quantity")
    Integer quantity;

}
