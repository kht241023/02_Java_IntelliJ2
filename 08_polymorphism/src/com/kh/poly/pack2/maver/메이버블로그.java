package com.kh.poly.pack2.maver;

public class 메이버블로그 extends 메이버회원 {
    private String 블로그닉네임;
    private String 블로그제목;

    //기본생성자
    public  메이버블로그(){
        super(); //메이버회원의 정보는 기본으로 가지고옴
    }

    //필수생성자 회원가입할 때의 정보는 기본으로 가져가고 닉네임 제목만 추가
    public 메이버블로그(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String 블로그닉네임, String 블로그제목) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.블로그닉네임 = 블로그닉네임;
        this.블로그제목 = 블로그제목;
    }

    //Setter
    public void set블로그닉네임(String 블로그닉네임) {
        this.블로그닉네임 = 블로그닉네임;
    }

    public void set블로그제목(String 블로그제목) {
        this.블로그제목 = 블로그제목;
    }

    //Getter

    public String get블로그닉네임() {
        return 블로그닉네임;
    }

    public String get블로그제목() {
        return 블로그제목;
    }


    //toString

    @Override
    public String toString() {
        //      메이버회원 기본정보를 넣고 + 블로닉네임 제목 출력
        return super.toString() + '\'' +
                "메이버블로그{" +
                "블로그닉네임='" + 블로그닉네임 + '\'' +
                ", 블로그제목='" + 블로그제목 + '\'' +
                '}';
    }
}
