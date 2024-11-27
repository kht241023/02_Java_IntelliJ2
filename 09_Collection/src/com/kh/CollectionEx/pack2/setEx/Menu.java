package com.kh.CollectionEx.pack2.setEx;

import java.util.Objects;

public class Menu {
    private int id;         // 메뉴 순서
    private String name;    // 메뉴 이름
    private double price;   // 메뉴 가격


    //메서드 기본 필수 Setter Getter toString

    public Menu() {
    }

    public Menu(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 객체가 같다(동일, 동등)를 어떻게 비교할것인가?
    //  - 동일 : 가르키고 있는 것이 같음  Object.hashCode()
    //  - 동등 : 값이 같음                Object.equals()

    // 동등 비교 : Object.equals() 메서드 재정의(오버라이딩)
    // 현재 객체 필드와 전달받은 객체의 필드가 모두 같을 경우 true, 아니면 false를 보여줌
    @Override
    public boolean equals(Object o) {
        //들어온 값이 Menu 타입인지 확인 메뉴 타입이 아니라면 같은 것인지 확인하고 비교할 이유가 없기 때문에 돌려보내기
        if (!(o instanceof Menu menu)) return false;
        // 만약에 메뉴에 들어올 값이 맞음
        // id값이 같은지 확인              가격이 같은지 확인                          메뉴이름이 같은지 확인
        return id == menu.id && Double.compare(price, menu.price) == 0 && Objects.equals(name, menu.name);
        //  Double.compare(price, menu.price) == 0 주로 정수나 실수 비교할 때 사용
        //  두 값이 같으면 0     첫 번째 값이 더 작으면 음수       첫 번째 값이 더 크면 양수
        //   2  =  2    == 0              2 = 4  == -2                   2  =  1   ==  1

    }


    // 동일 비교 : Object.hashCode() 메서드 재정의(오버라이딩)
    // hash 함수 : 값을 넣으면 같은 길이의 문자열이 반환되는 함수

    // hashCode() : 객체별 식별 코드(객체를 구분하는 정수 값) 반환
    //  주민등록번호, 학번, 은행 번호표와 같이 암호화 처리를 진행해야할 때 사용
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    // equals
    //   두 값이 논리적으로 같은지 비교 = 동일한 주소를 갖고 있는지 확인
    // 재정의 해서 사용할 경우 객체 안에서 특정 필드 값이 같을 때 논리적으로 같다고 정의하고 비교 내용을 구현
    // equals에서 세부적으로 같은지를 확인



    // hashCode
    //   두 값이 논리적으로 같은지 비교
    //  주소를 기반으로 해시 값을 계산해서 계산 결과가 같은지 확인하고 같다면 같은 해시 코드를 반환


    // hash : 컴퓨터 과학 주로 조각내다,잘게 자르다 의미에서 사용
    //          요리에서는 고기를 잘게 썰어 섞는 행위 나타낸다면
    //          프로그래밍에서는 데이터를 특정 규칙에 따라 조작하거나 변환하는 것을 나타냄
    //              데이터를 조작하고 변환한 결과가 같은지 확인
}
