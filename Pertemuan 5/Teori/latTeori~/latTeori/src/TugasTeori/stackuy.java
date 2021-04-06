/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package TugasTeori;

import java.util.Stack;

class stackuy extends tugasArrayList{   
    void stack_push(Stack<Integer> s){
        for(int i = 0; i < 5; i++){
            s.push(i);
        }
    }

    void stack_pop(Stack<Integer> s){
        System.out.println("Pop :");
  
        for(int i = 0; i < 5; i++){
            Integer y = s.pop();
            System.out.println(y);
        }
    }
    
    void cetak(){        
        System.out.println("Stack");
        super.cetak();
    }
    
    void stack_tampil(Stack<Integer> s){
      for(int i=0; i<5; i++){
        System.out.println(s.get(i));
      }
    }
    
    void stack_remove(Stack<Integer> s, int element){
        s.remove(element);
    }
    
    void stack_edit(Stack<Integer> s, int index, int element){
        s.set(index, element);
    }
    
    void stack_peek(Stack<Integer> s){
        Integer element = s.peek();
        System.out.println("stack peek : " + element);
    }
}
