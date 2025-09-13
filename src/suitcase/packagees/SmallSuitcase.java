package suitcase.packagees;

public class SmallSuitcase extends Suitcase {
    public static double height = 30;
    public static double length = 25;
    public static double width = 15;

    public SmallSuitcase(String material, String color) {
        super(material, color, height, length, width);
    }

    @Override
    public String getInfo() {
        return "маленький чемодан " + super.getInfo();
    }
}

