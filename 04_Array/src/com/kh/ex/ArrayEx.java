package com.kh.ex;

import java.util.Scanner;

public class ArrayEx {
    //필드
    Scanner sc = new Scanner(System.in);

    /* 배열 (자료구조)
    *
    * - Java에서의 배열
    * -> 같은 자료형의 변수를 하나의 묶음으로 다루는 것
    *
    * - 생성된 배열의 요소는 index를 이용해서 구분
    *
    * - 생성된 배열을 활용하기 위해서는
    *       배열을 참조하는 "참조형 변수"를 이용
    *
    * [참조형 변수]
    * - 주소를 저장하는 변수
    *
    * - 변수 사용 시 저장된 주소로 찾아가서 그 곳에 위치한 배열, 객체를 참조
    *
    * - 기본 자료형 8개를 제외한 나모지는 모두 참조형 변수
    *  * 기본 자료형 = byte, short, int, long, char, boolean, float, double
    *   대표적인 참조 자료형 = String, Scanner, ..이외 우리가 만든 자료형이 될 수 있음
    *
    * 자료형이 맨 앞글자가 소문자로 시작하면 기본 자료형
    * 자료형의 맨 앞글자가 대문자로 시작하면 개발자가 만들어놓은 참조 자료형
    * */
    /*
    * 동일한 타입
    * 자바 배열은 int면 전부다 int, String이면 모두다 String, char 모두다 char
    * */
    /*
     * 배열 선언, 할당, 초기화
     */
    public void method1(){

        // 변수 선언
        int num;
        // Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고
        // 그 변수의 이름을 "num"으로 지정

        // 배열 선언
        int[] arr;
        // Stack 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소 저장)
        // 그 변수의 이름을 "arr"로 지정  arr = array의 줄임말

        //배열 할당
        arr = new int[4];
        // Heap 영역에 int 4개짜리 배열을 할당한 후
        // 생성된 배열의 주소를 arr 변수에 대입

        // arr 을 이용해서 배열을 참조할 수 있음

        // 배열 초기화

        // 1) 초기화 전 -> 0이 대입되어 있는지 확인
        System.out.println("초기화 전");

        // * bug : 프로그램 수행 중 발생하는 오류(==error)

        // * debug : 프로그램 수행 중 특정 시점에 어떤 값을 지니고 있는지 확인하는 것
        //          -> 코드 상태, 오류를 분석할 수 있음

        // 2) 인덱스를 이용한 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 3000;
        arr[3] = 5;

        System.out.println("초기화 후");

        /*
        배열은 JS와 마찬가지로
        index  = 0번부터 시작   각 값의 자리번호를 매김하는 기능
        length = 1번부터 시작해서 총 길이를 표현하는 기능

        초기화 전
        arr = new int[4]
        [Stack]                          [heap]
         +-------------+             +------------------+
         |  arr(주소)  | ------->   |  [0] [1] [2] [3]  |
         +-------------+           |   0   0   0   0   |
                                   +------------------+

         값들을 넣어 초기화한 상태
         arr[0] = 100 arr[1] = 200 arr[2] = 3000 arr[3] = 5
         [Stack]                          [heap]
         +-------------+             +------------------+
         |  arr(주소)  | ------->   |  [0] [1] [2] [3] |
         +-------------+           |  100 200 3000  5  |
                                   +------------------+

         초기화 전
         int[] arr; 실행 시
                - Stack에 arr 변수 생성 (현재는 주소가 없는 상태);

         arr = new int[4] 실행 시
                - Heap 크기 4짜리 배열이 생성되고 초기값은 0으로 설정
                - Heap에 생성된 배열의 시작 주소가 Stack의 arr에 저장됨
                이제 arr은 Heap의 배열을 참조할 수 있음
          결과적으로
            Stack : arr 변수는 Heap 배열의 주소를 가짐
            Heap : 배열이 생성되어 초기화된 상태

          arr[0] = 100 arr[1] = 200 arr[2] = 3000 arr[3] = 5 값을 넣었을 때
                - Heap에 있는 배열의 각 인덱스에 지정된 값을 저장
                Stack : arr 변수에는 Heap에 있는 배열의 주소값이 저장됨
                Heap : 주소가 가리키는 배열이 각 인덱스에 할당된 값을 포함
        */
    }

    // 배열을 이용해서 Stack과 Heap 비교
    public void method2(){
        int x = 10; //Stack에 저장
        int[] arr = new int[3]; // Heap 저장
        arr[0] = 100; // Heap 공간의 첫 번째 칸에 100을 저장
        /*
        * Stack : 메모장
        * 간단히 메모하고 지우는 공간
        * 프로그램이 끝나면 메모지도 자동으로 치워짐
        *
        * Heap : 창고
        * 큰 물건을 저장하고, 필요할 때 주소를 이용해 꺼내 씀
        * 창고에 저장한 물건은 직접 정리를 해야지 나중에 어디에 데이터가 있는지알고
        * 찾을 수 있음
        *
        * */
    }

    /*
    * 정수 4개를 입력 받아
    * 배열에 차례대로 대입 후
    * 결과를 확인
    * */
    public void method3(){
        // 배열 선언 + 할당
        // int arr = new int[4];
        // -> 자바에게 값을 담을 공간이 배열형태임을 미리 알려주지 않으면
        // 에러 발생 반드시 int나 변수명 앞 뒤에 [] 붙여줘야함
        // 단 int와 같은 자료형 앞은 붙이기 X
        /*
        기본자료형에 [] 붙었기 때문에 참조형 변수가 되는 것
        int arr = new int[4]; (X)
        []int arr = new int[4]; (X)
        int[] arr = new int[4]; (O)
        int []arr = new int[4]; (O)
        int arr[] = new int[4]; (O)
        배열이름.length : 배열 길이
        * */

        //for 문을 이용해서 i = 0, 1, 2, 3 확인
        int []arr = new int[4];
        for(int i=0; i<arr.length; i++) {
            System.out.println(i + "번째 인덱스 위치");
        }
    }

    // 배열 역순 출력
    public void method4(){
        int[] arr = {4, 6, 7, 3, 9};

        System.out.print("배열 역순 출력 : "); //가로로 이어쓰기
        // index 4번부터 0번까지만 출력
        for(int i = arr.length -1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr);
        // [I@5dfcfece 와 같은 주소 값 보임
        //[ 배열시작뜻 I 정수형이라는의미 @뒤는 배열구분명칭 16진수 표기
        System.out.println("arr 0번째 값 " + arr[0]);
        System.out.println("arr 1번째 값 " + arr[1]);
        System.out.println("arr 2번째 값 " + arr[2]);
        System.out.println("arr 3번째 값 " + arr[3]);
        System.out.println("arr 4번째 값 " + arr[4]);
        //System.out.println("arr 5번째 값 " + arr[5]);
        //Index 5 out of bounds for length 5
        // index값이 0 ~ 4 까지 있기 때문에
        // 없는 자리를 찾는다는 에러가 발생
    }

    // 문자열 배열 출력
    public void method5(){
        String[] days = {"월요일", "화요일","수요일","목요일","금요일","토요일","일요일"};

        //요일들 모두 for문을 이용해서 출력하기
        for(int i=0; i<days.length; i++) {
            System.out.println(days[i]);
        }
    }

}










