package com.learn.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SuperMarket")
public class SuperMarket {
    @Id
    private long id;
    private String name;

    @OneToMany(targetEntity = com.learn.entity.Product.class)
    List<Product> products;
    @OneToOne
    Mark mark;
    public SuperMarket() {
        products = new ArrayList<>();
    }

    public SuperMarket(long id, String name, List<Product> products, Mark mark) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "SuperMarket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
