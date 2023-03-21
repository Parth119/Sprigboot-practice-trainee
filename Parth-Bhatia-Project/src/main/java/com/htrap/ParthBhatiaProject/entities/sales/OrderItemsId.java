package com.htrap.ParthBhatiaProject.entities.sales;

import java.io.Serializable;

public class OrderItemsId implements Serializable {
    private Integer orderId;
    private Integer itemId;

    public OrderItemsId(Integer orderId, Integer itemId) {
        this.orderId = orderId;
        this.itemId = itemId;
    }
}
