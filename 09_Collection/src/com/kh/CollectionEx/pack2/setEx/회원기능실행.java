package com.kh.CollectionEx.pack2.setEx;

public class 회원기능실행 {

    public static void main(String[] args) {
        회원기능 service = new 회원기능();

        회원 u1 = new 회원(1, "홍길동", "hong@kht.com", "산타기");
        회원 u2 = new 회원(2, "강길자", "gil@kht.com", "강구경하기");
        회원 u3 = new 회원(3, "박창실", "shil@kht.com", "십자수");


        //서비스에 있는 회원 저장 기능 호출해서 u1, u2, u3 모두 저장하고
        service.addUser(u1);
        service.addUser(u2);
        service.addUser(u3);

        //서비스에 있는 저장된 회원 모두 조회
        service.allUser();

        // 회원 검색 기능 설정
        service.searchUser(2);
    }
}
