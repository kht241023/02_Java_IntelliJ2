package com.kh.loof;

public class LoofRun {

    // 필드 변수명은 main메서드 안에 작성하지 않아도 문제가 없음
    // 외부클래스명(외부자바파일)에서 가져오는 기능은 무조건
    // void메서드 main메서드 return메서드 내부에 작성해줘야함

    public static void main(String[] args) {
        LoofEx l = new LoofEx();
       // l.method1();
        //l.method2();
       // l.method3();
        //l.method4();

        LoofEx2 l2 = new LoofEx2();
        //l2.while1();
        //l2.while2();
        //l2.while3();
        //l2.while4();

        Menu  menu = new Menu();
        //menu.order(); //menu라는 변수명으로 주문 기능 가져오기

        LoofDoWhile ldw = new LoofDoWhile();
        ldw.method1();
    }



















    public void abc(){
        LoofEx l = new LoofEx();
        l.method1();
    }

   // LoofEx l = new LoofEx();
   // l.method1(); 메서드(기능) 내부에 존재하지 않기 때문에 error 발생
}
