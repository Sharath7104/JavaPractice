package com.masai.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneId;
    private String phoneType;
    private String phoneNo;
    private int userId;

    public Phone() {
    }

    public Phone(int phoneId, String phoneType, String phoneNo, int userId) {
        this.phoneId = phoneId;
        this.phoneType = phoneType;
        this.phoneNo = phoneNo;
        this.userId = userId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
