package com.masai.onetomany;

import javax.persistence.*;
import java.util.List;

public class User {

    @Id
    private int userId;
    private String userName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "USERID")
    private List<Phone> phoneList;

    public User() {
    }

    public User(int userId, String userName, List<Phone> phoneList) {
        this.userId = userId;
        this.userName = userName;
        this.phoneList = phoneList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
