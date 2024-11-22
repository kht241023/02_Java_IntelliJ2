package com.kh.oop.methodPre;

public class ReturnPre2 {

    // 1. 이름과 나이르 입력 받아 소개 메세지 반환
    // 안녕하세요! 제 이름은 홍길동이고, 나이는 40세 입니다.
    public String method1(String name, int age) {
        return "안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.";
    }

    // 2. 두 숫자를 입력받아 가장 큰 숫자 반환  Scanner X
    //   num1 과 num2 비교해서 큰 값의 숫자를 출력
    // 000 보다 0000이 큰 숫자입니다.
    public String method2(int num1, int num2) {
        if (num1 > num2) {
            return num2 + " 보다 " + num1 + " 이 큰 숫자입니다.";
        } else {
            return num1 + "보다" + num2 + "이 큰 숫자입니다.";
        }
    }

    // 3. 입력된 정수에 따라 등급 반환
    // 90 A  80 B 70 C 60 D 나머지 F char 이용
    public char method3(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    // 4. 상품 가격과 할인율을 입력받아 최종 금액 반환
    public String method4(double price, double discountRate) {
        double totalPrice = price - (price * discountRate / 100);
        return "원래가격 : " + price + " 원 할인율 : " + discountRate + "% 최종금액 : " + totalPrice + " 원";
    }

    // 6. 주어진 나이가 성인인지 확인하고 메세지 반환
    // 삼항연산자
    public String method6(int age) {
        //   (       조건식       )  ?   true     :    false;
        //return    (age >= 19) ? "성인입니다." : "미성년자입니다.";
        String result = (age >= 19) ? "성인입니다." : "미성년자입니다.";
        return "나이 : " + age + " 결과 : " + result;
    }

    // 7. 두 문자열을 연결한 뒤 연결한 값을 반환
    public String method7(String str1, String str2) {

      // return str1 + str2;
      // return "첫 번째로 입력된 문자열 : " + str1  +"\n 두 번째로 입력된 문자열 : " + str2 + "\n 위 두문자열을 이어붙인 결과 : " + str1 + str2;
        String result = str1 + str2;
        return "첫 번째로 입력된 문자열 : " + str1  +"\n 두 번째로 입력된 문자열 : " + str2 + "\n 위 두문자열을 이어붙인 결과 : " + result;
    }

    // 8. 특정 문자열이 배열에 존재하는지 확인후 결과 반환
    public String method8(String[] arr, String target) {
        // 값이 존재하는지 확인하는 boolean 자료형 변수명을 생성
        boolean found = false; // 값이 존재하는지 확신할 수 없기 때문에 false로 설정

        // 존재하는지 확인하기 위한 여정
        for(String str : arr) {
            if(str.equals(target)) {
                found = true;
                break;
            }
        }
        // 존재유무를 모두 확인
        if (found) { //만약에 존재한다면
            return "배열에 " + target + "이(가) 존재합니다.";
        } else {
            return "배열에 " + target + "이(가) 존재하지 않습니다.";
        }
    }


    // 9. 반지름을 입력받아 원의 넓이 반환
    public String method9(double radius) {
        double area = Math.PI * radius * radius;
        return "반지름 : " + radius + " 원의 넓이 : " + area;
    }
}












