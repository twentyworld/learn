package com.learn.util.JnlpParser;

import com.learn.entity.JnlpEntity;

import java.io.File;

/**
 * Created by teemper on 2018/4/17, 23:23.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class JnlpFileParser {

    public static JnlpEntity parseFileToEntity(File file) {
        return new JnlpEntity();
    }
    public static File parseEntityToFile(JnlpEntity entity) {
        return new File("");
    }
}
