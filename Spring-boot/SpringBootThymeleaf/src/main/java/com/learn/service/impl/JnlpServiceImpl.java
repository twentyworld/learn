package com.learn.service.impl;

import com.learn.entity.JnlpEntity;
import com.learn.repository.JnlpRepository;
import com.learn.service.JnlpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by teemper on 2018/4/17, 21:55.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component
public class JnlpServiceImpl implements JnlpService {

    @Autowired
    @Qualifier("filesystem")
    private JnlpRepository repository;


    @Override
    public List<JnlpEntity> getAllJnlpEntity() {
        return repository.getAllJnlpEntity();
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
