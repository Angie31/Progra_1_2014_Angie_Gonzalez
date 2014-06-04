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
public class Ejercicio8 {
    
  private String  cadena;
  private int Desde;
  private int Hasta;
  
public String subString()
    {
        String res="";
        for (int i = getDesde(); i <= getHasta(); i++) 
        {
           res+=getCadena().charAt(i);
        }
        return res;
    }

 
     
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the Desde
     */
    public int getDesde() {
        return Desde;
    }

    /**
     * @param Desde the Desde to set
     */
    public void setDesde(int Desde) {
        this.Desde = Desde;
    }

    /**
     * @return the Hasta
     */
    public int getHasta() {
        return Hasta;
    }

    /**
     * @param Hasta the Hasta to set
     */
    public void setHasta(int Hasta) {
        this.Hasta = Hasta;
    }

}
