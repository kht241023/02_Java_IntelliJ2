package com.kh.oop.methodPre;

public class ReturnRun2 {
    // Main 메서드 최종으로 실행하고자하는 객체와 기능을 작성하는 기능
    public static void main(String[] args) {
        ReturnPre2 pre = new ReturnPre2();
        pre.method1("홍길동", 40);
        System.out.println("method1 번 출력확인 : " + pre.method1("홍길동", 40));

        pre.method2(123, 456);
        System.out.println("method2 번 출력확인 : " + pre.method2(123, 456));

        pre.method3(85);
        System.out.println("method3 번 출력확인 : " + pre.method3(85));

        pre.method4(100000 ,20);
        System.out.println("method4 번 출력확인 : " + pre.method4(100000, 20));

        pre.method6(17);
        System.out.println("method6 번 출력확인 : " + pre.method6(17));

        pre.method7("Hello", "World");
        System.out.println("method7 번 출력확인 : " + pre.method7("Hello", "World"));


        String arr[] = {"apple", "banana", "cherry"};
        pre.method8(arr, "banana");
        System.out.println("method8 번 출력확인 : " +  pre.method8(arr, "banana"));

        pre.method9(7);
        System.out.println("method9 번 출력확인 : " +  pre.method9(7));



    }
}
