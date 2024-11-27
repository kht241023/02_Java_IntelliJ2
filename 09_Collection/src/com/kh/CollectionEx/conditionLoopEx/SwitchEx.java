package com.kh.CollectionEx.conditionLoopEx;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력하세요 : "); // 유저들에게 어떤 것을 입력해야하는지 알려주는 출력문
        int abc = sc.nextInt(); //홈페이지를 이용하는 유저가 원하는 것을 입력 받고 유저가 원하는 기능 실행
        // 스위치 안에 abc라는 값이 들어왔을 때 abc에 해당하는 조건 선택하고 기능 실행
        switch (abc) {
            case 1:
                System.out.println("1 번 기능 실행");
                break;
            case 2:
                System.out.println("2 번 기능 실행");
                break;
            default:
                System.out.println("1번과 2번이 모두 아닐 때 실행");
                break;
        }
    }
    /*
    switch 하나의 변수나 값을 여러 케이스로 나눠 조건에 따라 조건에서 원하는 기능을 실행
       switch(변수/값) {
        case 값1:
            // 값1에 해당하는 코드
            break;// 코드 실행 후 switch 종료
        case 값2:
            // 값2에 해당하는 코드
            break;

        default:
            // 위 조건에 맞지 않는 경우 실행될 코드
             break;
       }
    * */
}
