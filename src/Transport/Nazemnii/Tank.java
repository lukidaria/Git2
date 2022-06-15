package Transport.Nazemnii;

import Transport.Voennii;

public class Tank extends NazemniiTransport implements Voennii {

    public void militaryAvailable(){
        System.out.println("Tank dostupen tolko voennim");
    }

    public static void main(String[] args) {
        Tank t1=new Tank();
        t1.militaryAvailable();


    }
}
