package kh.com.ex;

import java.util.Scanner;

// 파일명 맨 앞글자가 숫자만 아니면 됨
public class 계산기 {
    public void 더하기기능(){

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번 째 숫자를 입력하세요  : ");
        int n1 = sc.nextInt();

        System.out.print("두번 째 숫자를 입력하세요 : ");
        int n2 = sc.nextInt();

        System.out.println("n1 + n2 = " + (n1 + n2));
    }

    public void 더하기빼기기능(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번 째 숫자를 입력하세요 : ");
        int n1 = sc.nextInt();

        System.out.print("두번 째 숫자르 입력하세요.");
        int n2 = sc.nextInt();

        System.out.println("n1  + n2 = " + (n1 + n2));
        System.out.println("n1  - n2 = " + (n1 - n2));
    }

    public void 더하기빼기곱하기기능(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번 째 숫자를 입력하세요 : ");
        int n1 = sc.nextInt();

        System.out.print("두번 째 숫자를 입력하세요.");
        int n2 = sc.nextInt();

        System.out.println("n1  + n2 = " + (n1 + n2));
        System.out.println("n1  - n2 = " + (n1 - n2));
        System.out.println("n1  * n2 = " + (n1 * n2));
    }
    public void 더하기빼기곱하기나누기기능(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번 째 숫자를 입력하세요 : ");
        int n1 = sc.nextInt();

        System.out.print("두번 째 숫자를 입력하세요.");
        int n2 = sc.nextInt();

        System.out.println("n1  + n2 = " + (n1 + n2));
        System.out.println("n1  - n2 = " + (n1 - n2));
        System.out.println("n1  * n2 = " + (n1 * n2));
        System.out.println("n1  / n2 = " + (n1 / n2));
    }
}
