package com.kh.oop.lombokPre;
//Alt Shift Enter -> 가져와야되는 경로가 있다면 자동 추가
/*
lombok 을 사용하기 위해 종속성 설정을 진행해줘야함
하지만 현재는 진행을 할 수 없음
*/
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // 기본 생성자 어노테이션
@AllArgsConstructor //필수 생성자 어노테이션
@Setter             // Setter 어노테이션
@Getter             // Getter 어노테이션
public class Person {

    private String name;
    private int age;

    /*
    import lombok.NoArgsConstructor; -> 룸복 회사에서 만든 기본생성자 기능 가져오기~~
    @NoArgsConstructor               -> 기능 가져와서 사용하기

    기본생성자 = 넣어야하는 매개변수가 없기 때문에 No Args Constructor
    () -> 넣어야하는 값이 없기 때문에 매개변수명도 존재하지 않음 그래서 No Args!
    public Person(){

    }
    */
    /*
    import lombok.AllArgsConstructor; -> 롬복 회사에서 만든 매개변수 생성자 기능 가져오기
    @AllArgsConstructor               -> 기능 가져와서 사용하기
    모든 파라미터 값을 넣어야하는 생성자 -> 필드에 작성된 모든 값 가져오기
    All Args = 모든 전달인자(아규먼츠)값을 가져와서 매개변수명 안에 넣어주기

    아래 코드 대신에 위 두줄을 이용해서 매개변수값이 들어있는 생성자 표기 가능
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
     */
    /*
    import lombok.Setter; ->lombok이라는 폴더 밑에 만들어진 Setter 기능을 가져와서 사용
    @Setter               -> 클래스 밑에 작성된 필드명에 걸맞는 set 메서드들을 @Setter
                               이름을 활용해서 대신 모두 생성
    public void setName(String name){
        this.name = name;
    }
    public void setAge(ing age){
        this.age = age;
    }
     */
    /*
    나중에 롬복이라는 회사를 이용해서 @Getter로 만 표기를 할 것!

    import lombok.Getter; ->lombok이라는 폴더 밑에 만들어진 Getter 기능을 가져와서 사용

    @Getter               -> 클래스 밑에 작성된 필드명에 걸맞는 get 메서드들을 @Getter
                               이름을 활용해서 대신 모두 생성

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
     */
}
