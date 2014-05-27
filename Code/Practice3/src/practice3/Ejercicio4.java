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
public class Ejercicio4 {
    //Class Attributes
    private int num;

   
    public int Meses(int num1) {

        int num;
        if ((num1 == 1) || (num1 == 3) || (num1 == 5) || (num1 == 7) || (num1 == 8) || (num1 == 10) || (num1 == 12)) {
            num = 31;
        } else if ((num1 == 4) || (num1 == 6) || (num1 == 9) || (num1 == 11)) {
            num = 30;
        } else {
            num = 28;
        }
        return num;

    }
}
