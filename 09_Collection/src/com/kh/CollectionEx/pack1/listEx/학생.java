package com.kh.CollectionEx.pack1.listEx;

public class 학생{
    private String 이름;
    private int 학년;
    private String 취미;

    public 학생() {
    }

    public 학생(String 이름, int 학년, String 취미) {
        this.이름 = 이름;
        this.학년 = 학년;
        this.취미 = 취미;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public int get학년() {
        return 학년;
    }

    public void set학년(int 학년) {
        this.학년 = 학년;
    }

    public String get취미() {
        return 취미;
    }

    public void set취미(String 취미) {
        this.취미 = 취미;
    }

    @Override
    public String toString() {
        return "학생{" +
                "이름='" + 이름 + '\'' +
                ", 학년=" + 학년 +
                ", 취미='" + 취미 + '\'' +
                '}';
    }
}
