package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {


    // method1 : 바탕화면에 profileImg 라는 폴더가 존재하는지 확인하고
    //          존재하지 않으면 폴더 생성 존재하면 이미 존재하는 폴더 입니다. 출력
    public void method1(){
        File dir = new File(System.getProperty("user.home") + "/Desktop/profileImg");

        if(dir.exists()){
            System.out.println("이미 존재하는 폴더입니다.");
        } else {
            dir.mkdir();
            System.out.println("폴더를 생성했습니다.");
        }
    }

    // method2 :바탕화면에 newFile.txt 생성
    public void method2(){
        File txtFile = new File(System.getProperty("user.home") + "/Desktop/newFile.txt");
        if(txtFile.exists()) {
            System.out.println("파일이 존재합니다.");
        } else {
            try {
                txtFile.createNewFile();
                System.out.println("파일을 성공적으로 생성했습니다. " + txtFile);
            } catch (IOException e) {
                System.out.println("파일 생성 중 예기치 못한 문제가 발생했습니다.");
            }
        }
    }
}
