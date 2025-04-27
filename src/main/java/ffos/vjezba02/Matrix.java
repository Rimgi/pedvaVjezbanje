/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba02;

import java.util.Random;

/**
 *
 * @author Tamara
 */
public class Matrix {

    public static void main(String[] args) {
        Random random = new Random();

        for (;;) {
            int rand = 9999;
            while (true) {
                rand = random.nextInt(1000000);
                if (rand > 9999 && rand < 1000000) {
                    break;
                }
            }
            int rand2 = 9999;
            while (true) {
                rand2 = random.nextInt(1000000);
                if (rand2 > 9999 && rand2 < 1000000) {
                    break;
                }
            }
            
            int rand3 = 9999;
            while (true) {
                rand3 = random.nextInt(1000000);
                if (rand3 > 9999 && rand3 < 1000000) {
                    break;
                }
            }
            int rand4 = 9999;
            while (true) {
                rand4 = random.nextInt(1000000);
                if (rand4 > 9999 && rand4 < 1000000) {
                    break;
                }
            }
            int matrix1 = rand++;
            int matrix2 = rand2++;
            int matrix3 = rand3++;
            int matrix4 = rand4++;
  
            System.out.println(matrix1 + " " + matrix2 + " " + matrix3 + " " + matrix4 + " " + matrix1 + " " + matrix2 + " " + matrix3 + " " + matrix4 + " " + matrix1 + " " + matrix2 + " " + matrix3 + " " + matrix4 + " " + matrix1 + " " + matrix2 + " " + matrix3 + " " + matrix4);
        }
 
    }
}
