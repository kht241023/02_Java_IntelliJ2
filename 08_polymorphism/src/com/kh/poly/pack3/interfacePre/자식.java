package com.kh.poly.pack3.interfacePre;

// extends = 하나만 상속 가능    public class 자식 extends 엄마,아빠 {
// implements = 엄마 아빠가 모두 interface 일 때 둘 다 상속가능하고   public class 자식 implements 엄마,아빠 {

// 강제로 기능 구현해야하는 엄마 추상클래스 상속받고
// 아빠의 기능도 진행하겠음 아빠의 인터페이스에 작성된 메서드도 진행
public class 자식 extends 엄마 implements  아빠 {
   // 필수로 작성해야하는 기능!
    @Override
    public void 예의() {
        System.out.println("자식은 어머니에게 예의를 배웁니다.");
    }

    @Override
    public void 책읽기() {
        System.out.println("자식은 책을 읽습니다.");
    }

    @Override
    public void 스포츠활동() {
        System.out.println("자식은 스포츠활동을 합니다.");
    }
}
