package com.learn.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name="product")
public class Product {

    @Id
    private int pid;
    private String pname;

    public Product(int id, String name) {
        this.pid = id;
        this.pname = name;
    }

    public Product() {
    }

    public int getId() {
        return pid;
    }

    public void setId(int id) {
        this.pid = id;
    }

    public String getName() {
        return pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + pid +
                ", name='" + pname + '\'' +
                '}';
    }
}
