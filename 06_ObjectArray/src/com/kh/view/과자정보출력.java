package com.kh.view;

import com.kh.dto.과자;

public class 과자정보출력 {

    // 과자 목록 출력
    public void 과자리스트출력(String companyName, 과자[] snacks, int count) {
        System.out.println("=== " + companyName + " 과자 목록 ===");
        // 과자들이 존재한다면 가장 마지막에 들어가는 갯수를 세고 모두 for문으로 출력
        for(int i = 0; i < snacks.length; i++) {
            System.out.println(snacks[i]);
        }
    }

    //과자 추가 결과 출력
    public void 추가결과(boolean isAdd) {
        if(isAdd) {
            System.out.println("과자가 성공적으로 추가되었습니다.");
        } else {
            System.out.println("더 이상 과자를 추가할 수 없습니다.");
        }
    }
}
