package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {

    /*
    * 메소드명 : method1()
    아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
    종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
    === 메뉴 ===
    1. 입력
    2. 수정
    3. 조회
    4. 삭제
    7. 종료
    메뉴 번호를 입력하세요 : 3
    조회 메뉴입니다.
    * */

    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요.");

        // 메뉴 번호 입력받기
        int choice = sc.nextInt();
        String result;
        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                result = "잘못된 번호";
                break;
        }
        System.out.println(result + " 메뉴입니다.");


    }


    // 키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다.
    // 키보드로 입력받은 정수가 양수이면서 홀수일 때만 홀수입니다. 출력
    public void method2() {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        // 만약에 입력받은 정수가 양수인지 확인

        if (i > 0) {
            if (i % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        } else {
            System.out.println("양수가 아닙니다.");
        }
    }

    /*
    아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
    로그인 성공 시 "로그인 성공"
    아이디가 틀렸을 경우 "아이디가 틀렸습니다."
    비밀번호가 틀렸을 경우 " 비밀번호가 틀렸습니다." 출력
    아이디 : myId
    비밀번호 : myPassword12
    위 아이디 비밀번호를 모두 무사히 입력해야지 로그인 성공

    비밀번호가 틀리면 비밀번호가 틀렸습니다 출력
    아이디가 틀리면 아이디가 틀렸습니다 출력
    * */
    public void method3() {

        // 현재 DB에 저장된 아이디 비밀번호가 없기 때문에
        // 아이디와 비밀번호 선언
        String saveId = "myId";
        String savePw = "myPassword12";


        // 키보드로 입력받는 Scanner 이용하기
        Scanner sc = new Scanner(System.in);
        String inputId = sc.nextLine();
        String inputPw = sc.nextLine();

        //로그인 시 == 사용 (다른 방법을 안다면 == 대신 다른 방법을 사용해도 좋음!)

        if (inputId.equals(saveId) && inputPw.equals(savePw)) {
            System.out.println("아이디와 비밀번호가 모두 일치합니다.");
        }

        if (inputId.equals(saveId)) {
            System.out.println("아이디가 일치합니다.");
        }

        if (inputPw.equals(savePw)) {
            System.out.println("비밀번호가 일치합니다.");
        }

/*

    == 부등호
        if (saveId == inputId && savePw == inputPw) {// 1. 아이디와 비밀번호가 같다면 로그인 성공!
            System.out.println("로그인성공");
        } else if (saveId != inputId) {// 2. 아이디가 틀렸다면 아이디가 틀렸습니다.
            System.out.println("아이디가 틀렸습니다.");
        } else  if (savePw != inputPw) {
            System.out.println("비밀번호가 틀렸습니다."); // 3. 비밀번호가 틀렸다면 비밀번호가 틀렸습니다.
        } else {
            System.out.println("아이디와 비밀번호가 틀렸습니다.");
        }
*/


    }
}














