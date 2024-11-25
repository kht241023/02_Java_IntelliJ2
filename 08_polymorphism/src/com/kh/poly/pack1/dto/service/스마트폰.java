package com.kh.poly.pack1.dto.service;

//부모 클래스 역할
public class 스마트폰 {
   //필드
    private String 화면;
    private String 통신사;
    private String 성능;

    //기본생성자
    public 스마트폰() {
    }

    //매개 변수가 모두 들어간 필수 생성자
    public 스마트폰(String 화면, String 통신사, String 성능) {
        this.화면 = 화면;
        this.통신사 = 통신사;
        this.성능 = 성능;
    }

    //Setter
    public void set화면(String 화면) {
        this.화면 = 화면;
    }

    public void set통신사(String 통신사) {
        this.통신사 = 통신사;
    }

    public void set성능(String 성능) {
        this.성능 = 성능;
    }

    //Getter
    public String get화면() {
        return 화면;
    }

    public String get통신사() {
        return 통신사;
    }

    public String get성능() {
        return 성능;
    }

    //toString

    @Override
    public String toString() {
        return "스마트폰{" +
                "화면='" + 화면 + '\'' +
                ", 통신사='" + 통신사 + '\'' +
                ", 성능='" + 성능 + '\'' +
                '}';
    }
}
