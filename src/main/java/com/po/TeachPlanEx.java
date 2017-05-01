package com.po;

/**
 * Created by 直到世界尽头 on 4/29 0029.
 */
public class TeachPlanEx extends TeachPlan{

    private String session;//入学时间
    private String faculty;//学院
    private String profession;//专业

    public String getSession() {
        return session;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getProfession() {
        return profession;
    }


    public void setSession(String session) {
        this.session = session;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "TeachPlanEx{" +
                "session='" + session + '\'' +
                ", faculty='" + faculty + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
