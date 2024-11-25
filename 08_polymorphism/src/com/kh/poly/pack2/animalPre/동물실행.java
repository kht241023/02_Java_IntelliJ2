package com.kh.poly.pack2.animalPre;

public class 동물실행 {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이",3,"진돗개",2);
        Cat cat = new Cat("나비",2,"흰색",8);

        System.out.println(dog); //.toString()
        System.out.println(cat); //.toString()

    }
}
