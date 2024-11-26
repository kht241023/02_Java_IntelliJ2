package com.kh.poly.pack2.bookPre;

public class Book {
    //필드
    private String title;
    private String author;
    private int price;

    //메서드 기본 필드 Setter Getter toString

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    /*
        만약에 부모 클래스에서 toString을 작성하지 않으면
        아래와 같이 출력
        com.kh.poly.pack2.bookPre.EBook@5594a1b5fileSize='15.5MB
        com.kh.poly.pack2.bookPre.PrintBook@6aaa5eb0shippingCost=3000
    */
}
