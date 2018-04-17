package com.learn.entity;

import java.io.File;
import java.nio.file.Path;

/**
 * Created by teemper on 2018/4/17, 21:33.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

public class JnlpEntity {
    private long id;
    private String name;

    private JnlpFlavor flavor;
    private JnlpProfile profile;

    public JnlpEntity() {
    }

    public JnlpEntity(long id, String name, JnlpFlavor flavor, JnlpProfile profile) {
        this.id = id;
        this.name = name;
        this.flavor = flavor;
        this.profile = profile;
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

    public JnlpFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(JnlpFlavor flavor) {
        this.flavor = flavor;
    }

    public JnlpProfile getProfile() {
        return profile;
    }

    public void setProfile(JnlpProfile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "JnlpEntity{"
                + "id=" + id
                + ", name='"
                + name + '\''
                + ", flavor=" + flavor
                + ", profile=" + profile
                + '}';
    }
}
