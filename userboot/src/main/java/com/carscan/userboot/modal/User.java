package com.carscan.userboot.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//@Entity annotation defines that this class can be mapped to a table
//Every instance of an entity represents a row in the table.
@Entity
public class User {
    @Id
    private long id;
    private String fname;
    private String lname;
    private Date dob;
    private String city;
    private String mobile;

    public User() {
        super();
    }

    public User(long id, String fName, String lName, Date dob, String city, String mobile) {
        super();
        this.id = id;
        this.fname = fName;
        this.lname = lName;
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
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lName) {
        this.lname = lName;
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
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob=" + dob +
                ", city='" + city + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
