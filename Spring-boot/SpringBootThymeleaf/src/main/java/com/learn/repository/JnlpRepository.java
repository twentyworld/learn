package com.learn.repository;

import com.learn.entity.JnlpEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by teemper on 2018/4/17, 21:54.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component
public interface JnlpRepository {
    List<JnlpEntity> getAllJnlpEntity();

    JnlpEntity getJnlpEntityByName();

    JnlpEntity getJnlpEntityById();
}
