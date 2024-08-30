package com.example.tuncbank.database.transactions;

import com.example.tuncbank.database.IinformationController;

public class userApplication implements IinformationController {
    //Application information
    private String nameSurname = null, ssnNo = null, telNo = null;
    private String securityQuestion = null, securityAnswer = null;

    //information from system
    private String userNo = null;
    private String password = null;

    @Override
    public boolean isInformationValid() {
        return !(this.nameSurname == null
                || this.password == null
                || this.ssnNo == null
                || this.telNo == null
                || this.securityQuestion == null
                || this.securityAnswer == null);
    }

    @Override
    public accountInformation getAccountInformation() {
        return null;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getSsnNo() {
        return ssnNo;
    }

    public void setSsnNo(String ssnNo) {
        this.ssnNo = ssnNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
