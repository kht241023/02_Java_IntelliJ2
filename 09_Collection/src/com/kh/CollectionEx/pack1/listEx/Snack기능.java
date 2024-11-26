package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {

    //과자 추가하기
    public void addSnack(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과자명을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("과자 가격을 입력하세요 : ");
        int price = sc.nextInt();

        System.out.print("과자 재고수량을 입력하세요 : ");
        int quantity = sc.nextInt();

        sc.nextLine();
        sc.close(); //스캐너 종료

        //과자정보를 저장하는 저장클래스 소환
        Snack snack1 = new Snack(name, price, quantity); //Scanner로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack2 = new Snack("오맛나과자", 5000, 3); //Scanner로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack3 = new Snack("양파맛나과자", 8000, 5); //Scanner로 입력받은 과자명, 가격, 수량이 들어감

        // 과자 정보를 목록으로 저장하는 배열리스트 소환
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(snack1); //과자목록들에 새로 입력받은 과자 한 개에대한 정보를 저장
        snacks.add(snack2); //과자목록들에 새로 입력받은 과자 한 개에대한 정보를 저장
        snacks.add(snack3); //과자목록들에 새로 입력받은 과자 한 개에대한 정보를 저장
        //System.out.println(snacks.toString());

        System.out.println(" ***** 과자 목록 리스트 출력 ***** ");
        for (int i = 0; i < snacks.size(); i++) { // index = length() - 1     index = size -1
            snacks.get(i);
            System.out.println(snacks.get(i));
        }




        /*
        준비물 : size()  length 대신에 size()를 이용해서 몇개 들어있는지 확인
        모두 출력이아니라 모두 출력을 하되, 한 줄씩 출력이 되길 원함
        향상된 for문을 이용해서 모두 출력 for문을 이용해서 출력
        0. 번 오리지널맛나과자 가격 수량
        1. 번 오맛나과자       가격 수량
        2. 번 양파맛나과자     가격 수량

        [  snackName='오리지널 맛나과자', snackPrice=10000, snackQuantity=10,
            snackName='오맛나과자', snackPrice=5000, snackQuantity=3,
            snackName='양파맛나과자', snackPrice=8000, snackQuantity=5
          ]
         */
    }

}
