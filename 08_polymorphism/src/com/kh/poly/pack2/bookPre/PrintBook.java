package com.kh.poly.pack2.bookPre;

public class PrintBook extends Book {
    //종이책만의 추가 필드 배송비(int shippingCost)를 가짐
    private int shippingCost;

    public PrintBook() {
    }

    public PrintBook(String title, String author, int price, int shippingCost) {
        super(title, author, price);
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return super.toString() +
                "shippingCost=" + shippingCost;
    }
}
