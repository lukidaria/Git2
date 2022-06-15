package Transport.Vozdushnii;

import Transport.Obshestevennii;

public class Samolet extends VozdushniiTransport implements Obshestevennii {
    public void peopleAvailable(){
        System.out.println("Samolet dostupen vsem");
    }
}
