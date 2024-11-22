package com.kh.oop.methodPre;

public class Person {
   // private 멤버 변수 추후 DB 컬럼명과 소통할 변수
    private int age;

    //Setter
    public void setAge(int age) {
        this.age = age;
    }

    //Getter
    public int getAge() {
        return age;
    }
}
