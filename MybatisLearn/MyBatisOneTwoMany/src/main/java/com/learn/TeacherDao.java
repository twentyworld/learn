package com.learn;

import com.learn.ITeacher;
import com.learn.MyBatisUtils;
import com.learn.Teacher;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;


public class TeacherDao {
    MyBatisUtils mybatisUtils = new MyBatisUtils();
    SqlSession sqlSession = null;

    public Teacher queryOneTeacher(Long id) {
        Teacher teacher = null;
        try {
            sqlSession = mybatisUtils.getSqlSession();
            ITeacher iTeacher = sqlSession.getMapper(ITeacher.class);
            teacher = iTeacher.queryOneTeacher(id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return teacher;
    }

    public Teacher queryOneTeacherWithStudent(Long id) {
        Teacher teacher = null;
        try {
            sqlSession = mybatisUtils.getSqlSession();
            ITeacher iTeacher = sqlSession.getMapper(ITeacher.class);
            teacher = iTeacher.queryOneTeacherWithStudent(id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return teacher;
    }

    public int insertOneTeacher(Teacher teacher) {
        int count = 0;
        try {
            sqlSession = mybatisUtils.getSqlSession();
            ITeacher iTeacher = sqlSession.getMapper(ITeacher.class);
            count = iTeacher.insertOneTeacher(teacher);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return count;
    }
}