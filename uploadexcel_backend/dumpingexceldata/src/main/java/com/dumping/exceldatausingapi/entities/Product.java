package com.dumping.exceldatausingapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private Integer productId;
    private String productName;
    private String productCategory;
    private Double productPrice;
    private Integer productStockQuantity;

    public Product() {
    }

    public Product(Integer productId, String productName, String productCategory, Double productPrice, Integer productStockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStockQuantity = productStockQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStockQuantity() {
        return productStockQuantity;
    }

    public void setProductStockQuantity(Integer productStockQuantity) {
        this.productStockQuantity = productStockQuantity;
    }
}
