package com.kh.poly.pack2.maver;

public class 메이버회원 {
    private String 유저이름;
    private String 유저번호;
    private String 유저주소;
    private String 유저나이;

    // 메서드
    // 기본 필수 생성자 Setter Getter toString
    public 메이버회원() {
    }

    public 메이버회원(String 유저이름, String 유저번호, String 유저주소, String 유저나이) {
        this.유저이름 = 유저이름;
        this.유저번호 = 유저번호;
        this.유저주소 = 유저주소;
        this.유저나이 = 유저나이;
    }

    public void set유저이름(String 유저이름) {
        this.유저이름 = 유저이름;
    }

    public void set유저번호(String 유저번호) {
        this.유저번호 = 유저번호;
    }

    public void set유저주소(String 유저주소) {
        this.유저주소 = 유저주소;
    }

    public void set유저나이(String 유저나이) {
        this.유저나이 = 유저나이;
    }

    public String get유저이름() {
        return 유저이름;
    }

    public String get유저번호() {
        return 유저번호;
    }

    public String get유저주소() {
        return 유저주소;
    }

    public String get유저나이() {
        return 유저나이;
    }

    @Override
    public String toString() {
        return "메이버회원{" +
                "유저이름='" + 유저이름 + '\'' +
                ", 유저번호='" + 유저번호 + '\'' +
                ", 유저주소='" + 유저주소 + '\'' +
                ", 유저나이='" + 유저나이 + '\'' +
                '}';
    }
}


