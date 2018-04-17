package com.learn.controller;

import com.learn.util.FileUtil;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by teemper on 2018/4/15, 15:47.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@RestController(value = "JNLPController")
public class JnlpController {

    @GetMapping("/test/{filename}")
    public ResponseEntity demo(@PathVariable("filename") String filename) {

        System.out.println("this is invoked.");
        System.out.println(filename);
        if (!FileUtil.filenameValidation(filename))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.parseMediaType("text/html")).body("wrong filename");

        try {
            return ResponseEntity.ok().
                    header("Content-Disposition", "attachment; filename=" + filename)
                    .contentType(MediaType.parseMediaType("application/octet-stream")).body(FileUtil.getResource(filename));

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.asList(e.getStackTrace()).toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .contentType(MediaType.parseMediaType("text/html")).body(e.getMessage());
        }

    }
}
