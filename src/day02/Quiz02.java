package day02;

import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {

        recordScore();
    }

    static void recordScore() {

        final int SIZE = 3;

        System.out.print("당신의 이름은 무엇입니까 ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] subjects = {"국어", "영어", "수학"};
        int[] scores = new int[SIZE];

        for (int i = 0; i < subjects.length; i++) {

            System.out.print(name + "님의 " + subjects[i] + " 점수: ");
            scores[i] = scanner.nextInt();
        }

        printScreen(name, subjects, scores);

    }

    static void printScreen(String name, String[] subjects, int[] scores) {

        printLine(name);
        int totalScore = 0;
        for (int i = 0; i < subjects.length; i++) {

            System.out.println(subjects[i] + " : " + scores[i]);
            totalScore += scores[i];
        }
        printLine(totalScore);
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
