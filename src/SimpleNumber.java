import java.util.Scanner;
public class SimpleNumber {
    public static void main (String[] args) {
     //   taskOne(); //main task1
        taskTwo(); //main task2
        new taskTwoWhile();
    }
    public static void taskTwo() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        while (userInput.isEmpty()) {
            System.out.println("Please enter something: ");
            //userInput = scanner.nextInt();
        }
        System.out.println("You've entered:" + userInput);
    }


    public static void taskOne() {
            Scanner scanner = new Scanner(System.in);
            int score;
            do { // Повторяю этот блок пока не введут значение от 0-100
                System.out.println("Please enter a score: ");
                score = scanner.nextInt();
                if (score < 0 || score > 100){
                    System.out.println("Invalid value entered. Please enter a score between 0 - 100");
                }
            } while (score < 0 || score > 100); // Повторять, пока не введут корректное число


            //int score = new Scanner(System.in).nextInt();
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
*/