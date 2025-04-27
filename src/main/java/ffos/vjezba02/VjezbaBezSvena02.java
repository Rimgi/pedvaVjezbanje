/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba02;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tamara
 */
public class VjezbaBezSvena02 {

    public static void main(String[] args) {
        //prosjek ocjena
        int ocjene[] = {1, 2, 3, 4, 5};
        int rezultat = 0;

        for (int i : ocjene) {
            
            rezultat = rezultat + i;
        }
        int prosjek = rezultat / ocjene.length;
        System.out.println(prosjek);
        
        
        /*ispis
        
         System.out.println(
        Integer.parseInt(JOptionPane.showInputDialog("Dužina")) * 
                Integer.parseInt(JOptionPane.showInputDialog("Širina"))
        );
        */

      /*Zadatak 1:
        kreiraj niz mjesec gdje ces unijeti sve mjesece i koristeci for each ispisi sve mjesece
        */
      
      String mjesec [] = {"Sijecanj", "Veljaca", "Ozujak", "Travanj", "Svibanj", "Lipanj", "Srpanj", "Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac"};
      for (String i : mjesec){
          System.out.println(i);
      
      }
      /*2.⁠ ⁠zadatak:
     koristeci petlju ispisi sve brojeve od 1 do 20, kada dode do 12 neka ispise broj 12 preskocen
       */
      
      for (int i=1; i<=20; i++){
          if (i==12){ 
              continue;
               
          } 
          System.out.println(i);  
      }
        
        
      /*
      Ispisati Hello world 100 puta u istom retku odvojeno zarezom
      */
        for (int i = 0; i < 100; i++) {
      
         if(i<99){
             System.out.print("Hello World, ");
            
         }else{
             System.out.print("Hello World");
         }
        }
            
        /*
         Ispisati sve parne brojeve od 3 do 99
         */  
        System.out.println("");
            for (int i = 3; i > 2 && i < 99; i++) {
                
                if (i%2==0){
                    
                    System.out.println(i);
                }
                
            }
            
            
            /*
            Zbrojiti prvih 67 brojeva i ispisati zbroj
            */
           int zbroj= 0; 
           for (int i = 0; i < 68; i++) {
               
               zbroj += i;
                
            
        }
          System.out.println(zbroj); 
            
            
            
        }

               
            
            
        
      
        
    }

