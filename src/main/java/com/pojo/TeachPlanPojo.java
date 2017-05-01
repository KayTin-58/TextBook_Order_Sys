package com.pojo;

import com.po.Book;
import com.po.Gradeinfo;

import java.io.Serializable;

/**
 * Created by 直到世界尽头 on 4/29 0029.
 */
public class TeachPlanPojo implements Serializable{

    private Integer planId;
    private String courseName;//课程名
    private Integer semester;//学期

    private Gradeinfo gradeinfo;
    private Book      bk;


    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public void setGradeinfo(Gradeinfo gradeinfo) {
        this.gradeinfo = gradeinfo;
    }

    public void setBk(Book bk) {
        this.bk = bk;
    }


    public Integer getPlanId() {
        return planId;
    }

    public String getCourseName() {
        return courseName;
    }



    public Integer getSemester() {
        return semester;
    }

    public Gradeinfo getGradeinfo() {
        return gradeinfo;
    }

    public Book getBk() {
        return bk;
    }


    @Override
    public String toString() {
        return "TeachPlanPojo{" +
                "planId=" + planId +
                ", courseName='" + courseName + '\'' +

                ", semester=" + semester +
                ", gradeinfo=" + gradeinfo +
                ", bk=" + bk +
                '}';
    }
}
