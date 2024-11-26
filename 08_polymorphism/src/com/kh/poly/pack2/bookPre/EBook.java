package com.kh.poly.pack2.bookPre;

public class EBook extends Book {
    //필드
    private String fileSize;

    //메서드 기본 필수 세터 게터 toString

    public EBook() {
    }

    public EBook(String title, String author, int price, String fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "fileSize='" + fileSize;
    }
}
