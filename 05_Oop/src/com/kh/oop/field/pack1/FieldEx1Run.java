package com.kh.oop.field.pack1;

public class FieldEx1Run {
    public static void main(String[] args) {
        //FieldEx1 객체 생성
        FieldEx1 f1 = new FieldEx1();
        f1.method1();
        //변수에 무엇이 적혀있는지 출력문을 통해 확인하기
        System.out.println(f1.퍼블릭필드);
        System.out.println(f1.프로텍트필드);
        System.out.println(f1.디폴트필드);

        //private은 접근 불가
        // 다른클래스에서 변수명에 한 번에 접근할 수가 없기 때문
        //System.out.println(f1.프라이빗필드);
    }
}
