/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grados;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double f, c;
        Scanner tc= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Grados Farenheit: ");
        f=tc.nextDouble();
        c= (f-32) * 5/9;
        
        System.out.println("La cantidad de grados Celsius es: "+c);
        
        
        
    }
    
}
