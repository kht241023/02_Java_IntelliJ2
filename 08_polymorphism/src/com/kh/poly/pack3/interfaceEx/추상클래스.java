package com.kh.poly.pack3.interfaceEx;
//  abstract class ( 추상 클래스)
// - 추상 메서드를 포함하고 있는 클래스
// - 미완성인 부분을 포함하고 있기 때문에 객체로 생성하는 것이 불가능!
public abstract class 추상클래스 {
    /*

    공통된 특징만 가지고 있는 클래스
    세부적인 기능은 개개인의 클래스가 각자 작성할 것!


    抽象(=추상, abstract)
    抽 = 뽑아내다 선택하다
    象 = 모양, 현상, 모습
    본질적이고 공통된 특성을 뽑아내는 과정
    구체적인 사물이나 현상에서 개별적인 특징은 제거하고, 핵심적인 본질만 남겨
    일반화하는 것을 의미

    ab- : 떨어져, 분리되어
    stract : 끌다, 끌어내다
    구체적인 것에서 본질만 끌어내는 것
    */
    public abstract void 먹는기능();

    // abstract 메서드를 정상적으로 작성했는데 오류가 발생하는 이유
    // -> 현재 클래스가 추상클래스가 아니라서 오류 발생
    // class 선언부에 abstract 추가!

    //추상 메서드 뒤에 중괄호{} 붙이지 않음!
}
