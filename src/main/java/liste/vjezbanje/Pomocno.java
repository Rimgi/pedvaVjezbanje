/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liste.vjezbanje;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
class Pomocno {

    static Scanner ulaz;

    static String ucitajString(String poruka) {
        String s;
        while(true){
            System.out.println(poruka);
            s = ulaz.nextLine();
            if (s.trim().isEmpty()){
                System.out.println("Ovo je obavezan unos");
            } 
            return s;
        }
    }

    static boolean ucitajBoolean(String poruka) {
        System.out.println(poruka);
        return ulaz.nextLine().toLowerCase().trim().equals("da");
    }
    
}
