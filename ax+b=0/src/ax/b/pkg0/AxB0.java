/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ax.b.pkg0;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class AxB0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        int res;
        
        double x;
        Scanner tc= new Scanner(System.in);
         do{
             System.out.println("ax + b = 0");
             System.out.println("Ingrese el valor de a");
a= tc.nextInt();
             System.out.println("Ingrese el valor de b");
             b=tc.nextInt();
             

if (a == 0){
    System.out.println("El valor de a no puede ser 0");
}else{
    x = (-1.0*b) /a;
    System.out.println(a+"x + "+b+" = 0");
    System.out.println("\t x -> "+x);
}
             System.out.println("Quieres iniciar de nuevo");
             System.out.println("1 - si");
             System.out.println("2 - No");
             System.out.println("Ingrese una opcion");
             res=tc.nextInt();
             System.out.println("\n\n");
             
         }while(res!=2);
         
         


    
    
}

        }

         
        
        
        
        
        
        

    

