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
public class Ejercicio1 {

    private String Al;

    public String Rota() {

        String retorno = "";
        for (int i = getAl().length() - 1; i >= 0; i--) {

            retorno += getAl().charAt(i);

        }
        return retorno;
    }
    
    public String Palindromo()
 {
     
     String palabraAlrevez="";
     
    
    for (int i = getAl().length()-2; i >= 0; i=i--) 
    {
     
     palabraAlrevez+=getAl().charAt(i);
        
    }
    return palabraAlrevez;
                
 
 }
    
   


    /**
     * @return the Al
     */
    public String getAl() {
        return Al;
    }

    /**
     * @param Al the Al to set
     */
    public void setAl(String Al) {
        this.Al = Al;
    }

}
