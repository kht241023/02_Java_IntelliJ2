package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능실행 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학년을 입력하세요 : ");
        int grade = sc.nextInt();
        sc.nextLine();
        
        System.out.print("취미를 입력하세요 : ");
        String hobby = sc.nextLine();
        
        학생 s1 = new 학생(name, grade, hobby);
        //학생 s1 = new 학생("홍길동",3,"독서");
        // 배열 형태로 이름부터 취미까지 한 번에 넣길 원함
        ArrayList<학생> studentList = new ArrayList<학생>();
        studentList.add(s1); //이름 학년 취미가 한 번에 저장
        System.out.println(s1.toString());

         */
        학생기능 h = new 학생기능();
        h.addStudent();
    }
}
