import suitcase.packagees.BigSuitcase;
import suitcase.packagees.SmallSuitcase;
import suitcase.packagees.Suitcase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    Properties properties = new Properties();
    private Object name;
    FileInputStream fileInputStream = FileInputStream(name: "src/configs/config.properies");
    properties.load(fileInputStream);
    String username = properties.getProperty("username");
    String password = properties.getProperty("password");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Suitcase[] suitcases = {
                new SmallSuitcase("Пластик", "зеленый"),
                new BigSuitcase("Ткань", "голубой")
        };

        System.out.println("Выберите чемодан:");
        System.out.println("1 - Маленький чемодан");
        System.out.println("2 - Большой чемодан");
        System.out.print("Ваш выбор 1 или 2: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n" + suitcases[0].getInfo());
        } else if (choice == 2) {
            System.out.println("\n" + suitcases[1].getInfo());
        } else {
            System.out.println("Неверный выбор! Выберите 1 или 2");
        }

    }
}
