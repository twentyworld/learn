package com.learn.util;

import com.learn.entity.JnlpEntity;
import com.learn.util.JnlpParser.JnlpFileParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by teemper on 2018/4/17, 22:10.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class JnlpLocationResolver {

    @Value("${jnlp.jnlpfile.location}")
    String jnlpFileLocation;
    @Value("${jnlp.picture.location}")
    String pictureLocation;

    public List<JnlpEntity> getAllJnlpEntity() {

        if (jnlpFileLocation ==null) return getAllJnlpEntity(new ClassPathResource("jnlp"));
        else return getAllJnlpEntity(new ClassPathResource(jnlpFileLocation));

    }

    public List<JnlpEntity> getAllJnlpEntity(Resource resource) {
        List<JnlpEntity> list = new CopyOnWriteArrayList<>();
        File root = null;
        try {
            root = resource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (root == null) return list;

        if (root.isFile()){
            list.add(getJnlpEntity(new FileSystemResource(root)));
        } else if (root.isDirectory()){
//            list.addAll(getAllJnlpEntity(new FileSystemResource(file)));
            File[] files = root.listFiles();
            for (File file : files) {
                list.addAll(getAllJnlpEntity(new FileSystemResource(root)));
            }
        }

        return list;
    }

    public JnlpEntity getJnlpEntity(Resource resource) {
        File file = null;
        try {
            file = resource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return JnlpFileParser.parseFileToEntity(file);
    }


}
