/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package función_y;

/**
 *
 * @author Eliezer Sanchez
 */
public class Función_Y {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        double Y, X, A, B, C, n=0;
                X= 1d;
              A= 5*Math.pow(X, 4);
              B= 2*Math.pow(X, 3);
              C= 3*Math.pow(X, 2);
              Y= A + B+ C+ 7;
              X=n;
              n= Math.random();
              
              
              System.out.println("El valor de la función Y= 5X^4 + 2X^3 + 3X^2 + 7 siendo X=1 es:" +Y);
               A= 5*Math.pow(n, 4);
              B= 2*Math.pow(n, 3);
              C= 3*Math.pow(n, 2);
              Y= A + B+ C+ 7;
              System.out.println("El valor de la función Y= 5X^4 + 2X^3 + 3X^2 + 7 siendo X un numero cualquiera es:" +Y);
              
        
        
    }
    
}
