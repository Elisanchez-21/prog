/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosenox;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class CosenoX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        double a;
        
        try {
            System.out.print("Introduce un ángulo de (0...360°): ");
            a = tc.nextDouble();
            anguloCal(a);
        } catch (Exception e) {
            System.out.println("ERROR: Datos incorrectos.");
        }
    }
    static void anguloCal(double a){
        //Primer punto, pasa "a" a radianes.
        double b = Math.toRadians(a);
                System.out.println("Coseno de " + a + " es: " + Math.cos(b) );
        
    }
    
}
