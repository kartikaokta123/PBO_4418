/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package TugasTeori;

import java.util.ArrayList; 
public class tugasArrayList { 
    void ArrayList_add(ArrayList<Integer> data){
        for(int i = 0; i < 5; i++){
            data.add(i+1);
        }
    }
    
    void ArrayList_tampil(ArrayList<Integer> data){
      for(int i=0; i<5; i++){
        System.out.println(data.get(i));
      }
    }
    
    void ArrayList_edit(ArrayList<Integer> data, int index, int element){
        data.set(index, element);
    }
    
    void ArrayList_remove(ArrayList<Integer> data, int element){
        data.remove(element);
    }
    
    void cetak(){
        System.out.println("element");
    }  
}

