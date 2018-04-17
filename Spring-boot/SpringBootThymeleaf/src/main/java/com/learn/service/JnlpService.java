package com.learn.service;

import com.learn.entity.JnlpEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by teemper on 2018/4/17, 21:51.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Service
public interface JnlpService {

    List<JnlpEntity> getAllJnlpEntity();

    JnlpEntity getJnlpEntityByName();

    JnlpEntity getJnlpEntityById();

}
