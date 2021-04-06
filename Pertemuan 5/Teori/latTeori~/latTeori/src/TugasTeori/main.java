/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeori;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class main {
    public static void main (String[] args){
        tugasArrayList a = new tugasArrayList();
        ArrayList<Integer> data = new ArrayList<>(); 
        a.cetak();
        a.ArrayList_add(data);
        a.ArrayList_tampil(data);
        System.out.println("Menghapus element menjadi: ");
        a.ArrayList_remove(data, 2);    
        System.out.println(data);
        System.out.println("Setelah diedit: ");
        a.ArrayList_edit(data, 0, 3); 
        System.out.println(data); 
        System.out.println("==== ArrayList ====="); 
        
        stackuy yuk = new stackuy();
        Stack<Integer> s = new Stack<>();
        yuk.cetak();
        yuk.stack_push(s);
        yuk.stack_tampil(s);
        System.out.println("Menghapus element menjadi: ");
        yuk.stack_remove(s, 4);
        System.out.println(s);
        System.out.println("Setelah diedit: ");
        yuk.stack_edit(s, 2, 5);
        System.out.println(s);        
//        yuk.stack_peek(s);
//        yuk.stack_pop(s);
//        System.out.println(s);
        System.out.println("==== Stack ====="); 
        
        queuekuy uy = new queuekuy();        
        Queue<Integer> q = new LinkedList<>();
        uy.cetak();
        queuekuy.queue_add(q);
        System.out.println(q);
        System.out.println("Menghapus element menjadi: ");
        uy.queue_remove(q, 2);
        System.out.println(q);
        queuekuy.queue_peek(q);
        System.out.println(q);
        System.out.println("==== Queue ====="); 
    }
}
