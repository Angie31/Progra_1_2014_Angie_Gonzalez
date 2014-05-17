/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg2;

import java.util.Scanner;

/**
 *Name:Practice#2                                                                                                                                    
 * Information:This is the second practice
 * Date:17/05/2014 
 * Copyright 
 * @author Angie
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(" ************Ejercicio 1***********");
        
       //Declaracion de variables 
        int num;
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Digite un numero");
        num=Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i < num; i++) 
        {
            System.out.print("*");  
        }
        //_______________________________________________________________________________________
        System.out.println("\n");
        System.out.println("*********Ejercio2*********");
        //Declaracion de variables  
        int n ; 
        int y ;
        
        System.out.println("Digite un numero");
        n=Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite otro numero para remplazarlo con * ");
        y=Integer.parseInt(teclado.nextLine());
        
        System.out.println("\n");
        
        for (int i = 1; i <=n; i++) 
        {
            if((i%y)==0)
            {
                System.out.println("*");
                
            }
            else
            {
                System.out.println(i);
            }
            
        }
        //_______________________________________________________________________________________
        System.out.println("\n");
        System.out.println("*********Ejercio3*********");
        //Declaracion de variables 
        double valorInicial;
        double valorFinal;
        double incremento;
        
        System.out.println("Digite el valor inicial");
        valorInicial=Double.parseDouble(teclado.nextLine());
        
        System.out.println("Digite el valor Final");
        valorFinal=Double.parseDouble(teclado.nextLine());
        
        System.out.println("Digite el incremento deseado");
        incremento=Double.parseDouble(teclado.nextLine());
        
        System.out.println("\n");
        for (double i = valorInicial; incremento < valorFinal ; i++)
            
        {
            incremento=incremento+valorInicial;
            System.out.println(incremento);
        }
        
       //_______________________________________________________________________________________ 
        //System.out.println("*********Ejercio4*********");
        //int cont1;
        //int cont2;
        
        //System.out.println("Serie de pavon");
        //_______________________________________________________________________________________
        System.out.println("\n");
        System.out.println("***********Ejecicio 5************");
        
        //Declaracion de variables 
        int num1;
        double numerodecimal;
        
        System.out.println("Digite un numero decimal");
        numerodecimal=Double.parseDouble(teclado.nextLine());
        System.out.println("Digite un numero a elevar");
        num1=Integer.parseInt(teclado.nextLine());
       
        
        double acum=numerodecimal;
        for (double i =1; i<num1; i++) 
        {
            
            acum=acum*numerodecimal;
           
        }
        System.out.println("\n");
        System.out.println(acum);
         
       //_______________________________________________________________________________________  
       System.out.println("\n");
       System.out.println("***********Ejecicio 6************");
       
        for (int i = 11111; i < 99999; i++) 
        {
           System.out.println(i);   
        }
       //_______________________________________________________________________________________ 
       System.out.println("\n");
       System.out.println("***********Ejecicio 7************");
       
       //Declaracion de variables 
       int N;
       int contPar=0;
       int contImpar=0;
       
       
       System.out.println("Digite un numero para sacar los PARES e IMPARES");
       N=Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= N; i++) 
        {
            if(i%2==0)
            {
                contPar=contPar+1;
          
            }
            else
            { 
               contImpar=contImpar +1;
            }
           
              
        }
          System.out.println("Pares" + " = "  + contPar);
          System.out.println("Impares"  + " = " + contImpar );
        
        
       
       
       //_______________________________________________________________________________________ 
       System.out.println("\n");
       System.out.println("***********Ejecicio 8************");
       System.out.println("***********For************");
       //Declaracion de variables 
       int N1;
       int acum2=0;
       int cont=0;
       
        System.out.println("Digite un numero para desplegar la tabla de multiplicar ");
        N1=Integer.parseInt(teclado.nextLine());
        
        for (int i = 1; i <= 10; i++) 
        {
            acum2=N1*i;
            System.out.println(N1 + "*" + i + "=" + acum2);
        }
        
       System.out.println("\n");
       System.out.println("***********While************");
        //Declaracion de variables 
        int N2;
        int acum3=0;
        cont=0;
        System.out.println("Digite un numero para desplegar la tabla de multiplicar");
        
        N2=Integer.parseInt(teclado.nextLine());
        
        while(cont<=10)
        {
            acum3=N2*cont;
            System.out.println(N2 + "*" + cont + "=" + acum3);
            cont++;
        }
          
       System.out.println("\n");
       System.out.println("*********** Do While************");
       
        //Declaracion de variables 
        int N3;
        int acum4;
        cont=0;
        System.out.println("Digite un numero para desplegar la tabla de multiplicar");
        N3=Integer.parseInt(teclado.nextLine());
        
        do
        {
            acum4=N3*cont;
            System.out.println(N3 + "*" + cont + "=" + acum4);
            cont++;
        } while(cont<=10);
        
       //_______________________________________________________________________________________
       System.out.println("\n");
       System.out.println("***********Ejecicio 9************");
        
       //Declaracion de variables 
       int cont3=0;
       double suma=0;
       double prome=0;
       while(cont3<10)
       {   
           int Num;
           System.out.println("Digite un numero");
           Num=Integer.parseInt(teclado.nextLine());
           
           
            cont3++;
            suma=suma+Num;
       }
            prome=suma/cont3;
            System.out.println("El promedio es = " + prome);
            
       //_______________________________________________________________________________________     
       System.out.println("\n");
       System.out.println("***********Ejecicio 10************");
       
       //Declaracion de variables     
       int cont4=0;
       double suma1=0;
       double prome1=0;
      
       do{ 
           
           int Num1;
           System.out.println("Digite un numero");
           Num1=Integer.parseInt(teclado.nextLine());
           
           if(Num1>0)
           {
            cont4++;
            suma1=suma1+Num1;
           
           }
           else
           {
            prome1=suma1/cont4;
            System.out.println("El promedio es = " + prome1);
            cont4=Num1;
            
           }
           
         }  while((cont4<10) &&(cont4>0));
           
             
       
       
       //_______________________________________________________________________________________
       System.out.println("\n");
       System.out.println("***********Ejecicio 11************");
       
       //Declaracion de variables 
       int contDolar=0;
       int acumDolar=0;
       do{
           contDolar++;
           acumDolar= contDolar*560;
           System.out.println("La conversión del dolar al colón es = " + acumDolar);
           
           
       
         }while(contDolar<10);
       //_______________________________________________________________________________________ 
       System.out.println("\n");
       System.out.println("***********Ejecicio 12************");
       
        //Declaracion de variables 
        double invierte=1000;
       
        for (int contMes =1; contMes <=12; contMes++) 
        {
           invierte=(invierte*0.02)+invierte;
                   
        }
        System.out.println("En un año tendra " + (invierte));
       //_______________________________________________________________________________________ 
       System.out.println("\n");
       System.out.println("***********Ejecicio 13************");
       
        for (int h = 0; h<=23; h++) 
            for (int m = 0; m<= 59; m++) 
                for (int s = 0; s <= 59; s++) 
                    
                System.out.println(h + ":" + m + ":" + s);
       //_______________________________________________________________________________________  
       System.out.println("\n");
       System.out.println("***********Ejecicio 14************");
       
       
        //Declaracion de variables 
        double invierte1=1000;
        double continvierte1=0;
        
        while(invierte1<1500)
        {
          if(invierte1<=1500)
          {
           continvierte1=continvierte1+1;
           invierte1=(invierte1*0.02)+invierte1;
          }
       
        }
         System.out.println("En " +continvierte1 + " meses " + " va a tener mas de $1500");
       //_______________________________________________________________________________________   
       System.out.println("\n");
       System.out.println("***********Ejecicio 15************");
      
       //Declaracion de variables 
       int contfila1=1;
       int contfila2=1;
       
       while(contfila1<=5)
       { 
           
           if(contfila2<=contfila1)
               
           {
                System.out.print(contfila2);
                contfila2=contfila2 + 2;
           }
           else
           {   
               contfila2=1;
               System.out.println("\n");
               contfila1=contfila1 + 2;
               
           }
          
       
       }
    }
             
}
        
  
  





