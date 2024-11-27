package com.kh.CollectionEx.pack2.setEx;

import java.util.Scanner;

public class MenuServiceRun {
    public static void main(String[] args) {
        // 1. 메뉴 서비스 기능들 가져와서 상황에 맞게 실행할 수 있도록 설정
        MenuService menuService = new MenuService();

        // 2. 스캐너를 이용해서 키보드로 입력받고 입력결과 추가 삭제 검색
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n === 메뉴 관리 시스템 === ");
            System.out.println("1. 메뉴추가");
            System.out.println("2. 메뉴삭제");
            System.out.println("3. 메뉴검색");
            System.out.println("4. 모든 메뉴 조회");
            System.out.println("5. 종료");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //줄바꿈 문자 처리
            switch (choice) {
                case 1:
                    System.out.print("메뉴 ID 입력 : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("메뉴 이름 입력 : ");
                    String name = scanner.nextLine();
                    System.out.print("메뉴 가격 입력 : ");
                    double price = scanner.nextDouble();

                    Menu menu = new Menu(id, name, price);
                    menuService.addMenu(menu);
                    break;

                case 2:
                    System.out.println("--- 메뉴를 삭제하는 공간입니다. ---");
                    System.out.print("삭제할 메뉴 id를 입력하세요 : ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    menuService.removeMenu(deleteId); //사용자가 입력한 아이디를 넣어서 삭제 진행
                    break;
                case 3:
                    System.out.println("--- 메뉴를 검색하는 공간입니다. ---");
                    System.out.print("검색할 메뉴를 입력하세요.");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();


                    Menu m = menuService.searchMenu(searchId);
                    System.out.println(m); //사용자가 입력한 아이디를 넣어서 검색 진행

                    break;
                case 4:
                    System.out.println("--- 메뉴를 모두 조회하는 공간입니다. ---");
                    menuService.printAllMenu();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    break;

            }
        }
/*
        // 메뉴 추가
        Menu menu1 = new Menu(1,"아메리카노", 2000);
        Menu menu2 = new Menu(2,"카페라떼", 5000);
        Menu menu3 = new Menu(3,"바닐라라떼", 5500);
        Menu menu4 = new Menu(1,"아메리카노", 2000);

        // 메뉴를 추가하고
        menuService.addMenu(menu1);
        menuService.addMenu(menu2);
        menuService.addMenu(menu3);
        menuService.addMenu(menu4);

        // 추가된 메뉴 출력하기
        menuService.printAllMenu();

        // 메뉴 삭제
        menuService.removeMenu(2);
        // 삭제 확인 출력
        menuService.printAllMenu();

        // 메뉴 검색
        menuService.searchMenu(1);
        System.out.println(menuService.searchMenu(1));


*/


    }
}
