package com.kh.oop.bank;

public class AccountRun {

    // 실행하는 main 기능
    public static void main(String[] args) {
        Account acc = new Account();

        // set을 이용해서 간접 접근하기
        acc.setName("동그라미"); //예금주 설정
        acc.setAccountNumber("1234-56-789"); //계좌번호 설정
        acc.setBalance(100); //잔액 설정
        acc.setPassword("1234"); // 비밀번호 설정
        // 이름이랑 계좌번호가 무사히 들어갔는지 확인하기
        // 확인하기 위해서 1. getName() , getAccountNumber()
        // 호출해서 저장된 값들 확인 = System 출력문을 통해서
        System.out.println(acc.getName());
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());
        System.out.println(acc.getPassword());

        // balace 실수자료형에는 정수형이 들어갈 수 있음
        // 왜냐하면 정수형에는 기본적으로 뒤에 .0 존재하기 때문
        // 정수이기 때문에 실수형으로 변환하거나 넣어줄 때만 보임

        System.out.println("=== 계좌에 입금을 시작합니다. ===");
        //계좌에 입금하기
        acc.deposit(1234);
        acc.deposit(100000);

        System.out.println("=== 계좌에 출금을 시작합니다. ===");
        //계좌에 출금하기
        acc.withdraw(1234);
        acc.withdraw(10000000);
        acc.withdraw(50000);
    }
}
