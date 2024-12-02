package com.kh.pack2.pre4;

import com.kh.pack2.pre3.FileReaderPre;

public class HappyLunchReadRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "happyLunch.txt";

        HappyLunchRead frp = new HappyLunchRead();

        System.out.println("[" + fileName + "] 읽기 모드를 시작합니다.");
        frp.readTxt(path, fileName);
    }
}
