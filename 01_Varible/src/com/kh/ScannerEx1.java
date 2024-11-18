package com.kh;

import java.util.Scanner;
public class ScannerEx1 {

    public static void main(String[] args) {
        /* Scanner 클래스
        *
        *  - 사용자로부터 입력을 받기위해 Java에서 제공하는 크래스
        *
        * - java.util 패키지에 존재
        *   -> import 구문 작성 필요
        *
        * - Scanner.next() : 단어(String)1개 입력  공백 문자 입력 시 입력 종료
        *
        * - Scanner.nextLine() : 문자열(String) 1개 입력 엔터(개행 문자) 입력 시 종료
        *
        * - Scanner.nextInt()  : int 형 정수 1개 입력
        * - Scanner.nextLong() : long 형 정수 1개 입력
        * - Scanner.nextDouble() : 실수 1개 입력
        */

        //Scanner 사용 하기

        // 1. 클래스 위 import 하는 구문 작성

        // 2. import한 Scanner 클래스를 이용해서 Scanner 객체 생성

        // *System.in : (인텔리제이, 이클립스) 키보드

        Scanner sc = new Scanner(System.in);

        // console 창에서 어떤 것을 입력해야하는지 입력창표기를 위한 print 작성
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt(); //다음 입력된 정수를 얻어와 num1 대입
        System.out.println("num1에서 가져온 정수는 : "+num1);

        System.out.print("정수입력 2 : ");
        int num2 = sc.nextInt(); //정수입력 2: 가 나온다음 입력된 정수를 얻어와 num2 대입

        System.out.print("실수입력 : ");
        double num3 = sc.nextDouble();


        System.out.println("num2에서 가져온 정수는 : " + num2);
        System.out.println("num3에서 가져온 실수는 : " + num3);

        System.out.print("단어를 2가지 입력하세요 : "); // 포도 오렌지 입력 후 enter
        String 단어1 = sc.next();
        String 단어2 = sc.next();

        System.out.println("단어 두가지 출력하기 : " + 단어1 + 단어2);

        // **************************************************************
        // -next() / nextInt() / nextDouble() 등을 작성한 이후에
        // nextLine() 을 작성해야하는 상황이 오면
        // nextLine() 구문을 미리 한 번 작성하기


    }
}


















