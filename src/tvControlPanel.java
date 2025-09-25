import java.util.Scanner;

public class tvControlPanel {
    public static void main(String[] args){
        arays();
    }
    public static void arays() {
        int [] numbersChanel = {1, 2, 3, 4, 5, 6, 7, 8,9};
        String [] namesOfChanel = {"Ont", "Bt", "NTV", "PPTV", "ORT", "BOTV", "ERTV", "ITV", "OPWERTV"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Выбери канал: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Телек выключается");
                break;
            }

            for (int i=0; i < numbersChanel.length; i++) {
                if (numbersChanel[i] == choice) {
                    System.out.println("Ваш канад - " +namesOfChanel[i]);
                    break;
                }
            }

        }
    }
}
