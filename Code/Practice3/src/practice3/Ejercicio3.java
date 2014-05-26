/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice3;

/**
 *
 * @author Angie
 */
public class Ejercicio3 {
   //Class Attributes
   private String L;
   ////Method construtor and report message.
    public String Letras(char L1) {
        String R="";
        
        if (L1 == 'A') {
            R=("Excelente");
        } else if (L1 == 'B') {
            R=("Bueno");
        } else if (L1 == 'C') {
            R=("Regular");
        } else if (L1 == 'D') {
            R=("Malo");
        } else if (L1 == 'E') {
            R=("Pésimo");
        }   
        return R;
    }
}

