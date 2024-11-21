package com.kh.oop.methodex;

public class Void메서드실행 {
    public static void main(String[] args) {
        Void메서드 v1 = new Void메서드();
        v1.method1();

        String userId = "홍길동";
        v1.method2(userId); // = v1.method2("홍길동");

        // 40이라는 나이를 age로 전달하고
        int age;
        age = 40;
        v1.method3(age);

        //method4의 경우 String , int 순서대로 값을 넣어주겠다 표기를 해놓았기 때문에
        // 1번 자리에는 String과 같은 문자열이 들어가야함
        // 2번 자리에는 int와 같은 정수형이 들어가야함
        v1.method4("박철수",50);

        String id = "kht";
        String pw = "kht1121@";
        v1.login(id, pw);
    }



}
