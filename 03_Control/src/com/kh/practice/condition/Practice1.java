package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    Scanner sc = new Scanner(System.in);
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
    public void method10() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("*** 실행할 기능을 선택하세요.*** ");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt(); //사용자가 번호를 선택하도록 입력하는 공간 작성
            sc.nextLine();// 한 줄 공백이 있을 경우 날림처리
            //선택한 번호에 따른 기능 실행
            switch (choice) {
                case 1:
                    method1(); // public void method1()  작성된 코드 호출
                    //외부에서 기능을 특정적으로 실행하지 않을 때는
                    //내부에서 만 기능 불러오기를 진행할 때 기능명칭() 만 작성해주면 됨
                    //단 main() 예외적으로 클래스파일명 변수명 = new 클래스파일명();
                    //작성 후 기능 불러오기 가능
                    break;
                case 2:
                    method2();
                    break;
                case 4:
                    method4();
                    break;
                case 5:
                    method5();
                    break;
                case 6:
                    method6();
                    break;
                case 3:
                case 7:
                case 8:
                case 9:
                    System.out.println("기능 준비중입니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    isTrue = false;
                    // while 옆에 true로 적힌 부분을 변수 isTrue에 담아서
                    // 추후에 isTrue = false 로 표현해서 종료하게 만들기
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }

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
        System.out.print("홀/짝 맞추기 정수를 입력하세요: ");
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
    public void method5() {

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

    /*
     * if문으로 되어있는 봄, 여름, 가을, 겨울을 switch문으로 바꿔서 출력해라
     *
     * */
    public void method4() {
        //1 ~ 12 사이의 정수 입력받기
        System.out.print("1 ~ 12 사이의 정수 입력 : ");
        int month = sc.nextInt(); //사용자가 입력한 월 가져오기

        // switch 문을 이용해서 계절 출력
        switch (month) {
            // 겨울
            case 1:
            case 2:
            case 12:
                System.out.println(month + "월은 겨울입니다.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(month + "월은 봄입니다.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(month + "월은 여름입니다.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(month + "월은 가을입니다.");
                break;
            default:
                System.out.println(month + "월은 잘못 입력된 달입니다.");
        }
    }

    /*
    메서드 명 : public void practice6(){}
    사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
    단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
    회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
    비회원은 게시글 조회만 가능합니다.
    */
    public void method6() {
        System.out.print("사용자 권한을 입력하세요.(관리자, 회원, 비회원) : ");
        String role = sc.next();
        if ("관리자".equals(role)) {
            System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
        } else if ("회원".equals(role)) {
            System.out.println("게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
        } else if ("비회원".equals(role)) {
            System.out.println("게시글 조회만 가능합니다.");

        } else {
            System.out.println("잘못된 권한입니다.");
        }


    }


}














