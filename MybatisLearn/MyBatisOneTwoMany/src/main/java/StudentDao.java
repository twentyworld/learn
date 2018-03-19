import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;


public class StudentDao {
    MyBatisUtils mybatisUtils = new MyBatisUtils();
    SqlSession sqlSession = null;

    public Student queryOneStudent(Long id) {
        Student student = null;
        try {
            sqlSession = mybatisUtils.getSqlSession();
            IStudent iStudent = sqlSession.getMapper(IStudent.class);
            student = iStudent.queryOneStudent(id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return student;
    }

    public void insertOneStudent(Student student) {
        try {
            sqlSession = mybatisUtils.getSqlSession();
            IStudent iStudent = sqlSession.getMapper(IStudent.class);
            iStudent.insertOneStudent(student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public void insertBatchStudent(List<Student> students) {
        try {
            sqlSession = mybatisUtils.getSqlSession();
            IStudent iStudent = sqlSession.getMapper(IStudent.class);
            iStudent.insertBatchStudent(students);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}