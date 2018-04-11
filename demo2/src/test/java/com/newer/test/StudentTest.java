package com.newer.test;

import com.newer.dao.StudentMapper;
import com.newer.pojo.Student;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void findAll(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        StudentMapper dao=sqlSession.getMapper(StudentMapper.class);
        List<Student> students=dao.findAll();
//        for(Student student:students) {
//            System.out.println(student.getStuName());
//        }
        students.forEach((Student student)->{
            System.out.println(student.getStuName()+":"+student.getStuClass().getClassName());
        });
        sqlSession.close();
    }

    @Test
    public void findAll2(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        StudentMapper dao=sqlSession.getMapper(StudentMapper.class);
        List<Student>students=dao.findAll2();

        students.forEach((Student student)->{
            System.out.println(student.getStuName()+":"+student.getStuClass().getClassName());
        });
        sqlSession.close();
    }
}
