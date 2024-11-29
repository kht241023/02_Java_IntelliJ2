package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {
        // 1. 바탕화면에 hello.txt 만들고
        String path = System.getProperty("user.home") + "/Desktop/";
        File file = new File(path + "hello.txt");

        // 2. 파일 존재하는지 확인하고 파일 생성
        try {
            if(file.exists()) {
                System.out.println("이미 파일이 존재합니다.");
                return; // 파일이 이미 존재하고 덮어쓰기가 돼서
                // 글 작성이 되는 것을 방지하기 위해 return 돌려보내기 추가
            } else {
                file.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
            return; //프로그램에서 더이상의 코드를 실행하지 않겠다는 return 돌려보내기 작성
        }



        // 3. 안녕하세요 Hello Hi
        try {
            FileWriter fw = new FileWriter(file);
            String content = "안녕하세요. \nHello \nHi";
            fw.write(content);
            fw.close(); //글 작성 다하면 종료
            System.out.println("글 작성이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
        // 작성 후 파일을 닫고 프로그램 종료

    }
}
