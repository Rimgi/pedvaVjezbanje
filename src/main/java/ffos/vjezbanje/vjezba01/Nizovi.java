/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbanje.vjezba01;

/**
 *
 * @author Tamara
 */
public class Nizovi {
    public static void main(String[] args) {
        String ulice [] = {"Bracka", "Vukovarska", "Drinska", "Svaciceva", "Opatijska"};
        ulice [1] = "Zupanska";
        for (int i = 0; i < 10; i++) {
            System.out.println(i);  
        }
        
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(1+i);  
        }
        
        for (int i = 0; i < ulice.length; i++) {
            System.out.println(ulice[i]);
        }
               
    }
    
}
