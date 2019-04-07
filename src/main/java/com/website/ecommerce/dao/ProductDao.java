package com.website.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.website.ecommerce.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

    @Modifying
    @Query("update Product p set p.unitStock = :unitStock where p.id = :id")
    int updateProductQuantity(@Param("unitStock") Integer unitStock,@Param("id") Integer id);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Product c WHERE c.productName = :productName")
    boolean exists(@Param("productName")String  productName);
}
