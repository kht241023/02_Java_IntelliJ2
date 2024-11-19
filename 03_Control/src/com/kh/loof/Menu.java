package com.kh.loof;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void order() {
        boolean is = true; //주문을 계속 할지 여부를 나타내는 변수
        int price = 0; //총 주문 금액
        System.out.println("=== 메뉴판 ===");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 라떼 - 4000원");
        System.out.println("3. 카푸치노 - 4500원");
        System.out.println("4. 주문 종료");
        while (is) {
            // true일 때 계속 실행 true ->false 가 될 경우 종료
            System.out.print("메뉴를 선택하세요 (1~4):");
            int choice = sc.nextInt(); //메뉴 선택
            switch (choice) {

                case 1:
                    System.out.println("아메리카노를 선택하셨습니다.");
                    price += 3000; // 총 금액 price = price + 3000;
                    break;
                case 2:
                    System.out.println("카페라떼를 선택하셨습니다.");
                    price += 4000;
                    break;
                case 3:
                    System.out.println("카푸치노를 선택하셨습니다.");
                    price += 4500;
                    break;
                case 4:
                    System.out.println("주문을 종료합니다.");
                    is = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    break;
            }
            System.out.println("총 주문금액" + price + "원");
        }

    }
}
