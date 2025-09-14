import suitcase.packagees.BigSuitcase;
import suitcase.packagees.SmallSuitcase;
import suitcase.packagees.Suitcase;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Main {

//    Properties properties = new Properties();
//    private Object name;
//    FileInputStream fileInputStream = FileInputStream(name: "C:/Java Test/supreme-inventon/src/configs/config.properies");
//    properties.load(fileInputStream);
//    String username = properties.getProperty("username");
//    String password = properties.getProperty("password");

    public static void main(String[] args) throws IOException {

        try {
            //fileWriter();
            readFile();
        } catch (IOException e) {
            //Do nothing
        }
    }


//        Scanner scanner = new Scanner(System.in);
//
//        Suitcase[] suitcases = {
//                new SmallSuitcase("Пластик", "зеленый"),
//                new BigSuitcase("Ткань", "голубой")
//        };
//
//        System.out.println("Выберите чемодан:");
//        System.out.println("1 - Маленький чемодан");
//        System.out.println("2 - Большой чемодан");
//        System.out.print("Ваш выбор 1 или 2: ");
//
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            System.out.println("\n" + suitcases[0].getInfo());
//        } else if (choice == 2) {
//            System.out.println("\n" + suitcases[1].getInfo());
//        } else {
//            System.out.println("Неверный выбор! Выберите 1 или 2");
//        }
//
//    }
//        public static void fileWriter() throws IOException{
//            FileWriter file = new FileWriter("D:\\JavaFile.txt", true);
//            file.write(" Запись в файл, затем буду вызывать это из файла.");
//            file.close();
//        }
        public static void readFile() throws IOException{
            Scanner scanner = new Scanner(new File("D:\\JavaFile.txt"));
            ArrayList <String> fileContents = new ArrayList<>();
            while (scanner.hasNextLine()) {
                fileContents.add(scanner.nextLine());
            }
            scanner.close();
            fileContents.forEach(System.out::println);
        }
    }
