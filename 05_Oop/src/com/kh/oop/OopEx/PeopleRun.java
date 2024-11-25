package com.kh.oop.OopEx;

public class PeopleRun {
    public static void main(String[] args) {
        // 이름 주민번호 연락처
        People p = new People("홍길동",800101,23467890);
        System.out.println(p.toString());
        People p2 = new People("강길자", 500101, 98765432); //취미 특기까지 모두작성
       
       // 필수로 저장해야되는 값은 아니지만 추가적으로 DB에 넣고자하는 값 구분 지을 수 있음
        p2.setHobby("음악듣기");
        p2.setSpecialty("코딩");
        System.out.println(p2.toString());
    }
}
