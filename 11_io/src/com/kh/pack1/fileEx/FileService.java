package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService {
    // method1 File 클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성
    public void method1(){
        // C:/Users/user1/바탕화면>
        // C:/Users/user1/Desktop>

        // 만약에 바탕화면에 만들고 싶다면?
        File 폴더 =  new File(System.getProperty("user.home") + "/Desktop/newFolders");

        System.out.println("폴더 위치              : " + 폴더.getPath());
        System.out.println("폴더 절대경로          : " + 폴더.getAbsolutePath());
        //폴더 절대경로          : C:/newFolder
        // 현재 우리가 실행하고 있는 파일 위치 기준 11_io 폴더 안에서 Users/user1/Desktop/newFolders 만든다는 것
        System.out.println("폴더 이름              : " + 폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : " + 폴더.exists());

        // 폴더 생성
        // 폴더가 존재하는지 존재하지 않는지 확인 후 폴더 생성
        if(폴더.exists()) {
            System.out.println("이미 존재하는 폴더입니다.");
        } else {
            폴더.mkdir();
            System.out.println("폴더 생성을 완료했습니다.");
        }

    }

    // method2 File 클래스 객체를 이용해서 파일이 존재하는지 확인하고 존재하지 않으면 파일 생성
    public void method2(){
        File file = new File(System.getProperty("user.home") + "/Desktop/내파일.txt");

        if(file.exists()) {
            System.out.println("이미 바탕화면에 존재하는 파일입니다.");
        } else {
            try { //폴더만들기와 다르게 파일 만들기는
                // 문제가 생길 가능성이 높기 때문에 try - catch 나 thorow와 같은
                // 에러 방지 구문을 추가해줘야함
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("파일을 만드는데 문제가 발생했습니다.");
            }
            System.out.println("파일이 성공적으로 생성되었습니다.");
        }
    }
}
