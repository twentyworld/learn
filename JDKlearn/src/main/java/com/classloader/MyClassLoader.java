package com.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by teemper on 2018/3/27, 21:15.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class MyClassLoader extends ClassLoader {

    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) {
        String className = name.contains(".") ?
                name.substring(name.lastIndexOf(".") + 1) + ".class"
                : name + ".class";

//        System.out.println(name);
        File file = new File(path, className);
        byte[] classContent = readFile(file);

        return defineClass(name, classContent, 0, new Long(file.length()).intValue());

    }


    private byte[] readFile(File file) {

        FileInputStream stream;
        Long fileLength = file.length();
        byte[] fileContent = new byte[fileLength.intValue()];
        try {
            stream = new FileInputStream(file);
            stream.read(fileContent);
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
