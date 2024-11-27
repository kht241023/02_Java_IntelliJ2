package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class BookServiceRun {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        //bookService.method1();
        //bookService.method2();

        Scanner scanner = new Scanner(System.in);//html연결 사용 X
        while (true) {
            System.out.println("\n === 책 매니저 === ");
            System.out.println("1. 책 추가하기");
            System.out.println("2. 책 제거하기");
            System.out.println("3. 모든 책 리스트 확인하기");
            System.out.println("4. 종료");
            System.out.print("번호만 입력하세요 : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //남아있는 잔여 값들 혹시모르니 처리하기

            switch (choice) {
                case 1:
                    System.out.print("책제목을 입력하세요 : ");
                    String title = scanner.nextLine();
                    System.out.print("저자를 입력하세요 : ");
                    String author = scanner.nextLine();
                    System.out.print("팔고자하는 가격을 입력하세요 : ");
                    int price = scanner.nextInt();
                    scanner.nextLine();

                    // 책 저장하기 기능 Bookservice에서 설정
                    bookService.addBook(title, author, price);

                    break;
                case 2:
                    System.out.print("지우고자 하는 책의 제목을 입력하세요 : ");
                    String removeTitle = scanner.nextLine();
                    // 책기능.원하는책을지우기(어떤책제목을 조회해서 지우고자 하는가);
                    bookService.removeBook(removeTitle);
                    break;
                case 3:
                    //책 리스트를 모두 보는 곳
                    bookService.getBookList();
                    System.out.println( bookService.getBookList());
                    //만약에 책이 하나도 없다면
                    //판매할 수 있는 책 리스트가 없습니다.

                    //책이 존재한다면 모든 책 리스트 보여주기
                    break;

                case 4:
                    System.out.println("책 매니저를 종료합니다. 안녕 ~ ");
                    return;// 모두 종료시키도록 되돌아가는 리턴
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
