package com.interview.skylab.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(nullable = false, length = 50)
    private String cust_name;
    @Column(nullable = false, length = 20)
    private String gender;
    @Column(nullable = false, length = 50)
    private String country;
    @Column(nullable = false, length = 100)
    private String location;
    @Column(nullable = false)
    private LocalDateTime regdate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cust_name='" + cust_name + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                ", regdate=" + regdate +
                '}';
    }
}
