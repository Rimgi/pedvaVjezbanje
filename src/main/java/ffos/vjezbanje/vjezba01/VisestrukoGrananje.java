/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbanje.vjezba01;

/**
 *
 * @author Tamara
 */
public class VisestrukoGrananje {
    public static void main(String[] args) {
        int i = 9;
        switch (i) {
            case 1: 
                System.out.println("Sijecanj");
                break;
            case 2:
                System.out.println("Macke se tjeraju");
                break;
            case 3:
                System.out.println("Ozujak");
                break;
            default:
                System.out.println("Ostalo");
                break;
        }
        
        String s="Vukovar";
        switch (s) {
            case "Osijek":
                System.out.println("Grad na Dravi");
                break;
            case "Vukovar":
                System.out.println("Grad s vodotornjem");
                break;
            default:
                System.out.println("Ostalo");
                break;
                // Zašto nam treba break?
            
                    
        }
        
      
               
    }
    
}
