/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba02;

/**
 *
 * @author Tamara
 */
public class Start {
    public static void main(String[] args) {
       /* Osoba o1 = new Osoba();
        o1.setIme("Tamara");
        o1.setPrezime("Orihovac");
        o1.setDob(26);
        o1.setOib("15907763256");
        o1.setSpol('Z');
        
        System.out.println(o1.getIme() + " " + o1.getPrezime() + ", dob: " + o1.getDob() + ", spol: " + o1.getSpol() + ", OIB:" + o1.getOib() );
        
        Osoba o2 = new Osoba();
        o2.setIme("Swen");
        o2.setPrezime("Krofnica");
        o2.setDob(23);
        o2.setOib("nema jer je jos fetus");
        o2.setSpol('M');
    
        System.out.println(o2.getIme() + " " + o2.getPrezime() + ", dob: " + o2.getDob() + ", spol: " + o2.getSpol() + ", OIB:" + o2.getOib() ); */
    
        
        Osoba o = new Osoba("Sven", "Krofna", "2142471451726", 23, 'M');
        System.out.println(o.getIme() + " " + o.getPrezime() + " " + o.getOib() + " " + o.getDob() + " " + o.getSpol());
        
        
        
        
    }
    
    
}
