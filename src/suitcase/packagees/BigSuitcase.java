package suitcase.packagees;

public class BigSuitcase extends Suitcase {
    public static double height = 70;
    public static double length = 35;
    public static double width = 20;

    public BigSuitcase(String material, String color) {
        super(material, color, height, length, width);
    }


    public String getInfo() {
        return "большой чемодан, " + super.getInfo();
    }
}