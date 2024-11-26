package com.kh.poly.pack3.interfaceEx;

public interface Machine {
    /* public static final */int VOLT = 220;

    // 인터페이스는 추상메서드만 작성이 가능
    public abstract void powerOn();
    /* public abstract */ void powerOff();
}
