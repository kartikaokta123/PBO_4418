/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package television2;

public class Television2 {
   int channel;
   int volumeLevel;
   boolean on = false;
   
   Television2 () {
       channel = 1;
       volumeLevel = 1;
   }
   
   public void turnOn() {
       on = true;
   }
   
   public void turnOff() {
       on = false;
   }
   
   public void setChannel(int newChannel) {
    channel = newChannel;
   }
   
   public void setVolume(int newVolumeLevel) {
      volumeLevel = newVolumeLevel;
   }
   
   public void channelUp() {
       channel = ++channel;
   }
   
   public void channelDown() {
       channel = --channel;
   }
    
   public void volumeUp() {
       volumeLevel = ++volumeLevel;
   }
   
   public void volumeDown() {
       volumeLevel = --volumeLevel;
   }
    
}
