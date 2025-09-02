import java.util.Scanner;
public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();

        if (num > 10) {
            System.out.println("Число больше десяти");
        } else {
            System.out.println("Число меньше десяти");
        }
    }
}