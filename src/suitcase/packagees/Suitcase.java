package suitcase.packagees;
//принцип инкапсуляции, конструктор
public abstract class Suitcase {
    protected String material;
    protected String color;
    protected double height;
    protected double length;
    protected double width;
    protected double volume;

    public Suitcase(String material, String color, double height, double length, double width) {
        this.material = material;
        this.color = color;
        this.height = height;
        this.length = length;
        this.width = width;
        this.volume = calculateVolume();
    }

    protected double calculateVolume() {
        return (height * length * width) / 1000;
    }

    public String getInfo() {
        return String.format("Материал: %s\nЦвет: %s\nРазмеры: %.1f - %.1f - %.1f\nОбъем: %.1f",
                material, color, height, length, width, volume);
    }

}

