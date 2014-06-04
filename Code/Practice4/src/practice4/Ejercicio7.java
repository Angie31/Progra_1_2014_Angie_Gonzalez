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
public class Ejercicio7 {
    
    public String indexOf(String palabra1,String palabra2)
    {
     String resp="";
      int posi=palabra1.indexOf(palabra2);
      if(posi==-1)
      {
       resp=(palabra2 + " No esta contenido en : " + palabra1);
      }
      else
      {
       resp=( palabra2 + " esta contenia en  "  + palabra1 + " a partir de la  aposicion  " + posi);
      }
      return resp;
    }
    
}
