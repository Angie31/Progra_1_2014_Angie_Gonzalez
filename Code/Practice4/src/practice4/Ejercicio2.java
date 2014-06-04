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
public class Ejercicio2 {
    
    private  String A;
    
  public String Palindromo()
 {
     
     String palabraAlrevez="";
     
    
    for (int i = getA().length() - 2; i >= 0; i--) 
    {
   
     
     palabraAlrevez+=getA().charAt(i);
        
    }
    return palabraAlrevez;
                
 
 }

    /**
     * @return the Al
     */
    public String getA() {
        return A;
    }

    /**
     * @param A the Al to set
     */
    public void setA(String A) {
        this.A = A;
    }
}
