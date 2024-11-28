package com.kh.CollectionEx.pack3.mapPre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        // 4. V remove(K k) : Key가 일치하는 Entry 제거  Entry ( K : V )
        // 일치하는 키가 있다면 value, 없다면 null 반환
        나라들.remove("KR ");
        나라들.remove("EU ");
        System.out.println("제거 후 나라들 출력 : " + 나라들);

        // 만약 지우는 광경을 확인하길 원한다면 remove를 출력문 안에 작성해주면 됨
        System.out.println("[EU ]   지우기 : " + 나라들.remove("EU "));
        // 없는 key를 지우려하면 null 반환 == 지울게 없다는 의미

        // 5. clear() : 모든 Entry 삭제
        // 6. boolean isEmpty() : 비어있는지 확인
        System.out.println("clear()로 모두 지우기 전에 안에 값이 들어있는지 확인 : " + 나라들.isEmpty());

        나라들.clear();
        System.out.println("clear()로 모두 지우기 다음에 안에 값이 들어있는지 확인 : " + 나라들.isEmpty());


    }

    // 2. 향상된 for문을 이용해서 순차적으로 접근해서 출력하기
    //   2-1. Map의 경우 index가 없기 때문에 Map.keySet()을 이용해서 접근
    public void method2(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("학원", "서울시 강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");

        // Set<K> Map.keyset(): -> Map에서 key만 가져온 다음 Set 형태로 만들어 반환
        Set<String> set = map.keySet();

        System.out.println("keyset() 확인하기 : " + set);
        // set 안에는 map 키인
        //             [집, 63빌딩, 학원, 롯데타워]      만 저장
        // 향상된 for문 + Set
        for(String key : set){ //set에 저장된  [집, 63빌딩, 학원, 롯데타워] 를
            // 순차적으로 key 저장 저장된 키에 해당하는 값을
            //                  map.get(key) 를 이용해서 키에 해당하는 value 값을 get 하겠다 작성
            System.out.println(key + " : " + map.get(key));
        }

    }


    //   2-2. Map의 경우 index가 없기 때문에 Map.entrySet()을 이용해서 접근
    public void method3(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("학원", "서울시 강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");


        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        System.out.println("keyset() 확인하기 : " + entrySet);
        //[집=경기도, 63빌딩=서울시 영등포구, 학원=서울시 강남구, 롯데타워=서울시 송파구]
        // set이라고 된 변수명이 Map.Entry<String, String> 이라는 키 값 형태로
        // 값을 유지하고 있기 때문에
        // set 리스트에 작성된 목록들을 key라는 변수명으로 하나씩 가져올 때
        // Map.Entry<String, String> 이 형태로 가져온다는 표기

        // entry = key-value 한쌍으로 들어있는 존재

        for(Map.Entry<String, String> entry : entrySet){
            // key - value 한쌍씩 가져온 값에서 하나씩 출력
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}















