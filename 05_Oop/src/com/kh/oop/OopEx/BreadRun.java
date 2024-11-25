package com.kh.oop.OopEx;

public class BreadRun {
    public static void main(String[] args) {
        Bread b1 = new Bread();
        b1.setBreadName("소금빵");
        // b1에 들어가는 값은 오직 소금빵이지만
        // b2에 들어가는 값은 초코소라빵 1500원 2개가 모두 작성되어야 하는 것
        Bread b2 = new Bread("초코소라빵",1500,2);

        System.out.println(b1.getBreadName());
        System.out.println("b2와 b1 값 이 어떻게 설정되어있는지 확인하기");
        System.out.println(b2.toString());
        System.out.println(b1.toString());
        // int 정수형에 아무값도 들어가지 않으면 기본값은 0
        // String 문자열에 아무값도 들어가지 않으면 기본값은 null
    }
}
