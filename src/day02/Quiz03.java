package day02;

import java.util.Scanner;

public class Quiz03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("수 입력: ");
        int num1 = scanner.nextInt();

        checkEven(num1);
        multiplesOf3(num1);

        System.out.print("두 수 입력: ");
        num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        compare(num1, num2);
    }

    //짝수 홀수 여부를 체크
    static void checkEven(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " = 짝수");
        }
        else{
            System.out.println(num + " = 홀수");
        }
    }

    //3의 배수인지 확인
    static void multiplesOf3(int num) {

        if (num % 3 == 0) {
            System.out.println(num + " = 3의 배수이다.");
        }
        else{
            System.out.println(num + " = 3의 배수가 아니다.");
        }
    }

    static void compare(int num1, int num2) {

        System.out.print("num1 = " + num1);
        System.out.println(" num2 = " + num2);

        if (num1 > num2) {
            System.out.println("num1이 num2 보다 더 크다.");
        }
        else{
            System.out.println("num2가 num1 보다 더 크다.");
        }
    }
}
