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
public class BusquedaLineal {
    
   public  int BuscarNombre(String[] nombres,String busqueda)
   {
       for (int i = 0; i < nombres.length; i++) {
           //Si es igual es el equals
           if(nombres[i].equals(busqueda))
           {
             return i;
           }
           
       }
     return -1;
   }
}
