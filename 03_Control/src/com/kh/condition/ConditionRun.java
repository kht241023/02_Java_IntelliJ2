package com.kh.condition;

public class ConditionRun {
    // main 기능으로 ConditionEx에 작성한 기능 불러오기를 한 다음에
    // 실행하기 때문에 ConditionEx에 기능들이 실행됨
    public static void main(String[] args) {
        ConditionEx c = new ConditionEx();

        // c.나이확인();
        // 한번에 주석 처리 하기
        // 주석하고자 하는 코드들 드래그
        // Ctrl + /
//        c.scannerAge();
//        c.methodAge();
       // c.methodMonth();
        c.switchMonth();
    }
}
