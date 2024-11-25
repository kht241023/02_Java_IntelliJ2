package com.kh.poly.pack1.dto.service;

public class 애플 extends 스마트폰{
    private int ios버전;

    // 기본생성자
    public 애플(){
        // super(); 스마트폰의 특성을 그대로 가져오는 기능으로 항상 생략인 상태로 존재
    }

    public 애플(String 화면, String 통신사, String 성능, int ios버전) {
        super(화면, 통신사, 성능); //스마트폰 클래스에서 무조건 가져오는 것이기 때문에 super 안에 작성
        this.ios버전 = ios버전;
    }

    //Setter
    public void setios버전(int ios버전) {
        this.ios버전 = ios버전;
    }

    //Getter
    public int getios버전() {
        return ios버전;
    }

    //toString

    @Override
    public String toString() {
        return "갤럭시{" +
                "ios버전=" + ios버전 +
                " / " + super.toString() +
                '}';
    }
}
