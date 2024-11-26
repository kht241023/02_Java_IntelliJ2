package com.kh.CollectionEx.pack1.listEx;

public class User {
    private String username;
    private String password;
    private String email;
    //메서드 기본 필수 게터 세터 toString


    @Override
    public String toString() {
        return  username +"   "+ password + "  " + email ;
    }
}
