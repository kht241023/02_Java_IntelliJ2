package com.kh.oop.constructor;

public class Member {
    // 필드
    private String name;
    private int age;
    private String gender;

    //메서드
    // 기본생성자 필수생성자 세터 게터

    // 1. 아무것도 작성되어있지 않은 기본생성자
    public Member(){

    }

    // 2. 매개변수가 존재하는 파라미터 필수 생성자 ALL
    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 3. Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 4. Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // 기본생성자 필수생성자 세터 게터 이외 기능을 추가하고 싶다면 기능 작성!
    // 작성된 정보 불러오기 기능
    //toString 메서드 : 객체 변수명에 저장된 정보를 문자열로 전달해서 보여줌
    //toString 어떤 개발자가 다른 개발하는사람들이 편안하게 쓸 수 있도록
    //자바 자체에 만들어놓은 기능
    //붙여도 되고, 붙이지 않아도 됨 하지만 누군가가 만든 기능을 재사용하는 의미로 붙여주는 것이 좋음
    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}













