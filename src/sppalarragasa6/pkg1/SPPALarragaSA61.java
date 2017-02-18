/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppalarragasa6.pkg1;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class SPPALarragaSA61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb=new Scanner(System.in);
          
        int num = 0, op=0;

        while (num >= 0) {
            num = solicitarDatos();
            op = calcularSuma(num, op);
        }
    }

    public static int solicitarDatos() {

        System.out.println(" Ingresa el número:");
        Scanner kb = new Scanner(System.in);
        int numero;
        try{
        numero = kb.nextInt();
        }catch(Exception ex){
            System.out.println(" No es un número entero");
            return -1;
        }
        return numero;
    }

    public static int calcularSuma(int num, int op) {
        op = op + num;
        System.out.println(" Tu operación fue:"+ op);
        return op;
    }

}
        
      
      
             
        
    }
   
