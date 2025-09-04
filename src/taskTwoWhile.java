import java.util.Scanner;

public class taskTwoWhile {
    public static void main (String[] arg){
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("exit")) {
                System.out.println("You've entered: " + userInput);
            }
        }
        System.out.println("You've entered: " + userInput);
    }

}
