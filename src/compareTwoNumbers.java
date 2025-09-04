import java.util.Scanner;

public class compareTwoNumbers {
    public static void compareTwoNumbers() {
        System.out.println("Программа сравнивает разные числа: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("Первое число больше второго");
        }
        else if (firstNumber < secondNumber) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }
        System.out.println("Вы все сделали правильно, удачи на следующей задаче");//готово))
    }
}
