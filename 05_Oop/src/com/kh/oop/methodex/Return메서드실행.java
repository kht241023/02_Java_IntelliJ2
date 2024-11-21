package com.kh.oop.methodex;

public class Return메서드실행 {
    public static void main(String[] args) {
        Return메서드 rm = new Return메서드();

        // 1. return은 원래 값을 가지고 있는 기능이지 출력기능아님!
        // return 메서드는 값을 전달하는 메서드
        // 출력해서 보여주는 메서드 X
        // 만약에 return으로 전달받는 값을 알길 원한다면
        // System.out.println(); 소괄호 안에
        // System.out.println(rm.method1());    <--rm.method1() 넣어줌
        rm.method1(); //값이 있지만 보여달라는 기능을 사용하지 않았기 때문에
        // 값이 보이지 않는 것일 뿐
        
        // 2. print출력문 안에 기능을 작성해주었기 때문에
        // rm.method1() 기능 안에 들어있는
        // return 값을 확인할 수 있음
        System.out.println(rm.method1());

        // 3. print 출력문으로 작성하기 전에
        // 메서드1 변수명에 기능을 담아두고
        // 메서드1 이름으로 전달하기
        String 메서드1 = rm.method1();
        System.out.println(메서드1);

        /**** 매개변수가 있는 Return 메서드 ****/
        int a = rm.method2(5); //5라는 값을 가지고 있는 상태
        //출력해달라는 요청이 없기 때문에 눈에 보이진 X
        System.out.println(a);

        System.out.println("이름이 박동식이고, 번호 뒤 네자리가 8857인 사람의 아이디 찾기");
         int b = rm.findId("박동식", 8857);
         System.out.println("박동식의 숫자 아이디 : " + b);

         int result1 = rm.더하기(2,1);
         System.out.println(result1);

         int result2 = rm.빼기(3,1);
         System.out.println(result2);
    }
}
