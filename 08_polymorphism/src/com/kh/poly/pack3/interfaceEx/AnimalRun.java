package com.kh.poly.pack3.interfaceEx;

public class AnimalRun {
    public static void main(String[] args) {
        // 추상 클래스는 미완성된 클래스이기 때문에 객체 생성 불가

        Snake snake = new Snake();
        snake.eat();
        snake.sleep();
    }
}
