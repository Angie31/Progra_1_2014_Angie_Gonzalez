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
public class Ejercicio3 {
    
    private Scanner teclado;
    private int[] cursoA;
    private int[] cursoB;

    public void notasCursos() {

        teclado = new Scanner(System.in);
        cursoA = new int[5];
        cursoB = new int[5];

        System.out.println( "\n" +   "Notas del curso A" + "\n"  );

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite las notas de los estudiantes del curso A: ");
            cursoA[i] = teclado.nextInt();
        }
        System.out.println("    Notas del curso B    ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite las notas de los estudiantes del curso B: ");
            cursoB[i] = teclado.nextInt();
        }
    }

    public void SumaPromedios() {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < 5; i++) {
            suma1 = suma1 + cursoA[i];
            suma2 = suma2 + cursoB[i];
        }

        int promedioa = suma1 / 5;
        int promediob = suma2 / 5;
        if (promedioa > promediob) {
            System.out.println("El curso A tiene un promedio mayor, que es igual a: " + promedioa);
        } else {
            System.out.println("El curso B tiene un promedio mayor, que es igual a: " + promediob);
        }
    }
}
