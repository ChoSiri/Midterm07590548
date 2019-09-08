package com.example.midterm07590548.Model;

public class Auth {
    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";

    private String mEmail;
    private String mPassword;

    // Auth วิธีที่ 1
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }
    public boolean check(){
        if(mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)){
            return true;
        }
        else {
            return false;
        }
    }
    /*// Auth วิธีที่ 2
    public Auth(String email, String password){
        this.mEmail = email;
        this.mPassword = password;
    }
    */
}
