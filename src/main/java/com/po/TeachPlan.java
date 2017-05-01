package com.po;

import java.io.Serializable;

/**
 * Created by 直到世界尽头 on 4/29 0029.
 */
public class TeachPlan  implements Serializable {

    private Integer planId;
    private Integer gradeId;
    private String courseName;//课程名称
    private Integer bookid;//书名
    private Integer semester;//学期


    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getPlanId() {
        return planId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getBookid() {
        return bookid;
    }

    public Integer getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "TeachPlan{" +
                "planId=" + planId +
                ", gradeId=" + gradeId +
                ", courseName='" + courseName + '\'' +
                ", bookid=" + bookid +
                ", semester=" + semester +
                '}';
    }
}
