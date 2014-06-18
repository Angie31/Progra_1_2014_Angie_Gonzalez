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
public class Ejercicio1 {
    
      private Scanner teclado;
    private int[] valores;

    public void NumerosDigitados() {
        teclado = new Scanner(System.in);
        valores = new int[8];
        for (int i = 0; i < 8; i++) 
        {
            System.out.print("Digite un numero: ");
            valores[i] = teclado.nextInt();
        }
    }

    public void Sumar() {
        int suma = 0;
        for (int i = 0; i < 8; i++)
        {
            suma = suma + valores[i];
        }
        System.out.println("La suma de los 8 es: " + suma);
    }

    public void Mayores36() {
        int suma = 0;
        for (int i = 0; i < 8; i++) 
        {
            if (valores[i] > 36) {
                suma = suma + valores[i];
            }
        }
        System.out.println("Mayores a 36 hay  : " + suma);
    }

    public void Mayores50() {
        int cantidadNumeros = 0;
        for (int i = 0; i < 8; i++)
        {
            if (valores[i] > 50) {
                cantidadNumeros++;
            }
        }
        System.out.println("La cantidad de numeros mayores que 50 son: " + cantidadNumeros);
    }
    
 }


