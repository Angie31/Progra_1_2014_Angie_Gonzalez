/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.pkg7_distancia_punto;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class Practice7_Distancia_Punto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantPuntos;
        int distancia=0;
        clsPunto vectorPuntos[];
        clsPunto puntoUsuario=null;
        clsPunto puntoUsuario2=null;
        double vectorDistancias[];
     
        
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite la cantidad de puntos que desea");
        cantPuntos = teclado.nextInt();
       
        
        //vectorPuntos = new clsPunto[cantPuntos];
        vectorDistancias = new double[cantPuntos];
        
        for (int i = 0; i < cantPuntos; i++) {
            
           puntoUsuario = new clsPunto();
           puntoUsuario2 = new clsPunto();
           vectorDistancias[i]=puntoUsuario.distancia(puntoUsuario2);
           //vectorPuntos[i]=puntoUsuario; 
            
        }

        vectorDistancias=puntoUsuario.burbuja(vectorDistancias);
        for (int i = 0; i < vectorDistancias.length; i++) {
            System.out.println(vectorDistancias[i]);
        }
        
        
        System.out.println("La mayor distacia es = " + vectorDistancias[vectorDistancias.length-1]);
        
        
       
        
    }
    
}
