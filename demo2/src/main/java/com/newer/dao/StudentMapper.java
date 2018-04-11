package com.newer.dao;

import com.newer.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //嵌套结果方式查询
    List<Student> findAll();
    //嵌套查询方式查询
    List<Student> findAll2();
}
