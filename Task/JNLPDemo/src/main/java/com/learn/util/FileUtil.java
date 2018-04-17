package com.learn.util;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by teemper on 2018/4/15, 16:00.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class FileUtil {

    public static ByteArrayResource getResource(String filename) throws IOException {
        filename = "jnlp/" +filename;
        Resource resource = new ClassPathResource(filename);
        File file = resource.getFile();

        Path path = Paths.get(file.getAbsolutePath());
        return new ByteArrayResource(Files.readAllBytes(path));

    }


    public static boolean filenameValidation(String filename) {
        if (filename.contains(".")){
            String fileIndex = filename.substring(filename.lastIndexOf(".")+1);
            return fileIndex.equals("jnlp");

        }
        return false;
    }

}
