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
public class BusquedaBinaria {
    
    public  int BuscarNombre(String[] nombres,String busqueda)
    {
    int inicial=0;
    int elementosFinal=nombres.length-1;
    
    while (inicial<elementosFinal)
    {
     int central=(inicial+elementosFinal)/2;
     if(busqueda.compareTo(nombres[central])>0)
     {
       
     inicial=central+1;
     
     }
     else
     {
         if(busqueda.compareTo(nombres[central])<0)
         {
             elementosFinal=central-1;
         }
         else
         {
             return central;
         }
     
     }
     
}   
    return -1;
    }
}
