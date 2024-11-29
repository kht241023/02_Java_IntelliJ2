package com.kh.pack2.pre2;

public class FileWriteRun {

    public static void main(String[] args) {
        // FileWritePre에서
        // createTxt(path, fileName) 기능을 가져와서
        // 바탕화면에 user.txt 파일 생성

        FileWritePre fileWritePre = new FileWritePre();
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "user.txt";

        System.out.println("=== [" + fileName + "]생성 시작 ===");
        fileWritePre.createTxt(path, fileName);

        // writeTxt(path, fileName) 기능을 가져와서
        // user.txt 이름 성함 연락처 작성하고 저장하기
        System.out.println("=== [" + fileName + "] 작성 시작 ===");
        fileWritePre.writeTxt(path, fileName);
    }
}
