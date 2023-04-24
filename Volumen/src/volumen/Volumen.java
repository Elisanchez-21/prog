/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumen;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Volumen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        
        double r, h, v;
        System.out.println("Ingrese el radio del cilindro: ");
        r= tc.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        h= tc.nextDouble();
        
        v=Math.PI * r * r * h;
        System.out.println("El volumen de la circunferencia es: "+v);
        
        
        
        
        
        
        
    }
    
}
