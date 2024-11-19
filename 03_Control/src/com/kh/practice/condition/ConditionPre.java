package com.kh.practice.condition;


import java.util.Scanner;

// switch case 문으로 나이를 입력받고
// 나이가 13세 이하 어린이
//        18세 이하 청소년
//        19세 이상 성인  출력
// 메서드명 = methodAge()
//최종 실행 ConditionPreRun 진행
public class ConditionPre {
    public void  methodAge(){
        Scanner sc = new Scanner(System.in);

        // 나이 입력을 하기 위한 나이입력 안내 출력문 + 작성공간
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        //Switch-case 를 사용한 나이 분류
        switch (age / 10) {
            case 0 : case 1:
                System.out.println("어린이입니다.");
                break;
            case 2 :
                if(age <= 18) {
                System.out.println("청소년입니다.");

                } else {
                    System.out.println("어른입니다.");
                }
                break;
            default:
                System.out.println("성인입니다.");
                break;
        }
    }
}
