package practice4;


import sun.security.util.Length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angie
 */
public class Ejercicio6 {
    
   private  String M;
  
    
  ///Este metodo es para contar cuantas letras hay
public String valueOf () {

int Acum=0;
for(int i=0; i< getM().length(); i++)
{   
  if(getM().length()>i)
  {
    Acum++;
  }
}
return Integer.toString(Acum);
}

    /**
     * @return the M
     */
    public String getM() {
        return M;
    }

    /**
     * @param M the M to set
     */
    public void setM(String M) {
        this.M = M;
    }
}
 


    

