package viikko6;

public class StringInstrument extends Instrument {
    int numberOfStrings;
    
    public StringInstrument(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }

    public void tune() {
        System.out.println(this.manufacturer + " soittimesta viritettiin " + this.numberOfStrings + " kieltä.");
    }
}
