package com.newer.pojo;

import java.sql.Date;

public class Student {
    private Integer stuId;
    private String stuName;
    private String stuSex;
    private String stuCard;
    private Date stuJointime;
    private String stuAddress;
    private ClassInfo stuClass;

    public ClassInfo getStuClass() {
        return stuClass;
    }

    public void setStuClass(ClassInfo stuClass) {
        this.stuClass = stuClass;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuCard() {
        return stuCard;
    }

    public void setStuCard(String stuCard) {
        this.stuCard = stuCard;
    }

    public Date getStuJointime() {
        return stuJointime;
    }

    public void setStuJointime(Date stuJointime) {
        this.stuJointime = stuJointime;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
}

