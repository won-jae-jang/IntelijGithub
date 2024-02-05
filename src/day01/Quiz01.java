package day01;

public class Quiz01 {

    public static void main(String[] args) {

        infoScreen();
        memberScreen("홍길동", 15, 3672, 1234, 20000);
        memberScreen("고길동", 15, 2238, 1234, 30000);
        memberScreen("김말이", 15, 1234, 1234, 50000);
        totalScreen();
    }

    static void infoScreen() {
        System.out.println("=======================================");
        System.out.println("이름\t" + "\t나이\t" +"\t전화번호\t" +"\t회비\t");
        System.out.println("=======================================");
    }

    static void memberScreen(String name, int age, int phoneNum1, int phoneNum2, int dues) {

        System.out.println(name + "\t" + "\"" + age + "\"" + "\t" + phoneNum1 + "-" + phoneNum2 + "\t" + "\\" + dues);
    }

    static void totalScreen() {
        System.out.println("----------------------------------------");
        System.out.println("총합계\t\t\t\t\t\t" + "\\" + 10000);
        System.out.println("----------------------------------------");
    }
}
