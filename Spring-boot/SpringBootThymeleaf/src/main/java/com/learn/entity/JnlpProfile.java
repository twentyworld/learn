package com.learn.entity;

import java.nio.file.Path;

/**
 * Created by teemper on 2018/4/17, 21:42.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class JnlpProfile {
    private Path picture;
    private Path location;
    private JnlpDefinition defination;

    public JnlpProfile() {
    }

    public JnlpProfile(Path picture, Path location, JnlpDefinition defination) {
        this.picture = picture;
        this.location = location;
        this.defination = defination;
    }

    public Path getPicture() {
        return picture;
    }

    public void setPicture(Path picture) {
        this.picture = picture;
    }

    public Path getLocation() {
        return location;
    }

    public void setLocation(Path location) {
        this.location = location;
    }

    public JnlpDefinition getDefination() {
        return defination;
    }

    public void setDefination(JnlpDefinition defination) {
        this.defination = defination;
    }
}
