package Transport.Nazemnii;

import Transport.Obshestevennii;

public class Poezd extends NazemniiTransport implements Obshestevennii {
    public void peopleAvailable(){
        System.out.println("Poezd dostupen vsem");
    }
}
