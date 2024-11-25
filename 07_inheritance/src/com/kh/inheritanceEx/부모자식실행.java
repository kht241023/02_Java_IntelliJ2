package com.kh.inheritanceEx;

public class 부모자식실행 {
    public static void main(String[] args) {
        // 자식 클래스의 기본 생성자 사용해서 자식 출력
        자식 자식1 = new 자식();
        자식1.set돈(50_000_000); //부모클래스의 Setter 메서드를 사용 가능
        자식1.set차("아반떼");
        자식1.set취미("요트타기");
        System.out.println(자식1.toString());

    }
}
