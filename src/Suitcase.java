public class Suitcase {
    String material;
    String content;
    String color;
    double volume;
    double height;
    double length;
    double width;
    double contentVolume;


    public void fillSuitcase(String things, double thingsVolume) {
        content = things;
        contentVolume = thingsVolume;

    }

    public void emptySuitcase() {

    }

    public String getInfo() {
        String contentInfo = getSuitcaseContentInfo();
        String infoString = String.format("Материал чемодана: %s\nЦвет чемодана: %s\n%s\nОбъем в литрах %f",
                material, color, contentInfo,volume);
        return infoString;

    }

    public String getSuitcaseContentInfo() {
        return String.format("Content type: %s\nContent volume %s", content, contentVolume);

    }

    public void setSuitCasseDimensions(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
        this.volume = (height * length * width) / 1000;
        System.out.println(volume);
    }

}
