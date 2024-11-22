package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {



    public static void main(String[] args) {
        PersonPre p = new PersonPre();
        Scanner sc = new Scanner(System.in);
    //스캐너로 사용자의
    // 이름과 나이를 입력받고
        System.out.print("이름을 입력하세요 : ");
        String n = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // nextLine() 로 해준 다음 숫자로 형변환
        System.out.print("나이 : " + age);

        //이름은 빈칸이라면
        // 빈칸은 이름으로 들어갈 수 없습니다.
        // trim() -> 좌우 띄어쓰기와 같은 공백 제거
        // 공백제거한 값의 총 글자길이를 length() 로 길이가 존재하는지 확인
        // trim().length() 대신에 isEmpty() 값이 들어있는지 비어있는지 유무 확인
        if (n.trim().length() == 0) { // 자바스크립트
            System.out.println("빈칸은 이름으로 들어갈 수 없습니다.");
        } else {
            p.setName(n);
        }

        //나이가 0보다 같거나 작다면
        // 나이는 음수일 수 없습니다 로 값 설정 x
        if (age <= 0) {
            System.out.println("나이는 0이나 음수일 수 없습니다.");
        } else {
            p.setAge(age);
        }

    // 이름이 제대로 들어가있고
    // 나이가 제대로 설정이 되어 있다면
    // get으로 이름과 나이 출력하기
        if(p.getName() != null &&p.getAge() > 0) {
            System.out.println("이름 : " + p.getName());
            System.out.println("나이 : " + p.getAge());
        }

    }
}
