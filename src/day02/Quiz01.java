package day02;

public class Quiz01 {

    public static void main(String[] args) {

        String name = "김말이";
        int age = 20;
        double height = 173.3;
        int iq = 120;
        String grade = "B";
        printScreen(name, age, height, iq, grade);
    }

    static void printScreen(String name, int age, double height, int iq, String grade) {

        System.out.println("이름\t\t: " + name);
        System.out.println("나이\t\t: " + age);
        System.out.println("키\t\t: " + height);
        System.out.println("아이큐\t: " + iq);
        System.out.println("등급\t\t: " + grade);
    }
}
