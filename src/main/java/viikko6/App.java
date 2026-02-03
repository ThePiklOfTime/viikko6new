package viikko6;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        ArrayList<Instrument> instruments = new ArrayList<>();
    
        while (!exit) {
            System.out.println("1) Lisää soitin \n2) Listaa soittimet\n3) Viritä kielisoittimet\n4) Soita rumpuja\n0) Lopeta ohjelma");
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
                
            switch (i) {
                case 1:
                    System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                    if(scanner.hasNext()){
                        int j = Integer.parseInt(scanner.nextLine());
                        System.out.println("Anna valmistajan nimi:");
                        String manufacturer = scanner.nextLine();
                        System.out.println("Anna hinta euroina:");
                        int price = Integer.parseInt(scanner.nextLine());

                        Instrument newInstrument = null;
                        switch (j) {
                            case 1:
                                newInstrument = new Guitar(manufacturer, price);
                                break;
                            case 2:
                                newInstrument = new Violin(manufacturer, price);
                                break;
                            case 3:
                                newInstrument = new Drum(manufacturer, price);
                                break;
                            default:
                                System.out.println("Syöte oli väärä");
                                break;
                        }
                        if (newInstrument != null) {
                            instruments.add(newInstrument);
                            System.out.println("Soitin lisätty listaan");
                        }
                    }       
                    break;
                case 2:
                    if (instruments.isEmpty())  {
                        System.out.println("Soittimia ei ole lisätty.");
                        break;
                    } 
                    for (Instrument instrument : instruments) {
                        System.out.println(instrument.getDetails());
                    }
                    break;
                case 3:
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof StringInstrument) {
                            StringInstrument stringInstrument = (StringInstrument) instrument;
                            stringInstrument.tune();
                        }
                    }
                    break;
                case 4:
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof Drum) {
                            Drum drum = (Drum) instrument;
                            drum.playBeat();
                        }
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
            }
        }
        System.out.println("Kiitos ohjelman käytöstä.");
        scanner.close();
    }
}
