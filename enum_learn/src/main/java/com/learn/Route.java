package com.learn;

/**
 * Created by teemper on 2017/9/7, 20:40.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Route {
    private String name ;
    private Direction direction;

    public Route() {
    }

    public Route(String name, Direction direction) {
        this.name = name;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Route{" + "name='" + name + '\'' + ", direction=" + direction + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (name != null ? !name.equals(route.name) : route.name != null) return false;
        return direction != null ? direction.equals(route.direction) : route.direction == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
