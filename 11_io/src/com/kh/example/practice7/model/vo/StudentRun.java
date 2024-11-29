package com.kh.example.practice7.model.vo;

public class StudentRun {
    public static void main(String[] args) {
            StudentController sc = new StudentController();

            System.out.println("=== 학생 정보 출력 ===");
            for(Student s : sc.printStudent()) {
                System.out.println(s);
            }

            // 학생 성적 출력
            System.out.println("=== 학생 성적 출력 ===");
            double[] scores = sc.avgScore();
            System.out.println("학생 점수 합계 : " + (int)scores[0]);
            System.out.println("학생 점수 평균 : " + (int)scores[1]);

            // 성적 결과 출력
            System.out.println("=== 성적 결과 출력 ===");
            for (Student s : sc.printStudent()) {
                String result = s.getScore() >= StudentController.CUT_LINE ? "통과" : "재시험";
                System.out.println(s.getName() + " 학생은 " + result + " 입니다.");
            }
    }
}
