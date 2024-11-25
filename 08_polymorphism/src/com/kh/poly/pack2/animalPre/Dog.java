package com.kh.poly.pack2.animalPre;

public class Dog  extends Animal{
    private String 품종;
    private int 산책횟수;

    public Dog() {
        super();
    }

    public Dog(String name, int age, String 품종, int 산책횟수) {
        super(name, age);
        this.품종 = 품종;
        this.산책횟수 = 산책횟수;
    }


    public String get품종() {
        return 품종;
    }

    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    public int get산책횟수() {
        return 산책횟수;
    }

    public void set산책횟수(int 산책횟수) {
        this.산책횟수 = 산책횟수;
    }

    @Override
    public String toString() {
        return super.toString() +
                "품종='" + 품종 + '\'' +
                ", 산책횟수=" + 산책횟수 +
                '}';
    }
}
