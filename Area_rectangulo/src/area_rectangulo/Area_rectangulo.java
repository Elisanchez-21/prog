/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_rectangulo;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Area_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner tc= new Scanner(System.in);
         float B, H, A;
         System.out.println("Ingrese la base del rectangulo: ");
         B =tc.nextFloat();
         System.out.println("Ingrese la altura del rectangulo: ");
         H =tc.nextFloat();
         
         A=B * H;
         System.out.println("La base del rectangulo es: "+B);
         System.out.println("La altura del rectangulo es: "+H);
         System.out.println("El area del rectangulo es: "+A);
         
         
         
    }
    
}
