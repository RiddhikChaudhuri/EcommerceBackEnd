package com.website.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.website.ecommerce.model.Product;
import com.website.ecommerce.service.ProductService;

@RestController
public class ItemController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/listAllItems", produces = "application/json")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(value = "/addItem", produces = "application/json")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/deleteAllItem", produces = "application/json")
    public ResponseEntity<?> deleteAllProducts() {
        productService.deleteAllProduct();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteItem", produces = "application/json")
    public ResponseEntity<?> deleteItemByID(@PathVariable("id") Integer id) {
        productService.deleteProductByID(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
    @PutMapping(value="/updateItemPrice", produces ="application/json")
    public ResponseEntity<?> updateItemPrice(@PathVariable("id") Integer id){
        
        if(productService.checkProductExists(id))
           
    }
}
