package Transport.Nazemnii;

import Transport.Obshestevennii;

public class Bus extends NazemniiTransport implements Obshestevennii {
    public void peopleAvailable(){
        System.out.println("Bus dostupen vsem");
    }
}
