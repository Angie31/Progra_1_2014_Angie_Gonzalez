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
public class Ejercicio3 {

    private String Al;
    private String Bus;
    // para buscar el numero de las letras en un texto, usted la elige
//    public String Encontrar() {
//        // Contador de ocurrencias 
//        String retornar = "";
//        if (getAl().contains(getBus())){
//            
//            retornar += " - " + (getBus().length());
//        }
//        return retornar;
//    }
    
    
    
    public String Buscar(String Busca,String texto)
    {
     String copia;  
     int posicion=texto.indexOf(Busca);
     
     if(posicion !=1)
     {
     copia=texto.substring(0,posicion)+ "-" + texto.substring(posicion);
     }else{
     copia = ("No fue encontrado la palabra " + Busca + "en el texto");
     }
     return copia;
    
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

    /**
     * @return the Bus
     */
    public String getBus() {
        return Bus;
    }

    /**
     * @param Bus the Bus to set
     */
    public void setBus(String Bus) {
        this.Bus = Bus;
    }

}
