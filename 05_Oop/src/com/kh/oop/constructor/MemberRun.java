package com.kh.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {
        // 멤버 1번은 하나씩 하나씩 이름 나이 성별 을 넣어줄 것
        // 1과 같은 방법은 이름이나 성별이나 나이에 특정 조건이나 암호화설정과 같은
        // 특수기능을 하나씩 작성해준 후 넣어줄 때 사용
        Member m1 = new Member();
        m1.setName("홍길동");
        m1.setAge(40);
        m1.setGender("여성");

        // 멤버 2번은 한 번에 이름 나이 성별 넣어줄 것
        // 필수생성자 파라미터생성자 매개변수생성자를 호출해서 감길자 50 남성 한 번에 넣어줄 것
        // 모든 변수명에 특정한 기능을 설정하지 않고 모두 한 번에 값을 저장할 때 사용
        Member m2 = new Member("감길자",50,"남성");

        // m1과 m2에 작성한 값들이 저장되어있는지 확인

        // Getter 로 값을 가져오기
        System.out.println("***** m1 의 정보 *****");
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getGender());

        System.out.println("***** m2 의 정보 *****");
        System.out.println(m2.getName());
        System.out.println(m2.getAge());
        System.out.println(m2.getGender());


        // toString 메서드를 사용해서 한번에 모든값 출력하기
        System.out.println("toString() 메서드 기능 재사용 결과");
        // toString 도 마찬가지로 return해서 값을 가지고 있을 뿐이지
        // 출력하라라는 기능은 들어있지 않기 때문에
        // System.out.print 라는 출력문을 통해 값을 확인할 수 있는 것!
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
