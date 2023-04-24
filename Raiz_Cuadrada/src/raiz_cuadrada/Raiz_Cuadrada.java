/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raiz_cuadrada;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Raiz_Cuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner tc= new Scanner(System.in);
    double n;
        System.out.println("Ingrese el numero a evaluar: ");
        n= tc.nextDouble();
        double resultado = Math.sqrt(n);
        
        System.out.println("La raiz cuadrada de " + n + " es " + resultado);
    

    
    
    }
    
}
