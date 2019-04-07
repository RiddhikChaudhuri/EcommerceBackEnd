package com.website.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer implements Serializable {

    private static final long serialVersionUID = -1486946968222633105L;

    @Id
    private String customerID;

    @Column
    private String customerName;

    @Column
    private String emailID;

    @Column
    private String Address;

    @Column
    private String customerPhone;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Customer(String customerID, String customerName, String emailID, String address, String customerPhone) {
        super();
        this.customerID = customerID;
        this.customerName = customerName;
        this.emailID = emailID;
        Address = address;
        this.customerPhone = customerPhone;
    }

    public Customer() {
        super();
    }

}
