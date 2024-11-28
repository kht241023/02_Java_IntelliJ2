package com.kh.exceptionEx;
/*
* Exception (예외) : 코드로 처리 가능한 에러
* Exception Handling (예외 처리) : Exception 발생 시 처리하는 구문
* */
public class ExceptionService {

    // method1 문제를 발생시킬 것
    public  void method1(){
        // index  =  0 1 2 3 4
        int[] arr = {1,2,3,4,5}; //마지막 인덱스 == 4
        System.out.println(arr.length);
        //arr.length = 5
        // for문으로 출력
        for(int i = 0; i <= arr.length; i++){ // i = 0 부터 5까지 출력
            System.out.println(arr[i]);
        }
        /*
        컴퓨터가 예기치 못한 상황이 발생했고,
        결과를 개발자한테 전달하고 예기치 못한 상황에 대해
        해결해달라는 메세지를 전달

        Exception in thread "main"
        java.lang.ArrayIndexOutOfBoundsException: I
        ndex 5 out of bounds for length 5
        *
        */
        /*
        * 예외 발생 구문을 try-catch로 처리 (예외 처리)
        *
        * - try{} : 예외가 발생할 수 있을 것 같은 코드들을 시도하는 구문
        *
        * - catch(예외){} :
        *           try안에 작성한 코드들을 실행하던 도중
        *           문제가 발생했고, 발생한 문제가 예상했던 문제와 같으면
        *           내가생각한 문제가 맞아! catch(잡아서)
        *           catch {} 중괄호 안에 작성된 구문 수행
        *           -> 발생된 예외를 다른 방식으로 처리했기 때문에
        *               프로그램이 멈추지 않고 정상적으로 수행
        *           catch는 1개가 아니라 100 1000개 이상 작성 가능
        *
        * 문제가 발생하는데 어떤 문제인지 예상이 되지 않을 경우
        * catch(Exception e){} 로 작성하면 모든 문제는 잡힘
        * */
    }

    // method2 발생한 문제를 유연하게 처리할 것 try - catch
    public void method2(){
        int arr[] = {1,2,3,4,5};  // index =  0 ~ 4 length  = 5
        try { //문제가 생길 수 있지만 실행은 해볼 것!
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) { // e는 발생된 문제 내용을 저장하고 있는 변수명
            System.out.println("값에 문제가 생긴것 같습니다. ^ ^");
            // 문제가 생겼을 때 유연하게 처리함과 동시에
            // 왜 문제가 생겼는지 개발자의 눈으로 확인하고 싶음!
            System.out.println(e);
        }

    }
}
