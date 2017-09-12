package com.learn;

/**
 * Created by teemper on 2017/9/7, 20:36.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Direction {
    private int id;
    private Enums enums;

    public Direction() {
    }

    public Direction(int id, Enums enums) {
        this.id = id;
        this.enums = enums;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enums getEnums() {
        return enums;
    }

    public void setEnums(Enums enums) {
        this.enums = enums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        if (id != direction.id) return false;
        return enums == direction.enums;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (enums != null ? enums.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Direction{" + "id=" + id + ", enums=" + enums + '}';
    }
}
