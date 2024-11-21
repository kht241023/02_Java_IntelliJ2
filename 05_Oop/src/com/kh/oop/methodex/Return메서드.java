package com.kh.oop.methodex;


public class Return메서드 {

    /*
    데이터베이스에 저장 되어있는 값을 프론트엔드에 전달할 때 주로 사용

    return 자바 메서드(=기능)에서 값을 반환하는데 사용
    메서드가 특정 작업을 수행한 후 결과를 호출자에게 전달하려면
    return 사용해야함
    public 자료형 메서드명(매개변수이름자리) {
        // 기능 작성
        return  (생략가능한 변수명자리)    ;
    }
    */
    // 1. 매개변수가 없는 return 메서드
    public String method1(){
        return "안녕하세요!!";
    }

    // 2. 매개변수가 있는 return 메서드
    // method2에 전달받는 숫자값을 전달해주기
    public int method2(int abc){
        return abc;
    }

    // 3. 매개변수에 있는 자료형과 return 자료형이 다른 메서드
    public String method3(int xyz){
        return  "숫자가 들어왔습니다."; //String

    }

    // 3-1. 아이디찾기
    public int findId(String name, int phone) {
        //이름과 핸드폰번호가 일치하는 아이디가 존재했을 때
        //그리고 그 아이디는 숫자값일 때
        return 123456789;
    }

    // 4. 매개변수를 활용해서 return 값 가져오기
    public int  더하기(int a, int b) {
        return a + b;
    }

    public int 빼기 (int c, int d) {
        int 결과값 = c - d;
        return 결과값;
    }

}
