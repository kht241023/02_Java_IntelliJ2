package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;
import java.util.Scanner;

public class SubwayService {
    // method1 기본으로 put에 직접적으로 작성하고 작성된 내용 출력
    public void method1(){
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("이탈리안 비엠티", 6200);
        menu.put("치킨 데리야끼", 6300);

        // 메뉴 출력 함수 호출
        System.out.println("서브웨이 메뉴에 따른 가격 목록 : " + menu);
    }
    
    // method2 스캐너로 입력받고 입력받은 내용 출력
    public void method2(){
        // 1. HashMap 생성 (샌드위치 이름과 가격 저장하는 목록인 menu 변수명을 생성)
        HashMap<String, Integer> menu = new HashMap<>(); //저장된 메뉴이름 가격 목록 저장하는 공간
        
        // 2. Scanner로 입력받기 위해 입력 하는 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("추가하고자 하는 샌드위 이름 : ");
        String menuName = scanner.nextLine();
        System.out.print("샌드위치 이름에 대한 가격 : ");
        int menuPrice = scanner.nextInt();
        scanner.nextLine();

        menu.put(menuName, menuPrice);

        // 메뉴 출력 함수 호출
        System.out.println("추가한 메뉴 이름과 가격 : " + menu);
    }
}
