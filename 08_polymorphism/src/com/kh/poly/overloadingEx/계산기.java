package com.kh.poly.overloadingEx;

// 메서드(기능)의 이름은 같지만, 매개변수의 개수나 타입이 다를 때 적용
public class 계산기 {

    // 1. 두 숫자를 더함
    public int add(int a, int b) {
        return a + b;
    }

    // 2. 숫자 세개 더함
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. 소수점을 포함해서 더함
    public double add(double a, double b) {
        return a + b;
    }

    // 4. 글자를 이어붙여서 완성하기를 하고자함 더하기
    public String add(String a, String b) {
        return a + b;
    }


}
