package com.po;

public class KeyfiledOfGradeinfo {
    private String college;//学院

    private Integer grade;//年级

    private String profession;//专业

    private String campus;//校区

    public KeyfiledOfGradeinfo(String college, Integer grade, String profession, String campus) {
        this.college = college;
        this.grade = grade;
        this.profession = profession;
        this.campus = campus;
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


    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }
}