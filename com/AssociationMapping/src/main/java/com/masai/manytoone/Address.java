package com.masai.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Address {

    @Id
    private int aid;
    private String city;
    private String pincode;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
