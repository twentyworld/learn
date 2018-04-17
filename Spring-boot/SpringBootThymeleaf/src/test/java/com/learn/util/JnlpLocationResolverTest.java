package com.learn.util;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * Created by teemper on 2018/4/17, 22:38.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class JnlpLocationResolverTest {

    @Test
    public void testPath() throws IOException {
        File root = new File(System.getProperty("user.dir"));
        File[] files = root.listFiles();
        for (File file: files) {
            System.out.println(file.getAbsoluteFile());
        }
        System.out.println("class.getResource(\"/\"):  " + this.getClass().getResource("/"));

        System.out.println(this.getClass().getResourceAsStream("/jnlp"));

        Resource resource = new ClassPathResource("jnlp");
        File file = resource.getFile();
        if (resource.exists()){
            URI uri = resource.getURI();
            URL URL = uri.toURL();

            System.out.println(uri.getPath());

        }
    }
}