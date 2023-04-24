/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_triangulo;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class Area_Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tc= new Scanner(System.in);
        double lado1, lado2, lado3, A, P, S;
        
        System.out.println("Ingrese el primer lado del triangulo: ");
        lado1=tc.nextDouble();
                System.out.println("Ingrese el segundo lado del triangulo: ");
        lado2=tc.nextDouble();
                System.out.println("Ingrese el segundo lado del triangulo: ");
        lado3=tc.nextDouble();
        
        P= lado1 + lado2 + lado3;
        S = (lado1 + lado2 + lado3) / 2;
        A= Math.sqrt(S * (S - lado1) * (S- lado2) * (S - lado3));
        
        System.out.println("area: "+A);
       
        

        
    }
    
}
