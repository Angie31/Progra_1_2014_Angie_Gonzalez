/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Angie
 */
public class Class9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        double Salario;
        double Salario1;
       
       
        Scanner teclado=new Scanner(System.in);
        
        do{
            System.out.println("Digite la opcion del ejercio a evaluar");
            System.out.println("1.Ejercicio1");
            System.out.println("2.Ejercicio2");
            System.out.println("3.Ejercicio3");
            System.out.print("4.Salir");
            opcion=teclado.nextInt();
          
            switch(opcion)
            {
                case 1:
                    Ejercicio1 E1=new Ejercicio1();
                    
                    for (int i = 0; i < 5; i++) {
                        teclado=new Scanner(System.in);
                        System.out.print("Digite el salario del trabajador = " + (i+1) );
                        E1.AgregarSalario(teclado.nextDouble());
                        
                    }
                    
                    System.out.print(E1.ImprimirSueldos());
                    break;
                case 2:
                    Ejercicio2 E2=new Ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado=new Scanner(System.in);
                        System.out.print("Digite la altura de la persona #  " + (i+1) + "\n" );
                        E2.AgregarAltura(teclado.nextFloat());
                    }
                    
                    System.out.println("El promedio es " + E2.Promedio());
                    System.out.println (E2.ContarPersonas());
                    break;
                    
                case 3:
                        Ejercicio3 E3=new Ejercicio3();
                        teclado=new Scanner(System.in);
                        
                         System.out.println("Seleccione el turno");
                         System.out.println("1.Turno de Mañana");
                         System.out.println("2.Turno de Noche");
                         System.out.println("3.Salir");
                         opcion=teclado.nextInt();
                        
                        switch(opcion){
                            
                            case 1:
                                 for (int i = 0; i < 4; i++) {
                                 System.out.println("Digite el salario");
                                 Salario1=(teclado.nextInt());
                                 System.out.println("SALARIOS = "  + Salario1);
                                 
                                 }
                                System.out.println("La suma del Turno de la mañana  es = $" + E3.Suma());
                                 
                    
                                break;
                            case 2:
                                    for (int i = 0; i < 4; i++) {
                                 System.out.println("Digite el salario");
                                 Salario1=(teclado.nextInt());
                                 System.out.println("SALARIOS = "  + Salario1);
                                 
                                 }
                                System.out.println("La suma del TURNO de tarde es = $" + E3.Suma());
                               break;
                                
                            case 4:
                                  System.exit(0);
                                break;
                                
                               
                        }
                        
                        
                   default:
                       
                   break;
                    
                       
                    }
                    
           
        }while(opcion<5);
    }
    
}
