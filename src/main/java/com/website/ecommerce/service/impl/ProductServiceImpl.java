package com.website.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductDao;
import com.website.ecommerce.model.Product;
import com.website.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteAllProduct() {
        productDao.deleteAll();
    }

    @Override
    public void deleteProductByID(Integer id) {
        productDao.delete(productDao.getOne(id));
    }

    public void updateProductQuantity(Integer unitStock, Integer id) {
        productDao.updateProductQuantity(unitStock, id);
    }

    @Override
    public boolean checkProductExists(Integer id) {
        return productDao.findById(id) != null;
    }

}
