package com.kh.poly.pack1.dto.service;

public class 핸드폰기능 {
    public void method1(){
        // 스마트폰 변수명 = new 갤럭시()  또는 new 아이폰()
        // 원래는 컴퓨터 값 처리 원칙 위배
        // 스마트폰은 갤럭시의 부모이기 때문에
        // 부모클래스에서 자식클래스를 새롭게 소환 가능

        // -> 자식 객체 내부에 존재하는 부모타입의 객체만 참조
        // 부모의 모습을 가지면서 자식의 객체를 사용
        스마트폰 폰1 = new 갤럭시();
        스마트폰 폰2 = new 애플();

        폰1.set화면("우주 화면");
        폰2.set화면("사과 화면");

        System.out.println("폰1 화면 : " + 폰1.get화면());
        System.out.println("폰2 화면 : " + 폰2.get화면());

    }
}
