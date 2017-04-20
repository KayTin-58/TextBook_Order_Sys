package com.po;

import java.io.Serializable;

/**
 * 教材申请单
 * Created by 直到世界尽头 on 3/12 0012.
 */

public class RequisitionOrder  extends Book implements Serializable{

    private int id;
    private String orderNum;
    private String edition;//版次

    private String faculty;//院系
    private String profession;//专业
    private String session;//那一届
    private String semester;//学期
    private String campus;//校区
    private String course;//课程
    private String responsible;//负责人
    private boolean state;

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }



    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public String getEdition() {
        return edition;
    }



    public String getFaculty() {
        return faculty;
    }

    public String getProfession() {
        return profession;
    }

    public String getSession() {
        return session;
    }

    public String getSemester() {
        return semester;
    }

    public String getCampus() {
        return campus;
    }

    public String getCourse() {
        return course;
    }

    public String getResponsible() {
        return responsible;
    }

    public boolean isState() {
        return state;
    }

    @Override
    public String toString() {
        return "RequisitionOrder{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", edition='" + edition + '\'' +
                ", faculty='" + faculty + '\'' +
                ", profession='" + profession + '\'' +
                ", session='" + session + '\'' +
                ", semester='" + semester + '\'' +
                ", campus='" + campus + '\'' +
                ", course='" + course + '\'' +
                ", responsible='" + responsible + '\'' +
                ", state=" + state +
                '}';
    }
}
