/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice3;

import java.util.Random;

/**
 *
 * @author Angie
 */
public class Ejercicio5 {
  // Class Attributes  
  private int N;
  private int n,d,c,m,u;
  
 
 public int  Aleatorio()
 {
     int N=0;
      Random rnd = new Random();
      for (int i = 0; i < 3000; i++) {
            N = (int)(rnd.nextDouble() * 3000.0);
             N=N%3000+1;
        }return N;
    
}


 }
