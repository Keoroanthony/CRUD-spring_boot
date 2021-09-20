package com.interview.skylab.entity;

import javax.persistence.*;

@Entity
@Table(name = "oders")
public class Oders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column()
    private int psid;
    @Column()
    private int custid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPsid() {
        return psid;
    }

    public void setPsid(int psid) {
        this.psid = psid;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    @Override
    public String toString() {
        return "Oders{" +
                "id=" + id +
                ", psid=" + psid +
                ", custid=" + custid +
                '}';
    }
}
