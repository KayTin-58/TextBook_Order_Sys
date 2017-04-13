package com.po;

import java.io.Serializable;

/**
 * Created by 直到世界尽头 on 3/7 0007.
 */

//系统管理员对应的bean
public class SysMaster  implements Serializable{
    private int Mid;//主键
    private String AccountNum;//账号
    private String mPassword;//密码
    private String mName;//姓名
    private String Phone;//手机号
    private String Identificationnum;//身份证号码
    private int State;//状态

    public void setMid(int mid) {
        Mid = mid;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setIdentificationnum(String identificationnum) {
        Identificationnum = identificationnum;
    }

    public void setState(int state) {
        State = state;
    }

    public int getMid() {
        return Mid;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    public String getmPassword() {
        return mPassword;
    }

    public String getmName() {
        return mName;
    }

    public String getPhone() {
        return Phone;
    }

    public String getIdentificationnum() {
        return Identificationnum;
    }

    public int getState() {
        return State;
    }

    @Override
    public String toString() {
        return "SysMaster{" +
                "Mid=" + Mid +
                ", AccountNum='" + AccountNum + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mName='" + mName + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Identificationnum='" + Identificationnum + '\'' +
                ", State=" + State +
                '}';
    }
}
