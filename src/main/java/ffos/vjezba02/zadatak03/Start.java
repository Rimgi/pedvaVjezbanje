/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba02.zadatak03;

/**
 *
 * @author Tamara
 */
public class Start {
    public static void main(String[] args) {
        Macka m1 = new Macka();
        Pas p1 = new Pas();
                
        m1.setIme("Micka");
        m1.setAbsorbedSouls(396);
        m1.setBoja("crna");
        m1.setDob(12);
        m1.setModniUkus("nepogresan");
        m1.setPasmina("Norveska sumska macka");
        m1.setSpol('Z');
        
        p1.setBoja("crno-bijela");
        p1.setDob(8);
        p1.setIme("Fifi");
        p1.setPasmina("Border collie");
        p1.setPrehrana("sve sto se nade");
        p1.setSpol('M');
        p1.setVoliVlasnika("nimalo");
        
        System.out.println("Maca " + m1.getIme() + " je " + m1.getBoja() + " i ima " + m1.getDob() + " godina. Modni ukus joj je " + m1.getModniUkus() + ", a do sada je uspjesno apsorbirala " + m1.getAbsorbedSouls() + " nevinih dusa. Iz toga se da naslutiti da je " + m1.getSpol() + "enskog spola." + " Pripadnica je popularne pasmine - " + m1.getPasmina() + ". Maca " + m1.getIme() + " ima susjeda - Pesu" + p1.getIme() + "ja, cija je boja " + p1.getBoja() + ". Jede " + p1.getPrehrana() + ", a svog vlasnika voli - " + p1.getVoliVlasnika() + ". Ima " + p1.getDob() + " godina, " + p1.getSpol() + "uskog je spola, a po zanimanju je " + p1.getPasmina() + "." );
       
             
        
        
    }
    
}
