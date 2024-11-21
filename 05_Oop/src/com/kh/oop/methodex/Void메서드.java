package com.kh.oop.methodex;

public class Void메서드 {

    // 1. 매개변수 없이 전달할 이유도 없기 기능을 실행하는 역할
    public void method1() {
        System.out.println("안녕하세요.");
    }

    // 2. 매개변수가 존재하는 void 메서드
    /*
     * 매개변수명은 지역변수로 오직 메서드 내부에서
     * 자료형을 전달하는 변수명의 역할을 주로 하기 때문에
     * userId가 아니라 xyz라는 이름을 넣어도되고
     * 어떤 이름을 넣든 문제X
     * */

    /*
    public void 기능명(String 값이들어올공간만들어주기){
        System.out.println("안녕하세요, " + 들어온값보여주기 + " 님!");
    }
    */

    public void method2(String userId) {
        System.out.println("안녕하세요, " + userId + " 님!");
    }

    public void method3(int age) {
        System.out.println(age + "세 입니다.");
    }

    // 자료형과 매개변수가 두 개 이상 들어가는 메서드
    // 이름을 문자열로 받고, 나이를 int로 받는다.
    public void method4(String name, int age) {
        // 00님의 나이는 00 이군요!
        System.out.println(name + "님의 나이는 " + age + "세 이군요!");
    }


    public void login(String id, String pw) {
        System.out.println("아이디는" + id + "입니다");
        System.out.println("비밀번호는" + pw + "입니다");

    }

    public void findId(String name, String email) {

        System.out.println("아이디는 kht 입니다.");
    }
}









