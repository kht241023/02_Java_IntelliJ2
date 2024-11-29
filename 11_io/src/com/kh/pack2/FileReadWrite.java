package com.kh.pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    // 파일을 바탕화면에 만들고 파일 안에 글자 작성하기
    public void method1(){
        System.getProperty("user.home"); //c/users/user1  + /바탕화면
                            //  c    users    user1   바탕화면  에서 ex1.txt 만들기
        File file = new File(System.getProperty("user.home") + "/Desktop/ex1.txt");
        // 기존에는 createNewFile() 생성

        try {
            if(file.exists()){ // 파일이 존재하지 않는 경우 파일 생성
                System.out.println("파일이 존재합니다.");

            } else  {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }


        // 생성된 파일 글자를 작성하기
        // 글자를 작성할 때 BufferedWriter FileWriter를 사용해서 작성

        try { //파일 안에 글을 작성하는 건 문제가 많을 수 있기 때문 예외상황 감지하는 try - catch 사용
            FileWriter writer = new FileWriter(file); //File안에 Writer 글자 작성

            String content = "안녕하세요. 반갑습니다. 환영해요.";

            writer.write(content); //파일쓰기 기능으로 파일안에 글자를 쓸 기능 호출 () 안에 작성할 내용 넣어주기
            writer.close(); //파일에 글자를 작성하고 나면 반드시 닫아야함
            System.out.println("파일에 내용이 작성되었습니다.");

        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");
        } finally {
            System.out.println("글쓰기 작업을 종료합니다.");
        }


    }

    // 만들어진 파일에 이어서 글자 작성하기 (feat. FileWriter)
    // true를 작성하지 않으면 기본적으로 false 상태로 파일이 존재할 경우 덮어쓰기 진행
    // FileWriter fw = new FileWriter("파일명", true) true 파일 이어쓰기 모드 활성화
    public void method2(){
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home") + "/Desktop/ex1.txt");

        // FileWriter를 이용해서 이어쓰기 진행
        try {
            FileWriter fw = new FileWriter(file, true); //파일이 존재할경우 이어쓰기모드

            String content2 = "\n이어서 작성한 내용입니다."; //새로운 내용 추가
            fw.write(content2);
            fw.close(); //이어 작성 완료 후 파일닫기 = 저장
            System.out.println("파일 이어서 작성하기를 완료했습니다.!");
        } catch (IOException e) {
            System.out.println("이어서 작성하는 것을 실패했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
