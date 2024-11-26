package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
    // 메서드 1 새우깡 맛동산 포카칩 고구마칩 고래밥
    // 추가하고 출력하기
    // 총 몇개인지 확인
    // add   size() String 만 넣을 수 있게 자료형 제한
    public void method1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("새우깡");
        list.add("맛동산");
        list.add("포카칩");
        list.add("고구마칩");
        list.add("고래밥");
        
        System.out.println("list에 들어있는 값 : " + list);
        System.out.println("list에 들어있는 값의 총 개수 : " + list.size());

        // 만약에 index 1자리에 허니버터칩을 넣고 싶다면 -> add(index자리넘버, 넣고자하는값)
        list.add(1, "허니버터칩");
        System.out.println("list에서 허니버터칩 추가 확인 : " + list);

        // 3. 특정 위치의 값 가져오기 get(int index자리넘버)
        // 3번째 작성된 값이 무엇인지 가져올 예정
        System.out.println("3번째 인덱스에 저장된 값 : " + list.get(3));

        // 4. 2번째 저장된 값을 망고과자로 변경 set(index자리넘버, 변경할값)
        list.set(2, "망고과자");
        System.out.println("망고과자로 변경됐는지 확인 : " + list);

        // 5. 특정 위치의 값을 삭제 remove("삭제할값") or remove(index자리값)
        list.remove(1);
        System.out.println("index 1번 자리 값 삭제 : " + list);

        list.remove("포카칩");
        System.out.println("포카칩이 무사히 사라졌는지 확인 : " + list);


        // 6. contains("값") or contains(index자리값) 리스트에 찾는 값이 들어있는지 확인
        System.out.println("망고과자가 존재하나요? : " + list.contains("망고과자"));

        // 7. clear(); list안에 들어있는 모든 값 삭제
        list.clear();
        System.out.println("리스트 안에 값이 깨끗하게 지워졌나요? : " + list.isEmpty());

        // contains , isEmpty 는 값이 boolean 값으로 나옴
    }

    /*

        리스트에서 첫 번째 과일을 삭제하세요.
        리스트에서 망고를 삭제하세요.
        리스트에 사과가 남아있는지 확인하고 사과가 만약에 있다면 사과를 없애고 출력하세요.
        리스트를 비우고, 리스트가 비어 있는지 확인하고 결과를 출력 세요.
    */
    public void method2(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("사과");
        list.add("포도");
        list.add("바나나");
        list.add("망고");
        System.out.println("초기 과일 리스트 : " + list);
        list.add(1, "오렌지"); //인덱스 1 두번째 위치
        System.out.println("오렌지를 추가한 리스트 : " + list);
        list.set(3, "파인애플");
        System.out.println("바나나 파인애플로 변경한 리스트 : " + list);
        list.remove(0); //사과 삭제
        System.out.println("첫 번째 과일을 삭제한 리스트 : " + list);

        list.remove("망고");
        System.out.println("망고를 삭제한 리스트 : " + list);

        //사과가 존재하는지 확인하고 존재하면 삭제
        if(list.contains("사과")) {
            list.remove("사과");
            list.remove("사과를 삭제한 리스트 : " + list);
        } else {
            System.out.println("사과가 리스트에 없습니다.");
        }

        list.clear();
        System.out.println("과일바구니가 비어있나요? "  + list.isEmpty());
    }

    /* method3 기본 타입으로 자료형 제한해서 저장 */
    public void method3(){
        // 1. 정수(int)타입 제한
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println("IntList : " + intList);

        // 2. 문자(char) 타입 제한
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('가');
        charList.add('b');
        charList.add('나');
        System.out.println("CharList : " + charList);

        // 3. 논리 타입 제한 true false 리스트에 저장
        //boolList
        ArrayList<Boolean> boolist = new ArrayList<Boolean>();
        boolist.add(true);
        boolist.add(false);
        System.out.println("boolist : " + boolist);


        // 4. 실수(double) 타입 제한 doubleList
        // 1.5 3.14값을 저장
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.5);
        doubleList.add(3.14);
        System.out.println("doubleList : " + doubleList);
    }
}











