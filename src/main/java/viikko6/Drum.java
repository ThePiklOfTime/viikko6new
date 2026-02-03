package viikko6;

public class Drum extends Instrument {
    
    public Drum(String manufacturer, int price) {
        super(manufacturer, price);
    }

    public void playBeat() {
        System.out.println(this.manufacturer + " rummut soittavat komppia!");
    }
}
