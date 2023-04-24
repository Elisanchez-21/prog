/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetro;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        double P, A, R;
        System.out.println("Ingrese el radio de la circunferencia: ");
        R= tc.nextDouble();
        P= Math.PI * 2 * R;
        A= Math.PI * Math.pow(R, 2);
        System.out.println("El area de la circunferencia es: "+A);
        System.out.println("El perimetro de la circunferencia es: "+P);


        
        
        
    }
    
}
