package com.learn;

/**
 * Created by teemper on 2018/7/4, 0:02.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class Id implements Validator{
    private int id;
    private String name;

    public Id() {
    }

    public Id(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean valid() {
        return id > 10;
    }
}
