package com.kh.exceptionPre;

public class ExceptionService {

    public void method1(){
        String name1 = "감길자";
        int health1 = 50; //체력이 100점 만점에 50

        String name2 = "영길동";
        int health2 = 80; //체력이 100점 만점에 80

        try {
            // 감길자씨와 홍길동씨의 평균 체력을 계산
            System.out.println(name1 + " 와 " + name2 + " 의 평균 체력을 계산합니다.");

            // 문제가 발생할 수 있는 코드
            int avgHealth = (health1 + health2) / 0;
            System.out.println("평균 체력 : " + avgHealth);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); //발생한 문제가 무엇인지 출력문으로 확인하되
            // 프로그램이 강제로 종료되거나 프로그램 진행에 있어서 문제가 생기지는 않음
            System.out.println("제가 예상한대로 0으로 평균체력 나눠서 발생한 사건이 맞군요!");
        } catch (Exception e) {
            System.out.println(e.getMessage()); //예상치 못한 문제가 무엇인지 확인
            // 어떤 문제인지 예상할 수 없을 때 작성하는 Exception으로
            // 보통 맨 마지막에 프로그램의 흐름을 원활하게 진행하기 위해 작성해줌
            System.out.println("어떤 문제인지 어림짐작할 수 는 없지만 문제가 생기긴 했어요.");
            System.out.println("문제를 확인하고 개발자분은 해결하시길 바랍니다.");
        }
    }

    public void method2(){
        try {
            int arr[] = {1,2,3,4,5};

            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
