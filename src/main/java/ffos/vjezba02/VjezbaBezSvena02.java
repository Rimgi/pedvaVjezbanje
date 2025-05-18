/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba02;

import java.util.Random;
import javax.swing.JOptionPane;
import java.io.Console;
import static java.lang.System.console;

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
        System.out.println("kreiraj niz mjesec gdje ces unijeti sve mjesece i koristeci for each ispisi sve mjesece");
      String mjesec [] = {"Sijecanj", "Veljaca", "Ozujak", "Travanj", "Svibanj", "Lipanj", "Srpanj", "Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac"};
      for (String i : mjesec){
          System.out.println(i);
      
      }
      /*2.⁠ ⁠zadatak:
     koristeci petlju ispisi sve brojeve od 1 do 20, kada dode do 12 neka ispise broj 12 preskocen
       */
        System.out.println("koristeci petlju ispisi sve brojeve od 1 do 20, kada dode do 12 neka ispise broj 12 preskocen");
      for (int i=1; i<=20; i++){
          if (i==12){ 
              continue;
               
          } 
          System.out.println(i);  
      }
        
        
      /*
      Ispisati Hello world 100 puta u istom retku odvojeno zarezom
      */
        System.out.println("Ispisati Hello world 100 puta u istom retku odvojeno zarezom");
        for (int i = 0; i < 100; i++) {
      
         if(i<99){
             System.out.print("Hello World, ");
            
         }else{
             System.out.print("Hello World");
         }
        }
        System.out.println("");    
        /*
         Ispisati sve parne brojeve od 3 do 99
         */  
        
        System.out.println(" Ispisati sve parne brojeve od 3 do 99");
        
            for (int i = 3; i > 2 && i < 99; i++) {
                
                if (i%2==0){
                    
                    System.out.println(i);
                }
                
            }
            
            
            /*
            Zbrojiti prvih 67 brojeva i ispisati zbroj
            */
           System.out.println(" Zbrojiti prvih 67 brojeva i ispisati zbroj"); 
           int zbroj= 0; 
           for (int i = 0; i < 68; i++) {
               
               zbroj += i;
                
            
        }
          System.out.println(zbroj); 
            
          
          
         System.out.println("");   
         /*
          Ispisati sve brojeve od 100 do 1 jedno ispod drugog s redom proreda
          */
        
        System.out.println(" Ispisati sve brojeve od 100 do 1 jedno ispod drugog s redom proreda"); 
         for (int i = 100; i > 0; i--) {
             System.out.println(i);
             System.out.println("");
        }
          
         /*
         Za tri primljena broja (npr. 3,7,4) ispisati najveći
         */
          
        System.out.println("Za tri primljena broja (npr. 3,7,4) ispisati najveći");   
    /* int i=   Integer.parseInt(JOptionPane.showInputDialog("Prvi broj"));
     int j=   Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
     int k=   Integer.parseInt(JOptionPane.showInputDialog("Treci broj"));
       
          if (i>j && i > k) {
              System.out.println(i);
        } else {
              if (j > i && j > k) {
                  System.out.println(j);
                  
              } else{
                  System.out.println(k);
              }
        }
        */
          
          
       /*
          Za primljeni broj (npr 15) provjeriti da li je Parni ili Neparni. Ako je parni ispisati Osijek. Ako je neparni ispisati Osijek 10 puta pokraj drugog
          */ 
        System.out.println("Za primljeni broj (npr 15) provjeriti da li je Parni ili Neparni. Ako je parni ispisati Osijek. Ako je neparni ispisati Osijek 10 puta pokraj drugog");
           
    /*    int broj = Integer.parseInt(JOptionPane.showInputDialog("Broj:"));
        if (broj%2==0) {
            System.out.println("Osijek");
        } else {
            for (int l = 0; l < 10; l++) {
                System.out.print("Osijek ");
            }
        }*/
        
        System.out.println("");
       
        /*
        Za uneseni tekst ocjene ispišite njezin ekvivalent u broju
        */
        System.out.println("Za uneseni tekst ocjene ispišite njezin ekvivalent u broju");
        
        String ocjena = JOptionPane.showInputDialog("ocjena:");
        int brojcanaOcjena;
        switch (ocjena) {
        
            case "nedovoljan": 
                brojcanaOcjena = 1;
                System.out.println(brojcanaOcjena);
                break;
            case "dovoljan": 
                brojcanaOcjena = 2;
                System.out.println(brojcanaOcjena);
                break;
            case "dobar": 
                brojcanaOcjena = 3;
                System.out.println(brojcanaOcjena);
                break;
            case "vrlo dobar": 
                brojcanaOcjena = 4;
                System.out.println(brojcanaOcjena);
                break;
            case "odlican": 
                brojcanaOcjena = 5;
                System.out.println(brojcanaOcjena);
                break;
            default: 
                System.out.println("nije valjana ocjena");
                break;
                
        }
        
        
      
        
        
          
        }
        
    }

