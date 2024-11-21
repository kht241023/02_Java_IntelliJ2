package com.kh.oop.methodPre;

public class VoidPre {
    // 메서드1: 온도 변화 확인하기
    // +  double fahrenheit = celsius * 1.8 + 32;
    // 출력 :  섭씨 25도는 화씩 77.0도 입니다.
    public void method1(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨 " + celsius + " 도는 화씨 " + fahrenheit + "도 입니다.");

    }

    public void method2(String name) {
        System.out.println("학생 이름 : " + name);
    }
    public void method3(String name, double price) {
        System.out.println("상품명 : " + name + ", 가격 : " + price);
    }

    public  void method4(int hours, int minutes) {
        int totalMinutes = hours * 60 + minutes;
        System.out.println("총 " +totalMinutes+"분입니다.");
    }
    public  void method5(String exercise, int duration) {
        System.out.println("운동: " + exercise + ", 지속 시간: "+duration);
    }

    // %s = String %d = int %.숫자f = 소수점표기 %n newLine 줄바꿈
    public void method6(String accountNumber, double balance) {
        System.out.printf("계좌번호: %s, 잔액: %.2f원%n", accountNumber, balance);
    }

    public void method7(String title, double rating) {
        System.out.printf("영화 제목: %s, 평점: %.1f/10%n",  title, rating);
    }

    public void method8(String name, double topSpeed) {
        System.out.printf("차량명: %s, 최고 속도: %.1fkm/h%n", name, topSpeed);
    }
    public void method9(String recipient, String subject) {
        System.out.printf("수신자: %s, 제목: %s!%n", recipient, subject);

    }
    public void method10(String itemName, int quantity) {
        System.out.printf("상품명: %s, 수량: %d개%n", itemName, quantity);
    }

}
