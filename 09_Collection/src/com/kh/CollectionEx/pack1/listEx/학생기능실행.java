package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class 학생기능실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학년을 입력하세요 : ");
        int grade = sc.nextInt();
        sc.nextLine();
        
        System.out.print("취미를 입력하세요 : ");
        String hobby = sc.nextLine();
        
        학생 s1 = new 학생(name,grade,hobby);
        //학생 s1 = new 학생("홍길동",3,"독서");
        System.out.println(s1.toString());
    }
}
