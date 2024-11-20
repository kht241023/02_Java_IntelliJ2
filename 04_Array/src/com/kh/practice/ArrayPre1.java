package com.kh.practice;

import java.util.Scanner;

// ArrayPreRun
// ArrayPre1
public class ArrayPre1 {
    Scanner sc = new Scanner(System.in);

    /*
     사용자에게 입력 받은 양의 정수만큼 배열크기 할당
     1부터 입력받은 값까지 배열에 초기화한 후 출력
     배열 크기 입력 : 사용자가 숫자로 입력
     만약에 5를 입력했다면 양의정수로 1~5까지 출력
     */
    public void practice3() {
        System.out.print("배열 크기 입력 : ");
        int size = sc.nextInt(); //배열 크기 설정

        // 만약에 입력한 값이 양의 정수가 아니면 리턴시켜서 메서드 종료
        if (size <= 0) {
            System.out.println("양의 정수를 입력하세요.");
            return; //프로그램 종료
        }

        // 배열 생성 및 초기화
        int[] arr = new int[size];

        //사용자가 size 변수명에 5를 입력했다면 -> int[] arr = new int[5];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; //1부터 size까지 호출
        }

        // 배열 출력 (일반 for문 사용)
        for (int i = 0; i < arr.length; i++) { //size = arr.length는 같음
            System.out.print(arr[i] + " ");
        }
    }

    /*
    길이가 5인 String 배열을 선언하고
    "사과", "귤", "포도", "복숭아", "참외"로 초기화 한 후
    배열 인덱스를 활용해서 귤 출력하기
    */
    public void practice4() {
        String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};

        System.out.println("배열 0에서 출력한 값 : " + fruit[0]);
        System.out.println("배열 1에서 출력한 값 : " + fruit[1]);
        System.out.println("배열 2에서 출력한 값 : " + fruit[2]);
        System.out.println("배열 3에서 출력한 값 : " + fruit[3]);
        System.out.println("배열 4에서 출력한 값 : " + fruit[4]);


    }

    /*
     * 주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
     * 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
     * */
    public void practice6() {
        // 주민등록 번호를 저장할 char 배열 생성
        char[] arr = new char[14]; // 123456-1234567

        System.out.print("주민등록번호(-포함):");
        String input = sc.nextLine();

        // 문자열.length() : 문자열의 길이를 반환하는 메서드
        // 배열.length() : 배열 길이를 반환하는 필드
        int len = input.length();
        for (int i = 0; i < len; i++) {
            // 성별 부분 전 까지는 그대로 배열에 저장
            // index = 7까지는 그대로 넣어주기
            if (i <= 7) {
                //charAt = 문자열에서 특정 위치를 반환
                arr[i] = input.charAt(i); // 0~ 7까지 배열에 저장
            } else { //8번부터는 모두 *로 저장
                arr[i] = '*';

            }

        }

        //반드시 결과는 for문이 종료된 } 밑에 작성
        // 배열에 담긴 내용 모두 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * 실습문제 6-1
     * practice6A()
     * 전화번호를 입력 받아 char 배열에 저장한 후 출력
     * 단, 전화번호의 앞 3자리(국가 코드 포함)는 그대로 출력하고,
     * 나머지 뒷자리 숫자는 '*' 로 출력
     * 입력 예시 : +82-010-1234-5678 //index로 7까지만 표기
     * 출력 예시 : +82-010-*********
     * */

    public void practice6A() {
        //전화번호를 저장할 char 배열 생성
        char[] arr = new char[17];
        System.out.print("전화번호(-포함):");
        String input = sc.nextLine();
        int len = input.length();

        //문자열 길이와 char 배열 길이 활용
        for (int i = 0; i < len; i++) {
            // 앞 숫자들은 그대로 배열에 대입
            // 뒷자리는 *로 대입

            if (i <= 7) {
                arr[i] = input.charAt(i);
            } else {
                arr[i] = '*';
            }
        }

        // 배열에 담긴 내용 모두 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* 국가번호
    * +82- 고정
    * 사람들이 작성한 핸드폰 번호만 이어서 출력
    *
    * */
    public void practice6B() {

        // +82- 고정, 나머지 번호를 입력받아 이어 작성
        String countryCode = "+82-";

        System.out.print("전화번호(-포함):");
        String input = sc.nextLine();

        // 전화번호 전체 길이를 계산하기 위해 국가번호 + 핸드폰번호 합치기
        String fullNumber = countryCode + input; //+82-포함한 전체번호

        // 전화번호를 저장할 char 배열 생성
        char[] arr = new char[fullNumber.length()]; // 전화번호 전체길이크기가 반영된 배열 생성


        //문자열 길이와 char 배열 길이 활용
        for (int i = 0; i < fullNumber.length(); i++) {
            // 앞 숫자들은 그대로 배열에 대입
            // 뒷자리는 *로 대입

            if (i <= 7) {
                arr[i] = fullNumber.charAt(i);
            } else {
                arr[i] = '*';
            }
        }

        // 배열에 담긴 내용 모두 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}















