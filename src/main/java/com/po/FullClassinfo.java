package com.po;


/**
 * Created by Administrator on 2017/3/19.
 */
public class FullClassinfo extends Classinfo {


    private String college;//学院

    private Integer grade;//年级

    private String profession;//专业
    private String campus;//校区

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
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
        this.profession = profession;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
