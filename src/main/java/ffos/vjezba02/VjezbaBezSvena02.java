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
        
        
    }
}
