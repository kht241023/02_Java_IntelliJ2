package com.kh.oop.constructor;

public class People {

    // 필드
    private String name;
    private int age;

    //메서드
    //1. 기본생성자
    // 매개변수를 하나도 받지 않는 생성자
    public People(/*매개변수가 없음!*/) {
    }


    //2. 파라미터 생성자
    //2.... 파라미터 생성자 (part, ALL)
    //2-1. 모든 필드에 값을 넣는 생성자
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //2-2. 부분적으로 값이 필수로 들어가야하는 필드만 선택하는 생성자
    // (만약에 이름만 필수로 전달받길 원하는 case
    public People(String name) {
        this.name = name;
    }

    // (만약에 나이만 필수로 전달받길 원하는 case
    public People(int age) {
        this.age = age;
    }

    //3. 개발자가 넣은 값을 무사히 잘 넣었는지 확인하는 toString
        //Override를 사용시 @Override 를 안붙여도 되지만 붙여주기
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
