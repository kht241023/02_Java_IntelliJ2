package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class MenuService {

    private HashSet<Menu> menuSet = new HashSet<>();

    // 메뉴 추가
    public void addMenu(Menu menu) {
        // menu를 통째로 넣을 때는 같은 조건이
        // 메뉴 아이디 이름 가격이 모두 동일했을 때 기준
        if(menuSet.add(menu)) { //메뉴가 만약에 기존에 없는 메뉴라면
            System.out.println("메뉴가 추가되었습니다. " + menu);
        } else {
            System.out.println("이미 존재하는 메뉴입니다. " + menu);
        }
    }

    // 메뉴 삭제
     public void removeMenu(int id) {//원하는 id값을 입력하고
        for(Menu menu : menuSet) { //메뉴를 순차적으로 확인했을 때
            if(menu.getId() == id) { //삭제원하는 id값이 존재한다면
                menuSet.remove(menu);  //메뉴를 삭제
                break;                  //삭제하고나서 if문을 종료
            }
        }
        System.out.println("해당 메뉴가 삭제되었습니다.");
     }

    // 메뉴 검색
    public Menu searchMenu(int id) { //검색하고자 하는 id를 입력받고
        for(Menu menu : menuSet) { //메뉴리스트를 순차적으로 확인했을 때
            if(menu.getId() == id) { // 검색하고자 하는 id값이 존재한다면
                return menu;        // 메뉴를 전달해서 보여주고
                // return 전달까지만 진행한 것이고 출력 은 현재 되지 않는 상태이기때문에
                ///  소비자 눈에 보이지 않음
            }
        }
        // 검색한 메뉴 id가 존재하지 않는다면
        System.out.println("검색된 메뉴가 없습니다.");
        return null; //빈값인 null값을 전달
    }

    // 모든 메뉴 출력
    public void printAllMenu() {
        // 만약에 리스트가 비어있다면
        if(menuSet.isEmpty()) {
            System.out.println("조회할 메뉴가 존재하지 않습니다.");
        } else {
            for (Menu menu : menuSet) {
                System.out.println(menu);
            }
        }

    }
}
