package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre3 {
    public static void main(String[] args) {
    String path = System.getProperty("user.home") + "/Desktop/";
    String fileName = "menus.txt";

    //File file = new File(System.getProperty("user.home") + "/Desktop/"+"menu.txt");
    File file = new File(path+fileName);

    // 2. 파일 존재 여부 확인

        if (!file.exists()) { //파일이 존재하지 않는게 맞다면
            try {
                file.createNewFile();
                System.out.println("파일 만들기 성공했습니다. : " + fileName);
            } catch (IOException e) {
                System.out.println("파일 만들기에 실패했습니다. : " + e.getMessage());
                return; //파일이 없으니 작업 종료
            }
        } else { // 파일이 이미 존재한다면
            System.out.println("이미 존재하는 파일입니다. : " + file.getAbsolutePath()); // 이미 존재하는 파일 위치 확인
            return;
        }

        // 3. 파일에 글자 이어서 작성하기
        //빨간 밑줄위에 마우스를 대고 alt + enter 를 입력하면 선택할 수 있는 항목 표기
        try {
            FileWriter fw = new FileWriter(file, true); //true 작성 안하면 기본적으로 false = 파일이 존재하지 않는다면 덮어쓰기
           // String content = "양식\n한식\n중식\n일식";
            Scanner sc = new Scanner(System.in);
            System.out.print("작성할 내용을 입력하세요 : ");
            String content = sc.nextLine();
            fw.write(content); //파일에 내용 작성하기
            fw.close();
            System.out.println("파일에 내용이 추가되었습니다.");


        } catch (IOException e) {
           System.out.println("글자 작성에 실패했습니다. 다음에 다시 시도해주세요.");
        }finally {
            // 어떤 파일의 글쓰기 작업을 종료하는지 표기
            System.out.println(fileName + " 글쓰기 작업을 종료합니다.");
        }


    }
















    /*
     * main() 메서드
     * 바탕화면에 menu.txt 만들고
     * 존재한다면 "이미 존재하는 파일입니다." 종료(return)
     * 존재하지 않는다면 파일 생성
     *
     * FileWriter 만약에 파일이 존재할경우를 대비하여
     * 이어쓰기 모드 작성
     * 양식 한식 중식 일식 줄바꿈으로 작성
     * 생성
     *
     * */
}
