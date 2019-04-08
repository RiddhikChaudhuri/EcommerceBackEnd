package com.website.ecommerce.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "order")
public class Order {

    @Id
    private Integer orderID;

    @Column(name = "email")
    private String emailId;

    
    @OneToMany(mappedBy = "order", targetEntity = Cart.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Cart> items;

    
    public Set<Cart> getItems() {
        return items;
    }

    public void setItems(Set<Cart> items) {
        this.items = items;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Order(Integer orderID, String emailId, Set<Cart> items) {
        super();
        this.orderID = orderID;
        this.emailId = emailId;
        this.items = items;
    }

    public Order() {
        super();
    }

}
