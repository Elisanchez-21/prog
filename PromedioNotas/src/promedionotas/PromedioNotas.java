/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedionotas;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double acum = 1; 
         double notas=0;
         Scanner tc= new Scanner(System.in);
         System.out.println("Ingrese la cantidad de notas a evaluar: ");
        double cn= tc.nextDouble();
        
        while(acum <= cn) {
        System.out.println("Ingrese la nota numero: "+acum);
        double n=tc.nextDouble();
        notas += n;
        acum++;}
        
double promedio = notas/cn;
        System.out.println("El promedio es: "+promedio);

    }
    
    
   
    
}
