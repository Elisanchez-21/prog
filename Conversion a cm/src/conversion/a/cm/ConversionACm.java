  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion.a.cm;

import java.util.Scanner;

/**
 *
 * @author Eliezer Sanchez
 */
public class ConversionACm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double y, f, i, yc, fc, ic;
        Scanner tc= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Yardas: ");
        y=tc.nextDouble();
        
        System.out.println("Ingrese la cantidad de Pies: ");
        f=tc.nextDouble();
        
        System.out.println("Ingrese la cantidad de Pulgadas: ");
        i=tc.nextDouble();
        yc= y*91.44;
        fc=f*30.48;
        ic=i*2.54;
        System.out.println("Yardas a cm es igual a: "+yc);
                System.out.println("Pies a cm es igual a: "+fc);
        System.out.println("Pulgadas a cm es igual a: "+ic);

        
    }
    
}
