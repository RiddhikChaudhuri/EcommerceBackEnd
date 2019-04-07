//package com.website.ecommerce.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "order")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String orderID;
//
//    @OneToOne
//    @JoinColumn(name = "customerId")
//    private Customer customer;
//
//    private List<Product> orderList;
//
//    public String getOrderID() {
//        return orderID;
//    }
//
//    public void setOrderID(String orderID) {
//        this.orderID = orderID;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public List<Product> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Product> orderList) {
//        this.orderList = orderList;
//    }
//
//    public Order(String orderID, Customer customer, List<Product> orderList) {
//        super();
//        this.orderID = orderID;
//        this.customer = customer;
//        this.orderList = orderList;
//    }
//
//    public Order() {
//        super();
//    }
//
//}
