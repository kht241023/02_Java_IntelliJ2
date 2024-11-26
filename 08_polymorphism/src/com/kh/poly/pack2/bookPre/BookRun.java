package com.kh.poly.pack2.bookPre;

public class BookRun {
    public static void main(String[] args) {
        EBook eBook = new EBook("자바 프로그래밍","홍길동",2000,"15.5MB");
        System.out.println(eBook.toString());

        PrintBook printBook = new PrintBook("파이썬 입문", "이영희", 18000, 3000);
        System.out.println(printBook.toString());
    }
    /*
    전자책 정보:
    제목: 자바 프로그래밍, 저자: 홍길동, 가격: 20000원
    파일 크기: 15.5MB

    종이책 정보:
    제목: 파이썬 입문, 저자: 이영희, 가격: 18000원
    배송비: 3000원
    */
}
