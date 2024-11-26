package com.kh.poly.pack3.interfaceEx;
//추상클래스
public abstract class Animal {
    // 동물들의 공통된 필드 / 메서드 작성
    private String type;
    
    public Animal() {}
    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  type; //출력으로 type만 출력
    }
    /*
    모든 동물이 가지고 있는 기능
    모든 동물이 먹고, 자는 행위를 가지고 있음
    그 방법들이 너무 다양해서 하나로 정의 내리기가 여러움
    
    Animal 클래스를 상속 받는 자식 클래스가
    각자에게 맞춰 재정의(Overrrding) 하도록 강제화 시킴
    */
    
    //기능을 세부적으로 설정할 필요가 없기 때문
    // 예전에는 맨 뒤에         {}를 붙였는데 추상메서드는 {} 붙이지 않음
    //public abstract void eat()   ;
    public abstract void eat();
    public abstract void sleep();
}
