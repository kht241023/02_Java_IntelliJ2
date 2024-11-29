package com.kh.pack2.pre;

public class FileWriterRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.txt";

        FileWriterPre5  fwp5 = new FileWriterPre5();

        // 파일 생성하기 기능
       // 파일생성기능(path, fileName);
        fwp5.createFile(path, fileName); //파일 생성하기 기능 가져와서 경로 파일명 호출

        //파일 작성기능
        fwp5.writeFile(path, fileName);
    }
}
