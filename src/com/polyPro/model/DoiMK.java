package com.polyPro.model;

public class DoiMK {
    private String userName;
    private String pass;
    private String newPass;
    private String RePass;

    public DoiMK() {
    }

    public DoiMK(String userName, String pass, String newPass, String RePass) {
        this.userName = userName;
        this.pass = pass;
        this.newPass = newPass;
        this.RePass = RePass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getRePass() {
        return RePass;
    }

    public void setRePass(String RePass) {
        this.RePass = RePass;
    }
    
    
}
