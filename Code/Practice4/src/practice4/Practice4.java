/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice4;


import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion=0;
        int cadena;
        String texto;
        String palabra;
        String texto1;
        String palabra1;
        String texto2;
        int i=0;
        String palabra2;
        String palabra3;
        int inicio;
        String inicio1;
        int Final;
        int desde;
        int hasta;
        
        Scanner teclado=new Scanner(System.in);
        
        
       
        do
        {
            System.out.println("Digite la opcion que desea:");
            System.out.println("1.Ejercicio1");
            System.out.println("2.Ejercicio2");
            System.out.println("3.Ejercicio3");
            System.out.println("4.Ejercicio4");
            System.out.println("5.Ejercicio5");
            System.out.println("6.Ejercicio6");
            System.out.println("7.Ejercicio7");
            System.out.println("8.Ejercicio8");
            
            opcion=teclado.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Digite la cadena a evaluar");
                    teclado=new Scanner(System.in);
                    Ejercicio1 E1=new Ejercicio1();
                    E1.setAl(teclado.nextLine());
                    System.out.println("La rotación es = " + E1.Rota());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    teclado=new Scanner(System.in);
                    Ejercicio2 E2=new Ejercicio2();
                    E2.setA(teclado.nextLine());
                    System.out.println("El Palindromo es = " + E2.getA() + E2.Palindromo());
                    break;
               case 3:
                    System.out.println("Digite un pequeño texto");
                    teclado=new Scanner(System.in);
                    Ejercicio3 E3=new Ejercicio3();
                    texto=(teclado.nextLine());
                    System.out.println("Digite la palabra que quieres buscar");
                    teclado=new Scanner(System.in);
                    palabra=(teclado.nextLine());
                    System.out.println("Quedaria con un guion la palabra buscada: " + E3.Buscar(palabra, texto) );
                    break;
                   
               case 4:
                    System.out.println("Digite un pequeño texto");
                    teclado=new Scanner(System.in);
                    Ejercicio4 E4=new Ejercicio4();
                    texto1=(teclado.nextLine());
                    System.out.println("Digite la palabra que quieres buscar");
                    teclado=new Scanner(System.in);
                    palabra1=(teclado.nextLine());
                    System.out.println("De esa palabra hay: " + E4.ocurrencia(texto1, palabra1) );
                    break;
               case 5:
                    System.out.println("Escriba un texto para convertilo todo en mayuscula");
                    teclado=new Scanner(System.in);
                    Ejercicio5 E5=new Ejercicio5();
                    texto2=(teclado.nextLine());
                    System.out.println("Convertirlo todo en mayuscula= " + E5.toUpperCase(texto2));
                    break;
               case 6:
                  
                    teclado=new Scanner(System.in);
                    Ejercicio6 E6=new Ejercicio6();
                    System.out.println("Digite un pequeño texto");
                    E6.setM(teclado.nextLine());
                    System.out.println("Obtengo el valor = " + E6.valueOf()); 
                    break;
                   
               case 7:
                    System.out.println("Digite una Oracion");
                    teclado=new Scanner(System.in);
                    Ejercicio7 E7=new Ejercicio7();
                    palabra2=(teclado.nextLine());
                    System.out.println("Digite una palabra si quieres saber si esta en la oracion y en que posicion");
                    teclado=new Scanner(System.in);
                    palabra3=(teclado.nextLine());
                    System.out.println("Datos " + E7.indexOf(palabra2, palabra3) );
                   break;
               case 8:
                    System.out.println("Digite un texto" + "\n");
                    teclado=new Scanner(System.in);
                    Ejercicio8 E8 = new Ejercicio8();                     
                    E8.setCadena(teclado.nextLine());
                    System.out.println("Digite desde donde desea ver el texto en numeros"+ "\n");
                    desde=Integer.parseInt(teclado.nextLine());                    
                    E8.setDesde(desde);
                    System.out.println("Digite hasta donde desea ver el texto en numeros"+ "\n");
                    hasta=Integer.parseInt(teclado.nextLine());                   
                    E8.setHasta(hasta);
                    System.out.println(E8.subString() + "\n");
                    
                   break;
                   
            
            }
        
        
        }while(opcion<=7);
                
    }
    
}
