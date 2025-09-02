import java.util.Scanner;
public class SimpleNumber {
    public static void main(String[] args) {
        compareTwoNumbers(); //Задача 2
    }
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
        System.out.println("Вы все сделали правильно, удачи на следующей задаче");
    }
}