package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {

    // 바탕화면 lunch.txt
    // 먹고싶은 점심메뉴 리스트를 줄바꿈을 이용해서 작성하고
    // 파일이 존재한다면 이미지 존재합니다 와 동시에 프로그램 return 으로 종료
    // main() 메서드 작성
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        File file = new File(path + "lunch.txt");

        // 2. 파일이 존재하는지 확인하고 없으면 생성 있으면 return 종료
        try {
            if(file.exists()){
                System.out.println("존재하는 파일입니다.");
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                file.createNewFile();
                System.out.println("파일을 생성합니다.");
            }
        } catch (IOException e) {
            System.out.println("예기치 못한 문제로 파일을 생성하지 못했습니다.");
            System.out.println("프로그램을 종료합니다.");
            return;
        }

        //3. 생성된 파일에 글자 작성
        try {
            FileWriter fw = new FileWriter(file);
            String content = "김밥\n햄버거\n피자\n삼각김밥";
            fw.write(content); //작성
            fw.close();// 무사히 작성 완료하면 파일 닫기
            System.out.println("파일에 내용이 작성되었습니다.");
        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");
        }finally {
            System.out.println("프로그램을 종료합니다.");
        }

    }


}
