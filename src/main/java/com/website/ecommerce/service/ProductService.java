package com.website.ecommerce.service;

import java.util.List;

import com.website.ecommerce.model.Product;

public interface ProductService {

    public List<Product> getAllProducts();

    public void addProduct(Product product);

    void deleteAllProduct();

    void deleteProductByID(Integer id);

    boolean checkProductExists(String productName);
}
