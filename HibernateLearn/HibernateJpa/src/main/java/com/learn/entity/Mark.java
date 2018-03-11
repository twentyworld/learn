package com.learn.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mark")
@Embeddable
public class Mark {

    @Id
    private int mid;
    private String mname;

    public Mark(int id, String name) {
        this.mid = id;
        this.mname = name;
    }

    public Mark() {
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + mid +
                ", name='" + mname + '\'' +
                '}';
    }

    public int getId() {
        return mid;
    }

    public void setId(int id) {
        this.mid = id;
    }

    public String getName() {
        return mname;
    }

    public void setName(String name) {
        this.mname = name;
    }
}
