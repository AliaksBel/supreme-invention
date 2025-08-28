import java.util.Scanner;

public class keyboardInput {
    public static void main(String[] args)  {
        Scanner userInputScanner = new Scanner(System.in); // вызов сканера
        System.out.println("Введите текст"); // выводит текст пользователю
        String userInput = userInputScanner.nextLine(); // пользователь вводит значение

        System.out.println("Моя первая строка: \"" + userInput + "\"");

        }
    }
