/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
                
        Scanner oScanner=new Scanner(System.in);
        
        do{
        
            System.out.println("Digite la opcion que desea:");
            System.out.println("1.Ejercicio1");
            System.out.println("2.Ejercicio2");
            
            opcion=oScanner.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner=new Scanner(System.in);
                    Ejercicio1 E1=new Ejercicio1(oScanner.nextLine());
                    System.out.println(E1.ValidarCorreo());
                break;
                
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    oScanner=new Scanner(System.in);
                    Ejercicio2 E2=new Ejercicio2();
                    E2.setCadena(oScanner.nextLine());
                    System.out.println("La mitad de la palabra es= " + E2.MediaCadena());
                    System.out.println("El ultimo digito es = " + E2.ultimoValor());
                    System.out.println("Alrevez =" + E2.Alrevez());
                    System.out.println("Guion = " + E2.Guion());
                    System.out.println("Vocales = " + E2.Vocales());
                    System.out.println("Palindromo = " + E2.Palindromo());
                    
                break;
                   
                    
            
            }
            
        
        }while(opcion<=7);
        
        
        
        
    }
    
}
