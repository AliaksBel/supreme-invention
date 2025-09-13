import java.util.Scanner;

public class taskThreeFor {
        public static void main (String[] arg){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a5 number: ");
            int x = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
            // недоделана не понимаю задания, требуется уточнение

   }

}

