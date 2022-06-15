package Transport.Nazemnii;

import Transport.Parovoi;

public class Parovoz extends NazemniiTransport implements Parovoi {
    public void parAble(){
        System.out.println("Parovoz rabotaet na paru.");
    }
    public void peopleAvailable(){
        System.out.println("Parovoz dostupen vsem.");
    }
}
