package com.kh.poly.pack3.interfaceEx;

// 클래스, 추상 클래스 상속 키워드 : extends (확장하다)
// 인터페이스 상속 키워드 : implements (구현하다)
public class Computer implements Machine {
    @Override
    public void powerOn() {
        System.out.println("Computer 를 킨다.");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer 를 끈다.");
    }
}
