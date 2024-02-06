package day02;

import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {

        recordScore();
    }

    static void recordScore() {

        System.out.print("당신의 이름은 무엇입니까 ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //배열 선언
        String[] subjects = {"국어", "영어", "수학"};
        int[] scores = new int[subjects.length];

        //과목별 점수 입력 받기
        for (int i = 0; i < subjects.length; i++) {

            System.out.print(name + "님의 " + subjects[i] + " 점수: ");
            scores[i] = scanner.nextInt();
        }

        //결과 화면에 그리기
        printScreen(name, subjects, scores);
    }

    static void printScreen(String name, String[] subjects, int[] scores) {

        printLine(name);
        // 총 합계 점수
        int totalScore = calculateTotalPrice(scores);
        printSubjectWithScore(subjects, scores);
        printLine(totalScore);
    }

    static int calculateTotalPrice(int[] scores) {

        int totalScore = 0;
        for (int i = 0; i < scores.length; i++) {

            totalScore += scores[i];
        }
        return totalScore;
    }

    static void printSubjectWithScore(String[] subjects, int[] scores) {

        for (int i = 0; i < subjects.length; i++) {

            System.out.println(subjects[i] + " : " + scores[i]);
        }
    }

    static void printLine(String name) {
        System.out.println("====================");
        System.out.println("이름: " + name);
        System.out.println("====================");
    }

    static void printLine(int totalScore) {
        System.out.println("====================");
        System.out.println("합계 : " + totalScore);
        System.out.println("====================");
    }
}
