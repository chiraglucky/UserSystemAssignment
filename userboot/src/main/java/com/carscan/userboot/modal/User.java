package com.carscan.userboot.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    private long id;
    private String fName;
    private String lName;
    private Date dob;
    private String city;
    private String mobile;

    public User() {
        super();
    }

    public User(long id, String fName, String lName, Date dob, String city, String mobile) {
        super();
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.city = city;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fName;
    }

    public void setFname(String fname) {
        this.fName = fname;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fName + '\'' +
                ", lname='" + lName + '\'' +
                ", dob=" + dob +
                ", city='" + city + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
