package com.mitrais.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private String userName;
    private String userPass;
    private String userComment;
    private String userGender;
    private String userNationality;
    private boolean receivePaper;
    private String[] knownFramework;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date joinDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNationality() {
        return userNationality;
    }

    public void setUserNationality(String userNationality) {
        this.userNationality = userNationality;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public boolean isReceivePaper() {
        return receivePaper;
    }

    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }

    public String[] getKnownFramework() {
        return knownFramework;
    }

    public void setKnownFramework(String[] knownFramework) {
        this.knownFramework = knownFramework;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

}
