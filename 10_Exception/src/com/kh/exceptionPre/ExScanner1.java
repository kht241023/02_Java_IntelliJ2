package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 스캐너로 숫자를 입력받고 나누기에 대한 결과 확인

        try {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            // 나누기 연산
            int 나누기결과 = num1 / num2;
            System.out.println("나누기결과 : " + 나누기결과);

        } catch (ArithmeticException e) {
           System.out.println("예외 발생 : " + e);
           System.out.println("0으로 숫자를 나눌 수 없습니다. ");
           System.out.println("프로그램을 종료합니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치 못한 문제가 발생했습니다.");
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
