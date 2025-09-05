import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Suitcase smallSuitcase = new Suitcase();

        int result = sum(1, 3, 3,3,3, 3,3, 9);
        System.out.println(result);

        smallSuitcase.material = "plastic";
        smallSuitcase.color = "green";
        smallSuitcase.width = 10;
        smallSuitcase.length = 15;
        smallSuitcase.height = 5;

        smallSuitcase.fillSuitcase ("t-short",  300);

        Suitcase mediumSuitcase = new Suitcase();

        mediumSuitcase.material = "plastic";
        mediumSuitcase.color = "blue";
        mediumSuitcase.width = 20;
        mediumSuitcase.length = 35;
        mediumSuitcase.height = 15;

        Suitcase largeSuitcase = new Suitcase();

        largeSuitcase.material = "plastic";
        largeSuitcase.color = "Black";
        largeSuitcase.width = 50;
        largeSuitcase.length = 55;
        largeSuitcase.height = 45;

        System.out.println(smallSuitcase.getInfo());
    }
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}

