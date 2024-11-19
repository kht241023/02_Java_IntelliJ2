package kh.com.ex;

import java.util.Scanner;

public class OperatorEx {

    // OperatorEx 로 만든 기능들 중에서 원하는 기능만 선택해서 실행하는 공간
    public void 삼의배수기능() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int a = sc.nextInt();

        boolean tf = a % 3 == 0;
        System.out.println("삼의 배수인가 : " + tf);
    }

    public void 이의배수기능() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int a = sc.nextInt();

        boolean tf = a % 2 == 0;
        System.out.println("이의 배수인가 : " + tf);
    }
}
