package com.kh.oop.constructor;
/*
* @ 어노테이션으로
* 기본생성자, 필수생성자, 게터 세터, toString
* 모두 작성할 예정이지만
* 현재 메서드를 익히고 있는 과정이기 때문에 단축키를 활용해서 작성
* */
public class Student {
    //이름 나이 성별 전공 학점 전화번호 이메일 주소
    //필드 속성 인스턴스변수 멤버 변수
    private  String name; //이름
    private  int age; //나이
    private String gender;
    private String major;
    private double gpa;
    private String phoneNumber;
    private String email;
    private String address;


    //메서드 (기능들) 단축키 Alt + insert를 이용해서 모두 작성

    // 1. 기본생성자
    public Student() {
    }

    //2. 파라미터 생성자

    public Student(String name, int age, String gender, String major, double gpa, String phoneNumber, String email, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
        this.gpa = gpa;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // 3. setter

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

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    // 5. toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}










