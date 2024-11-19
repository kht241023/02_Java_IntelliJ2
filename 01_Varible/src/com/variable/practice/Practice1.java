package com.variable.practice;

import java.util.Scanner;

public class Practice1 {

    // 메인으로 출력하는 메서드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 한글자를 작성하시오: ");
        char inputChar = sc.next().charAt(0); //문자열에서 첫글자만 가져오기
        
        int unicode = (int) inputChar; 
        //붙이지 않아도 에러가 나지 않을 수 있지만 서로 다른타입에서 이동하는 것이기 때문에
        // 문자 -> 숫자    강제형변환임을 표기
        
        System.out.println(inputChar + " 유니코드 :" +unicode);
        
        // 스캔이 모두 종료되면 닫아주기
        sc.close(); //스캐너를 모두 사용하면 닫아주는 것이 좋음

        // Run 단축키 -> Ctrl + Shift + F10
    }
}
