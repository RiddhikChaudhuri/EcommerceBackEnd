package com.website.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "item")
public class Product implements Serializable {

    private static final long serialVersionUID = 9017204583532623461L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_manufacturer")
    private String productManufacturer;

    @Column(name = "product_price")
    @NotNull(message = "Please provide some price")
    @Min(value = 1, message = "Minimum value should be greater than Rs 1")
    private Double productPrice;

    @Column(name = "stock")
    private String unitStock;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getUnitStock() {
        return unitStock;
    }

    public void setUnitStock(String unitStock) {
        this.unitStock = unitStock;
    }

    public Product(Integer productID, String productName, String productCategory, String productDescription,
            String productManufacturer,
            @NotNull(message = "Please provide some price") @Min(value = 1, message = "Minimum value should be greater than Rs 1") Double productPrice,
            String unitStock) {
        super();
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.unitStock = unitStock;
    }

    public Product() {
        super();
    }

}
