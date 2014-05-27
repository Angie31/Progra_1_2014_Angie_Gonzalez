/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice3;

import java.util.Scanner;
import java.util.Random;

/**
 *Name:Practice#3                                                                                                                                    
 * Information:This is the third practice
 * Date:25/05/2014 
 * Copyright 
 * @author Angie
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables 
        int N;
        int N1;
        char L;
        int año,num1;
        int D,M,A;
        int Di,Me,An;
        int u,d,c,m,n;
        char  dia1;
        int Dis;
        int E=0;
        boolean validar=true;
        char continuar;
        int opcion;
        
        
        
        //Instances
        Random rnd = new Random();
        Scanner teclado=new Scanner(System.in);
        Ejercicio1 E1=new Ejercicio1();
        Ejercicio2 E2=new Ejercicio2();
        Ejercicio3 E3=new Ejercicio3();
        Ejercicio4 E4=new Ejercicio4();
        Ejercicio5 E5=new Ejercicio5();
      
        
        do{
            
           System.out.println("Digite una opcion :");
           System.out.println("1.Ejercicio 1");
           System.out.println("2.Ejercicio 2");
           System.out.println("3.Ejercicio 3");
           System.out.println("4.Ejercicio 4");
           System.out.println("5.Ejercicio 5");
           System.out.println("6.Ejercicio 6");
           System.out.println("7.Ejercicio 7");
           System.out.println("8.Ejercicio 8");
           
           opcion=Integer.parseInt(teclado.nextLine());
           
           switch(opcion)
           {
               case 1: 
                   System.out.println("Digite un numero de 1 al 12:");
                   N=Integer.parseInt(teclado.nextLine());
                   if(N==1)
                   {System.out.println("El numero de ese mes es " + E1.mes1(N));
                   }
                   if(N==2)
                   {System.out.println("El numero de ese mes es " + E1.mes2(N));
                   }
                   if(N==3)
                   {System.out.println("El numero de ese mes es " + E1.mes3(N));
                   }
                   if(N==4)
                   {System.out.println("El numero de ese mes es " + E1.mes4(N));
                   }
                   if(N==5)
                   {System.out.println("El numero de ese mes es " + E1.mes5(N));
                   }
                   if(N==6)
                   {System.out.println("El numero de ese mes es " + E1.mes6(N));
                   }
                   if(N==7)
                   {System.out.println("El numero de ese mes es " + E1.mes7(N));
                   }
                   if(N==8)
                   {System.out.println("El numero de ese mes es " + E1.mes8(N));
                   }
                   if(N==9)
                   {System.out.println("El numero de ese mes es " + E1.mes9(N));
                   }
                   if(N==10)
                   {System.out.println("El numero de ese mes es " + E1.mes10(N));
                   }
                   if(N==11)
                   {System.out.println("El numero de ese mes es " + E1.mes11(N));
                   }
                   if(N==12)
                   {System.out.println("El numero de ese mes es " + E1.mes12(N));
                   }
                   break;
               
               case 2:
                   System.out.println("Digite un numero");
                   System.out.println("Si este termina en 2,5 u 8 se hace al cuadrado del número,"+ "\n"
                                     +"si este termina en 4,7 o 9 el numero se multiplicara por 5" + "\n" 
                                     +"Si no termina en ningunos de esos digitos se reportara el mismo numero");
                   N1=Integer.parseInt(teclado.nextLine());
                   System.out.println("El numero es = " + E2.terminaciones(N1) );
                   break;
           
               case 3:
                   System.out.println("Digite una letra de la A a la E");
                   //Para poder escribir letras
                   L=(teclado.nextLine().charAt(0));
                   System.out.println("El reporte es " + E3.Letras(L));
                   break;
               case 4:
                  
                   System.out.println("Digite un mes");
                   num1=Integer.parseInt(teclado.nextLine());
                   System.out.println("Digite el año");
                   año=Integer.parseInt(teclado.nextLine());
                   System.out.println("Tiene " + E4.Meses(num1) + " dias en ese mes en el año " + año );
                   break;
                   
               case 5:
                  
                   n=E5.Aleatorio();
                   System.out.println("El numero aleatorio es " + n);
                   
                   
                   u=n%10; 
                   n=n/10;
                   d=n%10;
                   n=n/10;
                   c=n%10;
                   n=n/10;
                   m=n%10;
                   
                       switch(m)
                   {
                       case 1:
                           System.out.print("M" );
                           break;
                       case 2:
                           System.out.print("MM");
                           break;
                       case 3:
                           System.out.print("MMM" );
                           break;
                   }
                   switch (c) {
                       case 1:
                           System.out.print("C");
                           break;
                       case 2:
                           System.out.print("CC " );
                           break;
                       case 3:
                           System.out.print("CCC");
                           break;
                       case 4:
                           System.out.print("CD");
                           break;
                       case 5:
                           System.out.print("D");
                           break;
                       case 6:
                           System.out.print("DC" );
                           break;
                       case 7:
                           System.out.print("DCC" );
                           break;
                       case 8:
                           System.out.print("DCCC" );
                           break;
                       case 9:
                           System.out.print("CM");
                           break;
                   }
                   switch (d) {
                       case 1:
                           System.out.print("X");
                           break;
                       case 2:
                           System.out.print("XX");
                           break;
                       case 3:
                           System.out.print("XXX");
                           break;
                       case 4:
                           System.out.print("XL");
                           break;
                           
                       case 5:
                           System.out.print("L");
                           break;
                       case 6:
                           System.out.print("LX");
                           break;
                       case 7:
                           System.out.print("LXX");
                           break;
                       case 8:
                           System.out.print("LXXX");
                           break;
                       case 9:
                           System.out.print("XC");
                           break;
                   }
 
                   switch (u) {
                       case 1:
                           System.out.print("I");
                           break;
                       case 2:
                           System.out.print("II");
                           break;
                       case 3:
                           System.out.print("III");
                           break;
                       case 4:
                           System.out.print("IV");
                           break;
                       case 5:
                           System.out.print("V" );
                           break;
                       case 6:
                           System.out.print("VI");
                           break;
                       case 7:
                           System.out.print("VII");
                           break;
                       case 8:
                           System.out.print("VIII");
                           break;
                       case 9:
                           System.out.print("IX");
                           break;
                   }

                   break;
               case 6:
                   
                   System.out.print("Digite un dia :");
                   D=Integer.parseInt(teclado.nextLine());
                   System.out.print("Digite un mes :");
                   M=Integer.parseInt(teclado.nextLine());
                   System.out.print("Digite un año :");
                   A=Integer.parseInt(teclado.nextLine());
                   
                   
                   E=D;
                   if((E<=31)&&(E>1)){E=E-1; System.out.print(E + "/"+ M + "/");}
                   else if((D==1)&& (M==5)||(M==7)||(M==8)||((M==10)|| (M == 12))){D=31; M=M-1;System.out.print(D + "/" + M + "/");}
                   else if((D==1)&&(M == 4) || (M == 6) || (M == 9) || (M == 11)){D=30;  M=M-1;System.out.print(D + "/" +  M + "/");}
                   else if((D==1)&&(M==2)){ D=31; M=M-1; System.out.print(D + "/" + M + "/");}
                   else if((D==1)&&(M==3)){ D=28; M=M-1; System.out.print(D + "/"+ M + "/");}
                   else if((D==1)&&(M==1)){ D=31; M=12;System.out.print(D + "/" + M + "/");} 
                   
                   
                   if((M==1)&&(D==1)){ M=12; System.out.print( M + "/"); }
                  
                   
                   
                   if(M==12){  A=A-1;System.out.print(A + "\n");}
                   else{System.out.print(A + "\n"); };
                   
                   break;
                   
               case 7:
                   System.out.print("Digite un dia :");
                   Di=Integer.parseInt(teclado.nextLine());
                   Di=Di%7;
                   switch(Di)
                   {
                       case 0:
                           System.out.println("Domingo");break;
                       case 1:
                           System.out.println("Lunes");break;
                       case 2:
                           System.out.println("Martes");break;
                       case 3:
                           System.out.println("Miercoles"); break;
                       case 4:
                           System.out.println("Jueves");break;
                       case 5:
                           System.out.println("Viernes");break;
                       case 6:
                           System.out.println("Sabado");break;
                   }
                  break;
             case 8:
                 
                 System.out.println("Digite el dia de la semana,el dia 1 que fue del mes actual"
                                  + "(Lunes,Martes,Miercoles,Jueves,Viernes,Sabado o Domingo)");
                 dia1=teclado.nextLine().charAt(0);
                 System.out.println("Digite el dia de hoy en numeros");
                 Dis=Integer.parseInt(teclado.nextLine());
                 Dis=Dis%7;
                 
                 switch(Dis)
                 {
                       case 0:
                           System.out.println("Domingo");break;
                       case 1:
                           System.out.println("Lunes");break;
                       case 2:
                           System.out.println("Martes");break;
                       case 3:
                           System.out.println("Miercoles"); break;
                       case 4:
                           System.out.println("Jueves");break;
                       case 5:
                           System.out.println("Viernes");break;
                       case 6:
                           System.out.println("Sabado");break;
                 
                 }
                 
              break;
                   
                   
                   
               default:
                   System.err.println("Esa opcion no existe");
                   
           }
       
                
                   
           
            System.out.println("\n");
            System.out.println("Desea continuar con otra operacion S/N");
            continuar=teclado.nextLine().charAt(0);
            if((continuar =='S')||(continuar=='s'))
            {
               validar=true;
            }
            else
            {
              validar=false;        
            }
        
        
          
          }while(validar);
    }
    


    
}
