/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class16_busquedabinaria;

/**
 *
 * @author Angie
 */
public class Class16_BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String []arreglo={"Maria","Efren","Sussana","Campbell","Agustin","Elias"};
        
        BusquedaLineal b1=new BusquedaLineal();
        System.out.println("La busqueda lineal es " +  b1.BuscarNombre(arreglo, "Efren"));
        
        System.out.println();
        
          
        String []arreglo2={"Campbell","Agustin","Sussana","Elias","Efren","Maria"};
        
         BusquedaBinaria bb=new BusquedaBinaria();
         System.out.println("La busqueda binaria es " +  bb.BuscarNombre(arreglo2, "Campbell"));
         System.out.println();
    }
    
}
