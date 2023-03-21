package com.htrap.ParthBhatiaProject.entities.production;

import java.io.Serializable;

public class StocksId implements Serializable {
    private Integer storeId;

    private Products productId;

    public StocksId(Integer storeId, Products productId) {
        this.storeId = storeId;
        this.productId = productId;
    }
}
