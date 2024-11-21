package com.kh.oop.methodPre;

public class ReturnRun1 {

    public static void main(String[] args) {
        ReturnPre1 r1 = new ReturnPre1();
        //System.out.println(r1.findId("감길식",5678));
        //System.out.println(r1.findId("홍길동",1234));

        int x = 3;
        int y = 5;

        r1.add(x,y);//더하기 결과값을 가지고만 있는 상태
        r1.sub(x,y);//  빼기 결과값을 가지고만 있는 상태
        r1.mul(x,y);//곱하기 결과값을 가지고만 있는 상태
        r1.div(y,x);//나누기 결과값을 가지고만 있는 상태

        System.out.println(r1.add(x,y));
        System.out.println(r1.sub(x,y));
        System.out.println(r1.mul(x,y));
        System.out.println(r1.div(y,x));
    }
}
