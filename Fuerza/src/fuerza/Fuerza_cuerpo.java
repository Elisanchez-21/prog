/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuerza;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Fuerza_cuerpo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        
        double F, M, A;
        System.out.println("Ingrese el valor de la Masa: ");
        M= tc.nextDouble();
        
        System.out.println("Ingrese el valor de la Aceleración: ");
        A= tc.nextDouble();
        
        F= M * A;
        
        System.out.println("El valor de la Fuerza del cuerpo: "+F);
        
                
        
        
    }
    
}
