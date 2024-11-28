package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner2 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        try {

            System.out.println("=== 게임 케릭터 정보 입력 === ");
            System.out.print("닉네임 : ");
            String nickname = sc.nextLine();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.println("게임 캐릭터가 성공적으로 만들어졌습니다.");
            System.out.println("캐릭터 정보 : " + nickname + " , 성별 : " + gender + " , 나이 : " + age);
        } catch (Exception e) {
            e.printStackTrace();
            /*
            e = exception or error
            print : 출력하다
            Stack : 메모리에서 stack 영역에 존재하는
            Trace : 것을 추적하다

            호출한 기능 순서대로 타고 들어가서 발생한 예외(문제) 들을 모두 추적해서
            개발자가 눈으로 확인할 수 있도록 출력
             */
            System.out.println("캐릭터를 만드는 도중 문제가 발생했습니다.");
        }finally {
            sc.close(); //검색 입력하는 창을 종료시킴
             System.out.println("게임을 종료합니다.");
        }


        try {
            int a = 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
            /*
            * throw 발생한 예외를 현재 위치에서 보여줌
            *
            * */
        }
    }
}
