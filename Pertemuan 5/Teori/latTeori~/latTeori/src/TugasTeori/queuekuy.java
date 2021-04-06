/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package TugasTeori;
import java.util.Queue;
public class queuekuy extends tugasArrayList{
    static void queue_add(Queue<Integer> q){
        for(int i = 0; i < 5; i++){
            q.add(i);
        }
    }
    
    static void queue_peek(Queue<Integer> q){
        Integer element = q.peek();
        System.out.println("queue peek : " + element);
    }
    
    void cetak(){
        super.cetak();
        System.out.println("Queue");
    }
    
    void queue_remove(Queue<Integer> q, int element){
        q.remove(element);
    }
    
}
