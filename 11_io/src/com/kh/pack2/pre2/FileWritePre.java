package com.kh.pack2.pre2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre {

    /**
     * createTxt(String path, String fileName)
     * @param path     = 파일 경로
     * @param fileName = 파일 명칭
     */
    public void createTxt(String path,String  fileName){
        File file = new File(path + fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("파일을 성공적으로 만들었습니다. : " + fileName);
            } catch (IOException e) {
                System.out.println("파일 만들기를 실패했습니다.");
                return;
            }
        } else {
            System.out.println("이미 존재하는 파일입니다. : " + fileName);
            return;
        }

    }

    /**
     * writeTxt(String path,String  fileName)
     * @param path     = 파일 경로
     * @param fileName = 파일이름
     */
    public void writeTxt(String path,String fileName){
        File file = new File(path + fileName);

        try {
            FileWriter fw = new FileWriter(file, true);
            Scanner sc = new Scanner(System.in);
            System.out.print("작성할 내용을 입력하세요 : ");
            String content = sc.nextLine();
            fw.write(content);
            fw.close();
           System.out.println("파일쓰기를 완성했습니다.");
        } catch (IOException e) {
           System.out.println("파일쓰기를 완성하지 못했습니다.");
        }


    }
}
