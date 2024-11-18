package com.kh;

import java.util.Scanner;
// 줄바꿈 단축키 Alt + Shift + 화살표 위 / 아래
public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        이름을 입력하세요: 홍길동
        나이를 입력하세요: 25
        취미를 입력하세요: 독서
        */
        // String  name 이름 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = sc.next(); //사용자가 키보드로 입력하는 이름을 입력받는 공간

        // int      age 나이 입렵 받기
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); //사용자가 키보드로 입력하는 나이를 입력받는 공간

        // String hobby 취미 입력 받기
        System.out.print("취미를 입력하세요. : ");
        String hobby = sc.next();//사용자가 키보드로 입력하는 취미를 입력받는 공간
        // 출력 System.out.println
        /**
         * ===== 자기소개 =====
         * 이름: 홍길동
         * 나이: 25세
         * 취미: 독서
         */
        System.out.println("===== 자기소개 =====");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("취미: " + hobby);
    }
}
