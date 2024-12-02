package com.kh.pack2.pre4;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWriteTrue {
 public void writeTxt() {
     String path = System.getProperty("user.home") + "/Desktop/";
     Scanner scanner = new Scanner(System.in);
     System.out.print("내용일 이어서 작성할 파일명을 입력하세요 : ");
     String fileName = scanner.nextLine();
     // 만약에 파일이 존재하지 않는다면 파일이 존재하지 않습니다.
     // 파일을 생성하려면 Yes를 입력하고
     // 생성하기를 원치 않는다면 No 또는 아무 글자나 입력하세요.

     File file = new File(path + fileName + ".txt"); //fileName 뒤에 확장자 표기를 붙여주기
     if (!file.exists()) {
         System.out.println("파일이 존재하지 않습니다.");
         System.out.print(fileName + " 파일을 생성하시겠습니까? \n Yes = 생성 , No = 생성 안함 : ");
            String answer = scanner.nextLine(); // 사용자가 Yes를 입력할 것인지 No를 입력할 것인지 받아오기
         // 만약에 equalsIgnoreCase 이용해서 Yes를 입력하면 파일 생성하기 기능 실행 createNewFile();
            if(answer.equalsIgnoreCase("yes")) {
                try {
                    file.createNewFile();
                    System.out.println("파일 생성을 완료했습니다." + file.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println("파일 생성에 문제가 발생했습니다. : " + e.getMessage());
                }
            } else {
                System.out.println("파일 생성하기를 종료합니다. " +
                        "\n 파일이 없으므로 작성할 내용 또한 없기 때문에 프로그램을 종료합니다.");
                return;
            }


         // 파일 생성까지 됐다면 파일 안에 글을 작성하기
         /* try() 안에 1가지 코드만 작성할 경우 뒤에 ; 생략가능
         *  두가지 이상 작성할 경우 ; 기능이나 명칭 구분짓기 해주어야함
         * */
         //   file =       C:/Users/user1/Desktop/떡볶이가게.txt
         //   fileName = 떡볶이가게
         try ( FileWriter fw = new FileWriter(file, true)){
            // exit를 입력하면 종료 설정
             // while문 이용해서 exit를 입력하기 전까지 글 내용 작성할수 있게 하고
             // 한줄 작성될 때마다 System.out.println 이용해서
             // 내용이 추가되었습니다! 를 반복해서 보여주기
             String line;
             System.out.println("종료를 원할경우 exit를 작성하여 작성 종료하기");
             System.out.println("[ "+file + " ]안에 들어갈 내용 작성 ===");
             while(true) {
                 System.out.print("작성할 내용(exit=종료) : ");
                 line = scanner.nextLine();
                 if("exit".equalsIgnoreCase(line)) {
                     System.out.println("내용 작성을 종료합니다.");
                     return; //break;는 while이나 for문 안에서만 작성 가능
                 }
                 fw.write(line + "\r\n");
                 /*
                 * \r 키보드 커서를 현재 줄의 맨 앞으로 이동시키는 역할
                 * 예를 들어 \naver 와 같은 상황이 발생할 경우를 방지하기 위해 커서를 기본적으로 맨 앞으로 보내서
                 * \n을 활용하여 줄바꿈 처리를 할 수 있도록 설정
                 * window 컴퓨터에서는 사용자들이 글을 작성하며 줄바꿈을 할 때마다 \r\n 함께 이용
                 */
                 System.out.println("내용이 추가되었습니다.");
             }
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }
 }
}
