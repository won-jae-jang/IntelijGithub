package day02;

import java.util.Scanner;

public class Quiz04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double elevWeightLimit = 600;

        System.out.print("첫 번째 물건의 무게를 입력 하시오?");
        double firstWeight = scanner.nextDouble();
        System.out.print("두 번째 물건의 무게를 입력 하시오?");
        double secondWeight = scanner.nextDouble();

        elevWeightLimit -= (firstWeight + secondWeight);

        System.out.println();
        System.out.println("현재 엘리베이터에 허용 무게는 " + elevWeightLimit + "입니다.");
    }
}
