package com.kh.CollectionEx.pack2.setEx;


import java.util.HashSet;

public class 회원기능 {

    // 1. 회원 객체 생성 user
        회원 user = new 회원();
        HashSet<회원> userList = new HashSet<>();

    // 2. 회원 추가 기능 public void addUser(){}
    public void addUser(회원 user) {
        // 만약에 회원이 존재하지 않는다면
        if(userList.add(user)){
            System.out.println("성공적으로 추가되었습니다.");
        } else {
            System.out.println("이미 존재하는 회원입니다.");
        }
    }

    // 3. 회원 모두 조회 기능 public void allUser(){}
    public void allUser(){
        //만약 등록된 회원이 없다면
        if(userList.isEmpty()){
            System.out.println("등록된 회원이 없습니다.");
        } else{
            for(회원 u : userList){
                System.out.println(u);
            }
        }
    }
    // 4. 회원 검색 기능 public void searchUser(int id);
    public void searchUser(int id){
        for(회원 u : userList){
            if (u.getId() ==id) {
                 System.out.println(u);
            } else {
                System.out.println("회원 x");
            }
        }
    }
    // 5. 회원 삭제 기능 public void deleteUser(int id);
    public void deleteUser(int id){
        for(회원 u : userList){
            if (u.getId() == id) {
                userList.remove(u);
                break;
            }
        }
        System.out.println("해당 메뉴가 삭제되었습니다.");
    }
}
