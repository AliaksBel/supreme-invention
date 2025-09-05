public class Suitcase {
    String material;
    String content;
    String color;
    double perimeter;
    double volume;
    double height;
    double length;
    double width;
    double contentVolume;

   /* public Suitcase (double width, double length, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }*/

    public void fillSuitcase(String things, double thingsVolume) {
        content = things;
        contentVolume = thingsVolume;

    }

    public void emptySuitcase() {

    }

    public String getInfo() {
        String contentInfo = getSuitcaseContentInfo();
        String infoString = String.format("Материал чемодана: %s\nЦвет чемодана: %s\n%s", material, color, contentInfo);
        return infoString;

    }

    public String getSuitcaseContentInfo() {
        return String.format("Content type: %s\nContent volume %s", content, contentVolume);

    }

}
