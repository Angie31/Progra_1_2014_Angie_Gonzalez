/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class19_pilas_colas;

/**
 *
 * @author Angie
 */
public class Class19_Pilas_Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila oPila=new Pila();
        Cola oCola=new Cola();
        oPila.Push("Efren");
        oPila.Push("Joss");
        oPila.Push("Andrey");
        oPila.Push("Jose");
        
        oPila.Imprimir();
        System.out.println("La cantidad de elementos es " + oPila.Cantidad());
        if(!oPila.Vacia())
            System.out.println("La pila no esta vacia");
        else
            System.out.println("La pila esta vacia");
            oPila.Pop();
            oPila.Pop();
            oPila.Imprimir();
        
    }
    
}
