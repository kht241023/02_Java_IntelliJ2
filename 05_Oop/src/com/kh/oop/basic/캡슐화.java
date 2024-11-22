package com.kh.oop.basic;

public class 캡슐화 {
    /*
     * [캡슐화]
     * - 객체의 속성(필드) 직접 접근하는 것을 제한하는 것이 원칙
     *    데이터 훼손 우려
     *
     * - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드를 작성
     *   (private : 현재 객체만 접근 가능한, 사적인, 개인적인)
     *
     * - 속성에 직접 접근을 할 수 없으므로
     *   대신 간접 접근을 할 수 있는 기능을 작성해야 함
     *   간접 접근은 set get을 이용해서 저장하고 저장된 값을 불러오는 것
     *
     * */

    // 속성(값) 필드(field) 멤버변수 전역변수
    private String name;
    private int age;

    // 매개변수 : 전달 받아온 값을 저장하는 변수

    // 속성에 간접 접근을 도와주는 setter와 getter 설정
    //setter public void set속성변수명(매개변수명=파라미터) {
            //this.name = 매개변수명;
    // }
    public void setName(String name) {
        this.name = name; // this. 현재 작성하는 파일 필드에 작성된 속성변수명을 바라봄
    }
    public void setAge(int age) {
        this.age = age;
    }

    //getter public 리턴할자료형 get속성변수명(){
        // return 속성변수명;
    //}
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


}
