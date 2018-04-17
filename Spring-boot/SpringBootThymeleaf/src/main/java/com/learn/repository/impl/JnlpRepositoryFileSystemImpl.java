package com.learn.repository.impl;

import com.learn.entity.JnlpEntity;
import com.learn.repository.JnlpRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by teemper on 2018/4/17, 22:03.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component("filesystem")
public class JnlpRepositoryFileSystemImpl implements JnlpRepository {
    @Override
    public List<JnlpEntity> getAllJnlpEntity() {
        return null;
    }

    @Override
    public JnlpEntity getJnlpEntityByName() {
        return null;
    }

    @Override
    public JnlpEntity getJnlpEntityById() {
        return null;
    }
}
