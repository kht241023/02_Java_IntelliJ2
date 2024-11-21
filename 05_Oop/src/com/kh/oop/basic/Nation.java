package com.kh.oop.basic;
/*
클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 클(코드)로 작성해둔 문서(설계도)
        == 객체를 정의한 것
* */

// 국민(Nation) 객체를 만들기 위한 클래스
public class Nation {
    // 필드에 변수명을 작성했다해서 무조건 사용이 되는 것은 아님!
    /*필드 = 속성(값)*/
    String name;                        //이름
    int age;                            //나이
    char gender;                        //성별
    // 주민번호 부터 주소까지 사용되지 않았음
    // 자바에서 가비지컬렉션으로 알아서 메모리에서 알아서 정리될 것
    String juminNumber;                 //주민번호
    String tel;                         //전화번호
    String address;                     //주소

    /* 기능 메서드 행동 */
    public void speak(){
        System.out.println("가나다라 한국어 가능합니다.");
    }

    public void 납세의의무(){
        // 만 19세 이상 성인만 세금을 내는 경우
        if(age >= 19) {
            System.out.println(name + "님은 세금 납부 대상자입니다.");
        } else {
            System.out.println(name + " 님은 " + age + " 세 미성년자로 납부 대상자가 아닙니다.");
        }
    }

    // 자기소개 기능
    public void introduce(){
        System.out.println("이름은 " + name + " 이고, " + age + "세 " + gender + "성 입니다.");
    }
}
