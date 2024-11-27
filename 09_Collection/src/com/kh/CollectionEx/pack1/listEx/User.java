package com.kh.CollectionEx.pack1.listEx;

public class User {
    private String username;
    private String password;
    private String email;
    //메서드 기본 필수 게터 세터 toString


    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  username +"   "+ password + "  " + email ;
    }
}
