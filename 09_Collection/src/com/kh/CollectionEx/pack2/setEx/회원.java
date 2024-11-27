package com.kh.CollectionEx.pack2.setEx;

public class 회원 {

    //회원가입번호
    private int id;
    //회원이름
    private String name;
    //회원이메일
    private String email;
    //회원취미
    private String hobby;

    // 메서드 기본 필수 게터 세터 toString


    public 회원() {
    }

    public 회원(int id, String name, String email, String hobby) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "회원{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
