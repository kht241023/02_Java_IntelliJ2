package com.kh.oop.constructor;

public class Snack {
    //1. 필드
    private String name;
    private int price;
    private String taste;

    //2. 메서드
    // 2-1 기본생성자
    public Snack() {
    }
    // 2-2 매개변수 ALL 생성자
    public Snack(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }
    // 2-3 Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    // 2-4 Getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }

    //2-5 toString

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }

    /*
    * SnackRun 에
    * sr1 sr2 sr3
    * 1. 기본생성자
    * 초코칩 쿠키 1500원 달콤한 초코맛
    * 허니버터집  2000원 달콤한 버터맛
    *
    * 2. 매개변수 ALL 생성자
    * 새우깡     1200 짭잘한 새우맛
    *
    * 과자 정보 toString 출력
    *
    * */
}
