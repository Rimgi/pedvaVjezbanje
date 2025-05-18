/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liste.vjezbanje;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Start {
    
    private List<Adresar> adresari;
    
    public Start(){
        adresari = new ArrayList<>();
        napuniTestnePodatke();
        Pomocno.ulaz = new Scanner(System.in);
        ucitajAdresare();
        Pomocno.ulaz.close();
    }
    
    private void napuniTestnePodatke(){
    
        adresari.add(new Adresar("Filip","Mudri","+3859863627","Bracka","136"));
        Faker faker = new Faker();
        for (int i = 2; i <= 121; i++) {
            adresari.add(new Adresar(faker.name().firstName(),faker.name().lastName(),faker.phoneNumber().cellPhone(),faker.address().streetName(),faker.address().buildingNumber()));
        }
        for (Adresar adresar : adresari) {
            System.out.println(adresar);
            
        }
        
    }
    
    public static void main(String[] args) {
        new Start();
        
    }
    
    private void ucitajAdresar(){
        Adresar adresar = new Adresar();
        adresar.setIme(Pomocno.ucitajString("Unesi ime"));
        adresar.setPrezime(Pomocno.ucitajString("Unesi prezime"));
        adresar.setBrojTelefona(Pomocno.ucitajString("Unesi broj telefona"));
        adresar.setUlica(Pomocno.ucitajString("Unesi naziv ulice"));
        adresar.setKucniBroj(Pomocno.ucitajString("Unesi kucni broj"));
        adresari.add(adresar);
    
    }
    
    private void ucitajAdresare(){
        do {            
            ucitajAdresar();
        } while (!Pomocno.ucitajBoolean("Prekid unosa"));
    
    }
    
    
    
    
}
