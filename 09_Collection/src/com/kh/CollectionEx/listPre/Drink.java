package com.kh.CollectionEx.listPre;

public class Drink {
    String name;
    private int price;

    public Drink() {
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "음료 이름 ='" + name + ", 음료 가격 =" + price ;
    }
}
