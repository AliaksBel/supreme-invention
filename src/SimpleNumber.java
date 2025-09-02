import java.util.Scanner;
public class SimpleNumber {
    public static void main(String[] args) {
        //compareTwoNumbers(); //Задача 2]
        taskOne(); //main task1

    }

    public static void taskOne() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your score: ");
            int score = scanner.nextInt();
            if (score > 0 && score <= 100) {
                break;
            } else {
                System.out.println("Invalid value entered. Please enter a score between 0 - 100");
            }
        }

            //  if (score > 100){
            //    System.out.println("Invalid value entered. Please enter a score between 0 - 100");
            int score = new Scanner(System.in).nextInt();
            if (score >= 90) {
                System.out.println("Your grade is A!");
            } else if (score >= 80) {
                System.out.println("Your grade is B!");
            } else if (score >= 70) {
                System.out.println("Your grade is C!");
            } else if (score >= 60) {
                System.out.println("Your grade is D!");
            } else if (score >= 50) {
                System.out.println("Your grade is E!");

                //else if (score < 0 ) {
                //System.out.println("Invalid value entered. Please enter a score between 0 - 100");
            } else System.out.println("Your grade is F1");
            System.out.println("Good by!");
    }
}
/*
    {
        //Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
        //“Число больше десяти”, если меньше – “Число меньше десяти”
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();

        if (num > 10) {
            System.out.println("Число больше десяти");
        } else {
            System.out.println("Число меньше десяти");
        }
    }
    // Пользователь вводит в консоли два числа, выводим сообщение “первое число
    //больше или меньше, чем второе” в зависимости от результата их сравнения
        /*public static void compareTwoNumbers() {
        System.out.println("Программа сравнивает разные числа: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первой число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        if (firstNumber>secondNumber){
        System.out.println("Первое число больше второго");
        }
        else if (firstNumber<secondNumber) {
            System.out.println("Второе число больше первого");
        }
        System.out.println("Вы все сделали правильно, удачи на следующей задаче");//готово))
    }*/
