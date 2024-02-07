package day02;

import java.util.HashMap;
import java.util.Iterator;

public class Member {

    private String name;
    private HashMap<String, Integer> scoreMap = new HashMap<>();

    public Member() {

    }
    public Member(String name, int koreaScore, int englishScore, int mathScore) {
        this.name = name;

        scoreMap.put("koreaScore", koreaScore);
        scoreMap.put("englishScore", englishScore);
        scoreMap.put("mathScore", mathScore);
    }

    public void printScreen() {

        System.out.println("===========학생정보===========");
        System.out.println("이름 \t국어 \t영어 \t수학 \t합계 \t평균");
        System.out.println("-----------------------------");
        printScore();
    }

    private void printScore() {

        int totalSum = calTotalSum();
        double average = calAverage();

        System.out.print(name + " ");
        Iterator<String> iterator = scoreMap.keySet().iterator();
        while (iterator.hasNext()) {

            String key = iterator.next();
            System.out.print("   " + scoreMap.get(key) + "    ");
        }
        System.out.println(totalSum + " " + average);

    }

    private int calTotalSum() {

        int totalSum = 0;
        Iterator<String> iterator = scoreMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            totalSum += scoreMap.get(key);
        }
        return totalSum;
    }

    private double calAverage() {

        int totalSum = calTotalSum();
        return (double) totalSum / (double) scoreMap.size();
    }
}
