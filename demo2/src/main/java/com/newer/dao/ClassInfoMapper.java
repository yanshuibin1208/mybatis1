package com.newer.dao;

import com.newer.pojo.ClassInfo;

import java.util.List;

public interface ClassInfoMapper {
    ClassInfo findById(int classId);

    List<ClassInfo> findAll();

    List<ClassInfo> findAll2();
}
