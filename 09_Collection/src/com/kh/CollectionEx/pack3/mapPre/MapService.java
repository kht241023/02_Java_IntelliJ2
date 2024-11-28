package com.kh.CollectionEx.pack3.mapPre;

import java.util.HashMap;

public class MapService {


    // 1. HashMap을 이용해서 값 추가하고 확인하기
    public void method1(){
        HashMap<String, String> 나라들 = new HashMap<String, String>();

        // 데이터 추가
        나라들.put("KR", "Korea");
        나라들.put(" KR", "Korea");
        나라들.put("KR ", "Korea");
        나라들.put(" KR ", "Korea");
        나라들.put("US", "United States");
        나라들.put("EU", "Europe");

        System.out.println("각 국가들의 약칭 확인하기 : " + 나라들);
        //각 국가들의 약칭 확인하기 : {EU=Europe, KR=Korea, US=United States}
        // 우리가 작성한 순서와 관계없이 나열
        // Key 스페이스바를 추가하면 스페이스바로 넣은 띄어쓰기 또한 하나의 글자로 인식하기 때문에
        // 마치 중복돼서 출력 되는것처럼 보임
        // KR=Korea 가 네 번 보여질 것!


        // 2. Key에 해당되는 Value를 반환
        System.out.println("--------------------------------------");
        System.out.println(나라들.get("EU")); // Europe 존재하는 키의 값을 보여주고
        System.out.println(나라들.get("CN")); // null   존재하지 않는 키는 null값을 출력

        // 3. size() 이용해서 Map에 저장된 Entry(K : V)의 개수 출력 size는 int 값으로 나옴
        System.out.println("저장된 나라 종류 수 : " + 나라들.size());


    }
}
