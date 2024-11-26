package com.kh.poly.pack3.interfaceEx;

// Animal을 상속받는 뱀은 무조건 eat과 sleep의 기능을 구현해야함
public class Snake extends Animal {
    private int poison;

    public Snake() {
    }

    public Snake(String type, int poison) {
        super(type);
        this.poison = poison;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    @Override
    public String toString() {
        return  super.toString() + " poison :  "+ poison ; //부모 출력 + 독 출력
    }

    // Animal 클래스에서 완성되지 않은 기능 재정의
    @Override
    public void eat() {
        System.out.println("뱀은 똬리를 틀고 한 번에 삼켜서 천천히 소화시킴");
    }

    @Override
    public void sleep() {
        System.out.println("뱀은 똬리를 틀고 잠을 잔다.");

    }
}
