/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package television2;

public class TestTelevision2 {
    public static void main(String[] args) {
        Television2 tv1 = new Television2();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        Television2 tv2 = new Television2();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " +  tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " +  tv2.volumeLevel);
        
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        Television2 tvku = new Television2();
        man1.beliTV(tvku);
        
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
        
        

    }
}
