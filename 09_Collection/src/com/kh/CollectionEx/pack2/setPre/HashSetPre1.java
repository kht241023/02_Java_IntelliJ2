package com.kh.CollectionEx.pack2.setPre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

// 컬렉션 프레임워크 : Java에서 자료구조를 만들어서 모아둔 것
// java.util 폴더안에 있음
//특징
//1) 크기 제한 없음(부족하면 자동으로 증가)
//2) 추가 수정 삭제 검색 등 다양한 기능이 구현되어 있음
public class HashSetPre1 {
    /*
    Set (집합, 주머니)
    - 기본적으로 순서를 유지하지 않음 (index가 없음 -> get() 메서드도 없음)

    - 중복데이터 저장 X (같은 값이 들어오면 덮어쓰기)

    Set 인터페이스의 자식 클래스
        1. HashSet (대표) : 처리 속도가 빠른 Set
        2. LinkedHashSet : 순서를 유지하는 Set
        3. TreeSet : 자동 정렬되는 Set
    */
    /*
    * method1() 아무값을 넣고 중복허용되는지 확인
    * */
    public void method1(){
        HashSet set = new HashSet(); //자료형 제한없이 String int 개발자가만든자료형 ... 다양한 자료형 모두 ok
        set.add("점심");
        set.add(100);
        set.add(true);
        set.add(3.14);

        set.add("점심");
        set.add("저녁");
        set.add("점심2");
        System.out.println(set); //set.toString() 생략
        // 넣자고 작성한 순서대로 유지되는 것이 아님
        // [점심2, 점심, 100, 3.14, 저녁, true]

        ArrayList list = new ArrayList();
        list.add(1);
        list.add("점심");
        list.add("점심");
        list.add("점심");
        list.add("저녁");
        list.add("저녁2");
        System.out.println(list); //list.toString() 생략


    }

    // method2 HashSet을 이용해서 자료형이 String 과일 추가
    public void method2(){
        HashSet<String> set = new HashSet<String>();
        set.add("사과");
        set.add("바나나");
        set.add("포도");
        set.add("사과 ");
        set.add(" 사과");
        set.add(" 사과 ");
        // [포도, 사과, 바나나] 사과 바나나 포도 순서대로 저장 X
        // 사과는 중복이기 때문에 저장 X
        // 띄어쓰기사과, 띄어쓰기사과띄어쓰기, 사과띄어쓰기
        // 띄어쓰기 또한 글자의 일부분으로 생각하기 때문에
        // 동일한 값이 들어가는 것처럼 보임
        System.out.println("set에 저장된 모든 리스트 출력 : " + set);

        System.out.println("개수 확인 : " + set.size());

        set.remove("포도");
        System.out.println("포도를 제외한 모든 리스트 출력 : " + set);

        // 바나나가 set안에 들어있는지 확인
        set.contains("바나나"); // 결과가 들어있다면 true 없다면 false
        // 결과를 보기위해서는 System.out.print 로 출력해서 확인해야함!
        System.out.println("바나나가 들어있는지 확인 : " + set.contains("바나나"));

        // set에 저장된 내용 모두 삭제
        set.clear();

        // isEmpty() 비어있으면 true 아니면 false
        System.out.println("제대로 모두 비우셨나요? : " + set.isEmpty());
        System.out.println("set 리스트 출력해서 목록이 비어있는지 확인 : " + set);
    }
    
    // method3 HashSet을 이용해서 자료형이 int를 이용해서 10 200 3000 500 40 추가
    // 3000을 지우고 제대로 지웠는지 확인
    // 500이 들어있는지 확인하고 존재여부 체크
    //모두 비우기  모두 비웠는지 확인
    // int -> Integer
    public void method3(){
        // intSet
        HashSet<Integer> intSet = new HashSet<Integer>();
        // ArrayList 숫자값을 제거할 때 Integer.valueOf(정수값)
        // 값을 저장할 때 자리값 = 추가한값
        //                    0     = Integer.valueOf(500)
        //                index0번째 = 500

        // set에는 index라는 개념이 존재하지 않기 때문에
        // Integer.valueOf() 와 같은 특수 기능 사용하지 않아도 숫자를 제거할 수 있음
        intSet.add(10);
        intSet.add(200);
        intSet.add(3000);
        intSet.add(500);
        intSet.add(40);
        
        System.out.println("값이 제대로 들어갔는지 intSet 출력 " + intSet);
        
        intSet.remove(3000);
        System.out.println("3000이 무사히 지워졌는지 확인 출력 : " + intSet);
        System.out.println("500이 들어있는지 확인 : " + intSet.contains(500));
        intSet.clear();
        System.out.println("모두 비워졌는지 확인 : " + intSet.isEmpty());
        System.out.println("intSet 리스트 출력 " + intSet);
    }

    // set 을 향상된 for문 (= for-each) 출력하기
    // 일반 for문 경우 index 가 존재하지 않기 때문에 사용 제한 그
    // 대신 Iterator 라는 반복문을 이용해서 출력
    public void method4(){
        HashSet<String> strList = new HashSet<String>();
        strList.add("참외");
        strList.add("토마토");
        strList.add("수박");

        System.out.println("strList : " + strList);

        //for-each 문으로 HashSet 출력
        for(String s : strList){
            System.out.println(s); //중복이 허용되지 않는 set 목록에서
            //하나씩 꺼낸다음 s 변수명에 값을 하나씩 담고 출력
        }
    }

    // Iterator를 이용한 set 출력
    public void method5(){
        HashSet<String> str = new HashSet<>();
        str.add("딸기");
        str.add("사과");
        str.add("바나나");
        str.add("포도");

        // Iterator 반복문을 이용해서 HashSet출력
        ; //HashSet  목록을 담고있는 str 변수명을 가져와서 반복하겠다 설정
        Iterator<String> it = str.iterator();
        while(it.hasNext()){ //만약에  hasNext() = 다음값이 존재한다면 true
            System.out.println(it.next());
         // it 에는 현재 str에서 꺼내온 값이 들어있음 값을 꺼냈으면 next 다음 값을 준비해서 it 넣는 것
        }
        /*
        *  Iterator = 컬렉션을 순차적으로 회전하는 객체
        *               (HashSet 이외에도 ArrayList 등 Collection으로 작성된 객체들에게 모두 사용 가능)
        *
        * .iterator() = 반복을 원하는 변수명 뒤에 작성한 후 반복을 하겠다는 설정
        *               값에다가 순차적으로 접근
        *
        * .hasNext() = 반복할 수 있는 값이 남아있는지 확인
        *              결과 : true = 아직 반복할 요소(=리스트 목록 안에 들어있는 값)가 남아있음
        *                    false = 더이상 반복할 요소(=리스트 목록 안에 들어있는 값)가 없음
        *
        * it.next() = 현재 Iterator 가 가리키고 있는 현재 값을 보여주고, 그 다음에 자동으로 다음 값으로 이동설정
        * */

        // set의 경우 대표적으로 Lotto 번호 생성할 때 사용
    }

    // Iterator 이용해서 로또 번호 생성
    public void iterLotto(){
        // 1. HashSet을 이용해서 로또 번호 저장
        HashSet<Integer> lottoNumbers = new HashSet<>();

        // 2. 중복없이 6개의 번호 생성 for문 이용
        // 로또숫자들이 총 0부터 5까지   6개 이하일 때만 for문을 반복
        for(int i =0; lottoNumbers.size() < 6; i++){
            // 어떤 숫자를 추가할 것이냐면 Math.random 으로 가져온 숫자를 사용
            //  Math.random() = 0.0 ~ 1.0 사이의 소수를 출력  0.000000000001 ~ 0.9999999999999 사이 소수 출력
            //  Math.random() * 45 = 45.23423252535235342523 앞에 (int) 를 붙여주면 . 뒤에 있는소수들이 버려짐
            // (int) (Math.random() * 45)    소수점이 버려졌기 때문에 0부터 44까지의 숫자를 만듬
            // 로또에는 0이라는 숫자가 없고, 45까지 숫자가 존재하기 때문에 모든 수 뒤에 +1을 붙여줌으로써
            // 0 ~ 45자리 랜덤 숫자를 만들 수 있음
            //        (Math.random() * 45) + 1;
            int num = (int) (Math.random() * 45) + 1;
            lottoNumbers.add(num); //만들어진 숫자를 중복허용되지 않는 set 담기
        }
        System.out.println("lottoNumbers 출력 : " + lottoNumbers);


        // 로또 생방송 프로그램 번호를 하나씩 보여줄 것
        Iterator<Integer> it = lottoNumbers.iterator();
        System.out.println("=== 로또 번호 ===");
        while(it.hasNext()){
            System.out.println(it.next()); //로또 번호들이 순차적으로 하나씩 나옴
        }

    }


    // for-each(향상된 for문)이용해서 로또 번호 생성
    public void forLotto(){
        HashSet<Integer> lottoNumbers = new HashSet<>();

        for(int i =0; lottoNumbers.size() < 6; i++){
            // 어떤 숫자를 추가할 것이냐면 Math.random 으로 가져온 숫자를 사용
            //  Math.random() = 0.0 ~ 1.0 사이의 소수를 출력  0.000000000001 ~ 0.9999999999999 사이 소수 출력
            //  Math.random() * 45 = 45.23423252535235342523 앞에 (int) 를 붙여주면 . 뒤에 있는소수들이 버려짐
            // (int) (Math.random() * 45)    소수점이 버려졌기 때문에 0부터 44까지의 숫자를 만듬
            // 로또에는 0이라는 숫자가 없고, 45까지 숫자가 존재하기 때문에 모든 수 뒤에 +1을 붙여줌으로써
            // 0 ~ 45자리 랜덤 숫자를 만들 수 있음
            //        (Math.random() * 45) + 1;
            int num = (int) (Math.random() * 45) + 1;
            lottoNumbers.add(num);
        }
        System.out.println("lottoNumbers 출력 : " + lottoNumbers);

        // 로또 생방송 프로그램 번호를 하나씩 보여줄 것
        /* 향상된 for문으로 변경하기   ->        int            lottoNumbers
            Iterator<Integer> it = lottoNumbers.iterator();
            System.out.println("=== 로또 번호 ===");
            while(it.hasNext()){
                System.out.println(it.next()); //로또 번호들이 순차적으로 하나씩 나옴
            }
         */
        for( int n : lottoNumbers){
            System.out.println(n);
        }

    }
}














