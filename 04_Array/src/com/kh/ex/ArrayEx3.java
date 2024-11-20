package com.kh.ex;

public class ArrayEx3 {
    // Heap 에 저장되어있는 기능
     public void method1(){
        /*
       이차원 배열은 배열 안에 배열이 있는 형태로, 배열의 배열
       행(row)과 열(Column) 구성된 데이터 구조
       표나 행렬의 형태로 데이터를 저장할 때 사용

        배열의 차원 :
            - 배열이 몇 개의 차원으로 구성되어 있는지에 따라 다름
            - 1차원 배열은 단순히 값들이 일렬로 나열된 배열
            - 2차원 배열은 여러 개의 1차원 배열이 모여서 하나의 큰 배열을 이루는 구조
       배열의 선언 :
       배열 선언 및 초기화 :
                    타입[][] 배열명 = new 타입[행의 개수][열의 개수];
                    타입 [][]배열명 = new 타입[행의 개수][열의 개수];
                    타입 배열명[][] = new 타입[행의 개수][열의 개수];
                    XXX [][]타입 배열명 = new 타입[행의 개수][열의 개수]; XXX
                    예 ) int[][] arr = new int[3][4]
                    3개의 행과 4개의 열을 갖는 이차원 배열
        */
    }
    //int[][] grades ={{90, 85, 88, 92},{78, 82, 79, 85}, {88, 90, 92, 85}};
    //String[]과일들 ={       "사과",        "오렌지",           "바나나"};


    // 학생 1,2,3의 국어 영어 수학 과학 성적
    public void method2(){
         int[][] grades ={
            //   국어 영어 수학 과학
                 {90, 85, 88, 92}, // 학생 1의 성적
                 {78, 82, 79, 85}, // 학생 2의 성적
                 {88, 90, 92, 85}  //학생 3의 성적
        }; //배열을 작성하고 나면 무조건 ;으로 최종 배열닫기완료를 진행해줘야함

        //학생별 성적을 직접 인덱스로 접근해서 출력
        System.out.println("===== 학생 1의 성적 =====");
        System.out.println("학생 1의 국어 성적 : " + grades[0][0]);
        System.out.println("학생 1의 영어 성적 : " + grades[0][1]);
        System.out.println("학생 1의 수학 성적 : " + grades[0][2]);
        System.out.println("학생 1의 과학 성적 : " + grades[0][3]);

        System.out.println("학생 2의 국어 성적 : " + grades[1][0]);
        System.out.println("학생 2의 영어 성적 : " + grades[1][1]);
        System.out.println("학생 2의 수학 성적 : " + grades[1][2]);
        System.out.println("학생 2의 과학 성적 : " + grades[1][3]);

        System.out.println("학생 3의 국어 성적 : " + grades[2][0]);
        System.out.println("학생 3의 영어 성적 : " + grades[2][1]);
        System.out.println("학생 3의 수학 성적 : " + grades[2][2]);
        System.out.println("학생 3의 과학 성적 : " + grades[2][3]);
     }

     //3개의 과일과 그 과일의 색상, 맛 ,크기 정보를 저장하는 이차원 배열
     public void method3(){
         String[][] fruits = {
                 // index 0 번째 자리에 그룹
                 {"사과", "빨강", "단맛", "중간"},   // 과일 1 (사과)의 정보가 들어있는 index 0번
                 {"귤"  , "오렌지", "새콤","작음"},  // 과일 2 (귤)의 정보가 들어있는 index 1번
                 {"포도", "보라", "달콤", "작음"}    // 과일 3 (포도)의 정보가 들어있는 index 2번
         };
         //각 과일의 정보 출력
         System.out.println("과일 1 : " + fruits[0][0] +" (색상 : " +  fruits[0][1]   + ", 맛 : " + fruits[0][2] + ", 크기 : " + fruits[0][3] + ")");
         System.out.println("과일 2 : " + fruits[1][0] +" (색상 : " +  fruits[1][1]   + ", 맛 : " + fruits[1][2] + ", 크기 : " + fruits[1][3] + ")");
         System.out.println("과일 3 : " + fruits[2][0] +" (색상 : " +  fruits[2][1]   + ", 맛 : " + fruits[2][2] + ", 크기 : " + fruits[2][3] + ")");
    
         
         /*
         * 주의해야할점
         * 없는자리에 있는 값을 가져오려하면 문제가 발생
         * index는 무조건 0부터 순차적으로 자동 번호 매김이됨
         * 마음대로 바꾸기 X
         * 만약에 길이가 3인 배열에 index 0,1번째 값 기입을 안했다면
         * index[0] = 0
         * index[1] = 0
         * index[2] = 개발자가 기입한 숫자
         * index로 치면 0,1,2
         * length로 치면 총 3개
         * */
     }
}
