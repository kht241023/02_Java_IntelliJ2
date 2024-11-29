package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {

    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "menu.txt";

        File file = new File(path + fileName);

        if (file.exists()) {
            try {
                FileWriter fw = new FileWriter(file,true);
                String content = "\n 떡볶이, 순대, 마라탕";
                fw.write(content);
                fw.close();
                System.out.println("글자 작성을 완료했습니다.");
            } catch (IOException e) {
                System.out.println("글자 작성중 문제가 발생했습니다.");
            }
        } else {
            try {
                file.createNewFile();
                FileWriter fw = new FileWriter(file,true);
                System.out.println("파일 생성을 완료했습니다.");
                String content = "떡볶이, 순대, 마라탕 주문하기";
                fw.write(content);
                fw.close();
                System.out.println("글자 작성을 완료했습니다.");
            } catch (IOException e) {
                System.out.println("파일 만들기 및 글자 작성 중 문제가 발생했습니다.");
            }
        }
    }

}
