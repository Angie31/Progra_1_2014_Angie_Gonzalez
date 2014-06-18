/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice5;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class Practice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     
        boolean validar = true;
        char continuar;
        int opcion = 0;
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite una opción");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");

            opcion = teclado1.nextInt();

            switch (opcion) {
                
                case 1:
                    
                    Ejercicio1 E1 = new Ejercicio1();
                    E1.NumerosDigitados();
                    E1.Sumar();
                    E1.Mayores36();
                    E1.Mayores50();
                    
                case 2:

                    Ejercicio2 E2 = new Ejercicio2();
                    E2.numerosEnteros();
                    E2.sumaDeNumeros();
                    
                case 3:

                    Ejercicio3 E3 = new Ejercicio3();
                    E3.notasCursos();
                    E3.SumaPromedios();

                case 4:
                    
                    Ejercicio4 E4 = new Ejercicio4();
                    E4.digitarNumero();
                    E4.orden();
                default:
                    break;

            }

            System.out.println("Desea continuar con otra operación S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    
    }
    
}
