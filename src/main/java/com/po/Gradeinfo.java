package com.po;

public class Gradeinfo {
    private Integer gradeid;//年级id

    private String college;//专业

    private Integer grade;//年级

    private String profession;//专业

    private Integer numofclass;//班级数量

    private Integer numofstu;//年级总人数

    private String campus;//校区
    private Integer schoolSystem;//对应专业几年制

    public Integer getSchoolSystem() {
        return schoolSystem;
    }

    public void setSchoolSystem(Integer schoolSystem) {
        this.schoolSystem = schoolSystem;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public Integer getNumofclass() {
        return numofclass;
    }

    public void setNumofclass(Integer numofclass) {
        this.numofclass = numofclass;
    }

    public Integer getNumofstu() {
        return numofstu;
    }

    public void setNumofstu(Integer numofstu) {
        this.numofstu = numofstu;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }
}