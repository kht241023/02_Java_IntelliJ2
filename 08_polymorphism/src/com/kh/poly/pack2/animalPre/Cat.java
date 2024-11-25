package com.kh.poly.pack2.animalPre;

public class Cat extends Animal {
    private String 색상;
    private int 펀치횟수;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String 색상, int 펀치횟수) {
        super(name, age);
        this.색상 = 색상;
        this.펀치횟수 = 펀치횟수;
    }

    public String get색상() {
        return 색상;
    }

    public void set색상(String 색상) {
        this.색상 = 색상;
    }

    public int get펀치횟수() {
        return 펀치횟수;
    }

    public void set펀치횟수(int 펀치횟수) {
        this.펀치횟수 = 펀치횟수;
    }

    @Override
    public String toString() {
        return super.toString() +
                "색상='" + 색상 + '\'' +
                ", 펀치횟수=" + 펀치횟수 +
                '}';
    }
}
