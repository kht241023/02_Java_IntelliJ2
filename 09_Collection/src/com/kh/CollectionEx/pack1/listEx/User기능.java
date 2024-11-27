package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1. 저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> userList = new ArrayList<>();

    //2. 스캐너 사용
    private Scanner sc = new Scanner(System.in);

    //3. 사용자 추가 기능 만들기!
    public void addUser(){
        System.out.println("\n=== 사용자 추가 ===");
        System.out.print("사용자 이름 : ");
        String username = sc.nextLine();

        System.out.print("비밀번호 : ");
        String password = sc.nextLine();

        System.out.print("이메일 : ");
        String email = sc.nextLine();

        // 새 User 객체를 생성하고 리스트에 추가
        User newUser = new User(username, password, email);
        userList.add(newUser); // 새로 만들어진 유저를 담고 있는 변수를 유저리스트목록에 추가

        System.out.println("사용자가 성공적으로 추가되었습니다.");
    }


    //4. 유저 목록 조회하기
    public void allUsers(){
        System.out.println("\n==== 추가된 사용자 목록 ====");
        //  만약에 등록된 사용자가 없다면 "등록된 사용자가 없습니다." 출력
        if(userList.isEmpty()){
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            //  하나는 주석 처리해서 일반for문 하나는 향상된 for문
            for(int i=0; i<userList.size(); i++){
                System.out.println(userList.get(i).toString()); //index 0번부터 size 끝까지 모두 목록들을 돌아가면서 출력
            }
            //  사용자가 1명이라도 존재한다면 향상된 for문을 이용해서 유저들을 모두 출력
            for (User user : userList) {
                System.out.println(user); //userList에 작성되어있는 유저목록을 하나씩 꺼내서 user에 순차적으로 담아줌
            }
        }

    }

    //5. 유저 삭제하기
    public void removeUser(){
        // ClothingStore 방법과 동일하게 유저이름을 찾고 유저를 제거
        System.out.println("\n ===사용자 제거===");
        System.out.print("제거하고자 하는 사용자의 이름을 입력하세요 : ");
        String username = sc.nextLine();

        boolean found = false; //삭제 여부를 확인하기 위한 변수

        for (int i = 0; i < userList.size(); i++) {
            // 만약에 사용자이름이 유저목록에 일치하는 유저가 존재한다면
            if (userList.get(i).getUsername().equals(username)) {
                userList.remove(i); //해당하는 index 번호를 삭제
                System.out.println(" [ " + username + " ] 회원이 성공적으로 삭제되었습니다.");
                found = true;
                break; //삭제 후 반복문 종료
            }
        }

        // 만약에 일치하는 유저가 없다면
        if(!found){
            System.out.println(" [ " + username + " ] 회원을 찾을 수 없습니다.");
        }
    }
}












