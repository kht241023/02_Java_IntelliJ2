package com.kh.oop.constructorPre;

public class Lotto {
    //필드 선언 배열도 가능
    private int[] lotto = new int[6];

    // 기본생성자

    public Lotto() {
    }

    // 6자리 숫자 + 1보너스문제

    //로또 번호를 랜덤으로 생성해서 6자리를 담는 메서드
    public void randomNumber(){
        //총 6개가 맞는지 갯수 세는 count
        int count = 0;
        // 0 1 2 3 4 5 총 6자리 돌 것이기 때문!
        while (count < 6) {
            // 숫자를 랜덤으로 1~ 45자리 수를 만들어서
            //총 6자리 출력
            // Math.random() * 45  0 ~ 44  로또번호는 1부터 시작 + 1 붙여주고 1 ~ 45 출력될 수 있도록 설정
                    //double -> int 실수부분은 자동으로 버림처리
            int num = (int) (Math.random() * 45) + 1; //강제 형변환
            boolean 중복확인 = false; // 아직 비교도 안했기 때문에 중복이 존재하는지 모르므로 false


            // 중복 확인
            //count는 현재까지 저장된 유효한 번호의 개수를 나타냄
            //새로 생성된 번호가 이미 만들어진 번호와 새로만들어진 번호가 중복인지 확인하기 위해
            // 배열에서 이미 채워진 부분만 새로 만들어진 숫자와 비교하면 되는 것
            for (int i = 0; i < count; i++ ) {
                if (num == lotto[i]) {
                    중복확인 = true;
                    break;// 기존에 있는 수와 랜덤으로 나온 수가 동일한 숫자이기 때문에 다시 랜덤으로
                    // 숫자를 생성하라고 돌려보내기
                }
            }

            // 중복이 없을 경우 배열에 추가
            if(!중복확인) {
                lotto[count] = num;
                count++;
            }
        }
    }
    // 만약에 로또번호가 생성이 모두 다 됐다면 번호 확인
    public void info(){
        if(lotto == null) { // 아무것도 없거나 잘못된 값이 넘어온 상태 null
            System.out.println("로또 번호가 생성되지 않았습니다.");
            return;
        }
        System.out.print("로또 번호 확인하기 : ");
        for (int i = 0; i < 6; i++) { //각 배열에 0 ~ 5자리까지 6자리의 수를 반복문을 통해 모두 꺼내기
            System.out.print(lotto[i] + " ");
        }
    }

}








