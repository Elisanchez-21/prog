/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kg_lbs;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Kg_Lbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversión de Kilogramos a Libras");
        Scanner tc= new Scanner(System.in);
               
        double KG, K, L;
        KG= 2.20462262;
              
        System.out.println("Ingrese la cantidad de Kilogramos a convertir: ");
        K=tc.nextDouble();
        
        L= K * KG;
        System.out.println("La cantidad de libras es: "+L);
        
        
        
    }
    
}
