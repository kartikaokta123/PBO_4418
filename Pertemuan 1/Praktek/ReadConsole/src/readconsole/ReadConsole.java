/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package readconsole;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

    public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }  // TODO code application logic here   
}
