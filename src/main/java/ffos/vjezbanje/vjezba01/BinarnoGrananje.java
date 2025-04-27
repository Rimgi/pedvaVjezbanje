/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbanje.vjezba01;

/**
 *
 * @author Tamara
 */
public class BinarnoGrananje {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Ima li 7 patuljaka?");
        if (i == 7) {
            System.out.println("Ima 7 patuljaka.");
            
        } else {
            System.out.println("Nema 7 patuljaka, ima " + i + " patuljaka.");
        }
        
        int j = 9;
        if (j == 10 && i == 5) {
            System.out.println("Ima 10 jabuka i 5 patuljaka");
            
        } else {
            System.out.println("Nema dovoljno jabuka.");
        }
    }
         
    
}
