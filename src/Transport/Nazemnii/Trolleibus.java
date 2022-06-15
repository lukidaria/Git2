package Transport.Nazemnii;

import Transport.Obshestevennii;

public class Trolleibus extends NazemniiTransport implements Obshestevennii {

    public void peopleAvailable(){
        System.out.println("Trolleibus dostupen vsem");
    }
}
