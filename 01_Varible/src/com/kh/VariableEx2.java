package com.kh;

public class VariableEx2 {
    // 클래스에서 main 으로 작성된 기능이 없으면
    // 출력 XXX

    // 최종으로 실행한다는 기능
    // main 메서드
    // 메인메서드 ( 프로그램 실행)
    public static void main(String[] args) {
        /** 컴퓨터 값 처리 원칙
         * - 같은 자료형 끼리 연산, 결과도 같은 자료형
         *
         *
         * ** 형변환 **
         * - 다른 자료형 끼리 연산하는 경우 자료형을 맞게 변환
         *
         * ***** 자동 형변환 *****
         * - 연산 시 값의 범위가 작은 자료형을
         * 값의 범위가 큰 자료형 변환
        * */


        // 자동 형변환 확인 1
        int num1 = 9;
        long num2 = 10_000_000_000L;//100억

        // num1과 num2를 합쳐서 담을 경우
        long result1 = num1 + num2;

        // int 자료형 공간에 num1과 num2를 합쳐서 담을 것
        //int result2 = num1 + num2;
        // long보다 작은 int 안에 int + long을 담으려 했기 때문에 문제 발생
        System.out.println(result1);


    }
}
