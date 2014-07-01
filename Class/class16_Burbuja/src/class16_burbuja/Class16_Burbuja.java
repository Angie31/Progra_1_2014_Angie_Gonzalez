/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class16_burbuja;

/**
 *
 * @author Angie
 */
public class Class16_Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []arreglo={56,4,85,85,42};
        int []arregloOrdenado;
        
        OrdenamientoBurbuja OS=new OrdenamientoBurbuja();
        arregloOrdenado=OS.OrdenamientoB(arreglo,"A");
        System.out.println("Ordenamiento Burbuja");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
        
    }
    
}
