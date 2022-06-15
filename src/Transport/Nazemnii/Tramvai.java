package Transport.Nazemnii;

import Transport.Obshestevennii;

public class Tramvai extends NazemniiTransport implements Obshestevennii {
    public void peopleAvailable(){
        System.out.println("Tramvai dostupen vsem lyudyam");
    }
}
