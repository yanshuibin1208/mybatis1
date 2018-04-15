package com.newer.dao;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    //嵌套结果方式查询
    List<Student> findAll();
    //嵌套查询方式查询
    List<Student> findAll2();

    List<Student>findByClassId(int classId);

    int updateStudent(Student student);

    List<Student>findAdv(Map<String,Object> mape);

    List<Student>findAdv2(int[] stuIds);

    int addCourses(@Param("stuId") int stuId,@Param("courseIds") List<String> courseIds);

    List<Student>findAll3(Map<String,Object>map);
}
