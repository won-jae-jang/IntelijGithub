package day03;

import java.util.Scanner;

public class RewardWIthDice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //3번의 주사위 입력을 받음
        System.out.println("주사위 값을 3번 입력하세요: ex) 1 2 3 ");
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        //주사위의 눈이 모두 같은 경우 ex) dice1=2 dice2=2 dice3=2
        if ((dice1 == dice2) && (dice1 == dice3) && (dice2 == dice3)) {
            System.out.println(10000 + dice1 * 1000);
        }
        //주사위 눈이 2개만 같은 경우 ex) dice1=2 dice2=2 dice3=4
        else if ((dice1 == dice2) || (dice1 == dice3) || (dice2 == dice3)) {

            //어떤 주사위가 같은 값을 가졌는지 확인
            int sameValue;

            if (dice1 == dice2) {
                sameValue = dice1;
            } else if (dice1 == dice3) {
                sameValue = dice1;
            } else {
                sameValue = dice2; //dice2 = dice3 인 경우이기 때문에 dice2 or dice3 값을 넣으면 됨
            }

            System.out.println(1000 + sameValue * 100);
        }
        //주사위 눈이 모두 다른 경우
        else {

            //주사위 가장 큰 값
            int maxValue;

            if (dice1 > dice2) {

                maxValue = dice1;
                if (maxValue > dice3) {
                    System.out.println(maxValue * 100);
                }
                else{
                    maxValue = dice3; //dice3 > dice1이기 때문에 maxValue 변경
                    System.out.println(maxValue * 100);
                }
            }
            // dice1 < dice1인 경우
            else{

                maxValue = dice2;
                if (maxValue > dice3) {
                    System.out.println(maxValue * 100);
                }
                else{
                    maxValue = dice3; //dice3 > dice1이기 때문에 maxValue 변경
                    System.out.println(maxValue * 100);
                }
            }
        }
    }
}
