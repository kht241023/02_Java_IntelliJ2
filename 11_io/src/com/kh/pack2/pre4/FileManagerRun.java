package com.kh.pack2.pre4;

import java.util.Scanner;


import java.io.*;
import java.util.Scanner;

public class FileManagerRun {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        String path = System.getProperty("user.home") + "/Desktop";

        while (true) {
            System.out.println("\n메뉴:");
            System.out.println("1. 파일 생성");
            System.out.println("2. 파일 읽기");
            System.out.println("3. 파일 내용 추가");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("생성할 파일 이름을 입력하세요: ");
                    String createFileName = scanner.nextLine();
                    fileManager.createFile(path, createFileName);
                    break;
                case 2:
                    System.out.print("읽을 파일 이름을 입력하세요: ");
                    String readFileName = scanner.nextLine();
                    fileManager.readFile(path, readFileName);
                    break;
                case 3:
                    System.out.print("내용을 추가할 파일 이름을 입력하세요: ");
                    String writeFileName = scanner.nextLine();
                    fileManager.writeToFile(path, writeFileName);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
