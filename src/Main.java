import suitcase.packagees.BigSuitcase;
import suitcase.packagees.SmallSuitcase;
import suitcase.packagees.MainSuitcase;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        SmallSuitcase smallBag = new SmallSuitcase();
        SmallSuitcase.backpack();

        BigSuitcase largeBag = new BigSuitcase();
        BigSuitcase.backpackInHand();

    }

}