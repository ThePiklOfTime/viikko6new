package viikko6;

public class Instrument {
    String manufacturer;
    int price;

    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }
    public String getDetails() {
        return "Valmistaja: " + this.manufacturer + ", Hinta: " + this.price + "e";
    }
}
