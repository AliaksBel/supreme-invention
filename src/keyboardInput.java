import java.util.Scanner;

public class keyboardInput {
    public static void main(String[] args)  {
        Scanner userInputScanner = new Scanner(System.in); // вызов сканера
        System.out.println("Введите текст"); // выводит текст пользователю
        String userInput = userInputScanner.nextLine(); // пользователь вводит значение
        String forEqualsText = "Иной текст";
        String forEqualsIgnoreText = "пока не понятно что это 4";
        String cityName = "Борисов";
        String streetName = "Ленина";
        String houseNumber = "35";

        System.out.println("Моя первая строка: \"" + userInput + "\""); // просто вывод
        System.out.println("Моя первая строка: \"" + userInput.toLowerCase() + "\""); //нижнйи регистр
        System.out.println("Моя первая строка: \"" + userInput.toUpperCase() + "\""); // верхний регистр
        System.out.println("Моя первая строка: \"" + userInput.isEmpty() + "\""); // булева, вернет false, потомучто строка заполнена
        System.out.println("Интересно изменить текст: \"" + userInput.charAt(5) + "\""); // выведет 5 символ, отсчет начинается с 0
        //System.out.println("Интересно изменить текст: \"" + userInput.equals(forEqualsText) + "\""); // должно быть false, потому что тексты не совпадут. Разобрался)))
        System.out.println("Предоставьте ваши билетики: \"" + userInput.equalsIgnoreCase(forEqualsIgnoreText) + "\""); //выдает false, но пока не понимаю почему
        System.out.println("Интересно изменить текст: \"" + userInput.startsWith("Что") + "\"");
        System.out.println("Интересно изменить текст: \"" + userInput.endsWith("ая") + "\"");
        System.out.println("Интересно изменить текст: \"" + userInput.contains("велосипед") + "\"");
        System.out.println("Интересно изменить текст: \"" + userInput.replace("а","ГРОМ") + "\""); // в этих четырех все понятно
        System.out.println("Мой адрес:" + cityName + ", улица " +streetName+", дом" +houseNumber);


        }
    }
