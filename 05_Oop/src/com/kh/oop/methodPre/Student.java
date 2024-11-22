package com.kh.oop.methodPre;

public class Student {
    // 필드 = 속성 = 멤버변수 = 전역변수(클래스 내 전국지역에서 쓰이는 변수)
    // 학생의 이름, 나이 학년 전공
    private String name;        //이름
    private int age;            //나이
    private String gender;      //성별
    private String major;       //전공

    //생성자 : 기본
    public Student() {}

    //생성자 (모든 파라미터값을 필수로 가져와서 넣기 때문에 필수 생성자  All Con st ru ctor)
    public Student(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    //Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }
}
