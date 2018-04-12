package com.newer.test;

import com.newer.dao.ClassInfoMapper;
import com.newer.dao.CourseMapper;
import com.newer.dao.StudentMapper;
import com.newer.pojo.ClassInfo;
import com.newer.pojo.Course;
import com.newer.pojo.Student;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void findAll3(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ClassInfoMapper dao=sqlSession.getMapper(ClassInfoMapper.class);
        List<ClassInfo>list=dao.findAll();

        for(ClassInfo classInfo:list) {
            System.out.println(classInfo.getClassName());
            System.out.println(classInfo.getStudents().size());
        }
        sqlSession.close();
    }
    @Test
    public void findAll4(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ClassInfoMapper dao=sqlSession.getMapper(ClassInfoMapper.class);
        List<ClassInfo>list=dao.findAll2();

        for(ClassInfo classInfo:list) {
            System.out.println(classInfo.getClassName());
            System.out.println(classInfo.getStudents().size());
        }
        sqlSession.close();
    }

    @Test
    public void findAll5(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        CourseMapper dao=sqlSession.getMapper(CourseMapper.class);
        List<Course>list=dao.findAll();
        for (Course course:list){
            System.out.println(course.getCourseName()+":"+course.getStudents().size());
           if(course.getStudents().size()>0) {
               for (Student student : course.getStudents()) {
                   System.out.println(student.getStuName()+":"+student.getStuClass().getClassName());
               }
           }
        }
        sqlSession.close();
    }

    @Test
    public void findAll6(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        StudentMapper dao=sqlSession.getMapper(StudentMapper.class);
       ClassInfo classInfo=new ClassInfo();
       classInfo.setClassId(2);
       Student student=new Student();
       student.setStuId(1);
       student.setStuName("Jack");
       student.setStuSex("男");
       student.setStuClass(classInfo);
        System.out.println(dao.updateStudent(student));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findAll7(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        StudentMapper dao=sqlSession.getMapper(StudentMapper.class);
        ClassInfo classInfo=new ClassInfo();
        classInfo.setClassId(2);
        Map<String,Object>map=new HashMap<String,Object>();
        //map.put("stuName","刘%");
//        map.put("beginTime","2018-03-01");
//        map.put("endTime","2018-03-31");
        map.put("stuClass",classInfo);

        List<Student> list=dao.findAdv(map);
        list.forEach((Student student)->{
            System.out.println(student.getStuName()+":"+student.getStuClass().getClassName());
        });
        sqlSession.close();
    }
}
