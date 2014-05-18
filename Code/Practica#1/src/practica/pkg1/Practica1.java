/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *Name:Class1                                                                                                                                    
 * Information:This is the first class
 * Date:09/05/2014 
 * Copyright 
 * author Angie
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //Practice#1
        
        //Declaracion de variables 
        //Declaration of variables
        //Practice#1
        
        System.out.println("Practice#1" + "\n" + "\n");
        
        int N=13;
        double A=20;
        char C='A';
       
        System.out.println("El valor de N es :" + (N) + "\n");
        System.out.println("El valor de A es :" + (A) + "\n");
        System.out.println("El valor de C es :" + (C) + "\n");
        System.out.println("La suma es :" + (N+A) + "\n");
        System.out.println("La resta es:" + (A-N) + "\n");
        System.out.println ("El valor de la letra es: " + Character.getNumericValue(C) + "\n" + "\n");
        
        
        
        //__________________________________________________________________________
        //Practice#2
        
        //Declaration of variables
        System.out.println("Practice#2" + "\n" + "\n");
        int Y=10;
        int X=20;
        double N1=8.12;
        double M=13.5;
         
        
        System.out.println("La suma de X y Y es " + (Y+X) + "\n");
        System.out.println("La resta de N1 y Y es " + (N1-Y) + "\n");
        System.out.println("La division de X y M es " + (X/M) + "\n");
        System.out.println("La multiplicacion de N1 y M es " + (N1*M) + "\n");
        System.out.println("El mod de M y Y es " + (M%Y) + "\n");
       
        
        //___________________________________________________________________________
        //Practice#3
        //Declaration of variables
        
        System.out.println("Practice#3" + "\n" + "\n");
        
        int N2=4;
        System.out.println("Resultado de ejercicio 3 es " + ((N2+77)-3)*2 + "\n" + "\n");
        
        //___________________________________________________________________________
        //Practice#4
        //Declaration of variables
        System.out.println("Practice#4" + "\n" + "\n");
        int A1=1;
        int B=2;
        int C1=3;
        int D=4;
        int B1=0;
        
        B1=B;
        System.out.println("B toma el valor de C1 = " + (B1=C1));
        System.out.println("C1 toma el valor de A1 = " + (C1=A1));
        System.out.println("A1 toma el valor de D = " + (A1=D));
        System.out.println("D toma el valor de B = " + (D=B) + "\n" + "\n"); 
        
        //____________________________________________________________________________
        //Practice#5
        //Declaration of variables
        System.out.println("Practice#5" + "\n" + "\n");
        int A2=5; 
       
        boolean parImpar;
        
        
        if(A2%2==0)
        {
            System.out.println("El numero es PAR" + "\n" + "\n");
        
        }
        else
        {
            System.out.println("El numero es IMPAR" + "\n" + "\n");
        }
        
     //_________________________________________________________________________________
    //Practice#6
        //Declaration of variables
        System.out.println("Practice#6" + "\n" + "\n");
        int B2 = -1;
      
        boolean P6;
        if(B2<0)
        {
          System.out.println("B2 es NEGATIVO" + "\n" + "\n");
      
        } else 
          
        {
          System.out.println("B2 es POSITIVO" + "\n" + "\n");
        }
      
    //___________________________________________________________________________________
   //Practice#7
        //Declaration of variables
        System.out.println("Practice#7" + "\n" + "\n");
        
        int C2=6;
      
        boolean P7;
      
        if((C2%2==0))
         {
          System.out.println("C2 es PAR" + "\n" );
        } else
        {
          System.out.println("C2 es IMPAR" + "\n" );
        }
        if(C2<0)
        {
            System.out.println("C2 es NEGATIVO" + "\n" );
        
        }
        else
        {
            System.out.println("C2 es POSITIVO" + "\n");
        }
        
        if(C2<=100)
        {
            System.out.println("C2 es Menor que 100" + "\n" );
        }
        else
        {
            System.out.println("C2 es mayor que 100" + "\n" );
        }
        
        if(C2%10==0)
        {
         System.out.println("Es multiplo de 10" + "\n" );
        }
        else
        {
         System.out.println("No es  multiplo de 10" + "\n" );
        }
        
        if(C2%5==0)
        {
         System.out.println("Es multiplo de 5" + "\n" );
        }
        else
        {
         System.out.println("No es multiplo de 5" + "\n");
        }
            
         
      
     }
}
