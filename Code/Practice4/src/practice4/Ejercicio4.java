/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice4;

/**
 *
 * @author Angie
 */
public class Ejercicio4 {
    
    private String texto;
    private String busca;
    
    public int ocurrencia (String texto, String busca)
    {
        int acum2 = 0;
        int veces = 0;
        int acum=1;
        int posicion = 0;
        
        while ( posicion != -1)
        {
            posicion = texto.indexOf(busca, posicion + 1);
            
            if (posicion != -1)
            {
                veces= veces + 1;
                acum=1;
                acum2 = acum + veces;
            }
        }
            return acum2;
    }
}
