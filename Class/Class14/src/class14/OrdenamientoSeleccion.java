/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author estudiante
 */
public class OrdenamientoSeleccion {
    
    public int [] ordenS(int arreglo[], String ordenamineto)
    {
        int indice=0;
        int indice2=0;
        int menor=0;
        int posicion=0;
        int temporal=0;
        
        for (indice= 0; indice < arreglo.length-1; indice++) {
            menor=arreglo[indice];
            posicion=indice;
            for (indice2 = indice+1; indice2 < arreglo.length; indice2++) {
                if(arreglo[indice2]<menor)
                {
                    menor=arreglo[indice2];
                    posicion=indice2;
                }
            }
            if(posicion!=indice)
            {
                temporal=arreglo[indice];
                arreglo[indice]=arreglo[posicion];
                arreglo[posicion]=temporal;
            }
        }
        return (arreglo);
    }
}
