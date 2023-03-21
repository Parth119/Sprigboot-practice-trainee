package com.htrap.ParthBhatiaProject.entities.sales;

import com.htrap.ParthBhatiaProject.entities.production.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "sales", name = "order_items")
@IdClass(OrderItemsId.class)
public class OrderItems {
    @Id
    @Column(name = "order_id")
    Integer orderId;
    @Id
    @Column(name = "item_id")
    Integer itemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Products productId;
    @Column(name = "quantity")
    Integer quantity;
    @Column(name = "list_price")
    Integer listPrice;
    @Column(name = "discount")
    Integer discount;
}
