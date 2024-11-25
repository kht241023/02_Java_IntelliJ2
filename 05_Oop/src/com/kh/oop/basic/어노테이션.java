package com.kh.oop.basic;

public class 어노테이션 {
    /*
    @ (어노테이션, Annotation = 주석 주석을 다는 행위 설명 부가정보)
    註釋 = 주석
            註 덧붙이다 설명하다 주
            釋 풀다 해석하다 석
    Spring 주로 사용

    자주 사용되는 기본 어노테이션
    @Override
    오버라이딩
        처음에 메서드를 작성한 클래스에서 처음에 만들어진 메서드를
        두번째 이후 다른 클래스가 자식 클래스에 맞게 다시 구현하는 것을 말함

        부모 클래스에서 메서드에 주과된 이름, 매개변수, 리턴타입은 그대로 가짐
        하지만 메서드의 동작은 변경할 수 있음

        예를 들어 toString 메서드가 대표적인 예
        최초로_toString_이만들어진클래스.java
        toString() 메서드 기능을 만들 때
        return 값으로 String으로 묶어서 필드값을 확인하게 만들자!

           toString() 만들어진 기능을 클래스 필드에 맞게 재사용
           toString()과 같은 기능을 사용할 때는
           @Override 를 안붙여도 동작은 하지만
           붙여주는 것이 좋음
    */

    /*
    * getter setter constructor toString 과 같이 자주 사용하는 메서드는
    * lombok이라는 회사 기능을 활용해서 사용가능
    *
    * private String name;
    *
    * @Getter
    *   public String getName(){
    *       return name;
    *   }
    * @Setter
    *   public void setName(name) {
    *       this.name = name;
    *   }
    *
    * constructor(생성자)
    * @NoArgsConstructor = 기본생성자
    *   // Args = 매개변수에 들어갈 값   Arguments(전달인자 값 들)
    *   // 매개변수 = 전달인자값을 넣기위한 변수명
    *   public 클래스명(){
    *
    *   }
    * @AllArgsConstructor = 모든 매개변수값을 저장하는 필수 생성자
    *
    *   public 클래스명(위에 작성한 모든 필드값들의 매개변수명 생성) {
    *   this.필드1 = 매개변수명1;
    *             ...
    *   }
    * */
}
