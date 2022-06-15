package Transport.Vodnii;

import Transport.Obshestevennii;
import Transport.Parovoi;

public class Parohod extends VodniiTransport implements Parovoi, Obshestevennii {
   public void parAble(){
        System.out.println("Parohod rabotaet na paru.");
    }

    public void peopleAvailable(){
        System.out.println("Parohod dostupen vsem.");
    }
}
