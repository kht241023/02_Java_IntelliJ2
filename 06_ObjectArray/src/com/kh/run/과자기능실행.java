package com.kh.run;

import com.kh.service.과자추가기능;
import com.kh.view.과자정보출력;

public class 과자기능실행 {

    public static void main(String[] args) {

        //회사명 추가
        String compayName = "맛나 과자";
        // 과자 최대 추가 갯수 5개만 가능
        int maxSnacks = 5;


        // 과자 추가 기능 과자정보출력 가져오기
        과자추가기능 service = new 과자추가기능(maxSnacks); //과자는 최대 5개 추가 가능
        과자정보출력 view = new 과자정보출력();
        //과자 추가를 무사히 했는지 추가결과 넣을 것
        view.추가결과(service.addSnack("초코칩 쿠키", 1500, "달콤한 초코맛"));
        view.추가결과(service.addSnack("허니버더칩", 2000, "달콤한 버터맛"));
        view.추가결과(service.addSnack("새우강", 1200, "짭짤한 새우맛"));
        view.추가결과(service.addSnack("고구마칩", 1800, "달콤한 고구마맛"));
        view.추가결과(service.addSnack("감자칩", 1500, "고소한 감자맛"));
        view.추가결과(service.addSnack("치즈볼", 1900, "고소한 치즈맛"));



        view.과자리스트출력(compayName,service.getSnacks(),service.getCount());
    }
}
