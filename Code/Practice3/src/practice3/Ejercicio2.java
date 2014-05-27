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
public class Ejercicio2 {
    //Class Attributes
    private int num;
    
   //Method construtor and  termination
    public int terminaciones(int num)
    {
        int R=num;
        int res=0;
        R=num%10;
        if((R==2)||(R==5)||(R==8))
          {
              res=num*num;
          }  
        else
        {
            if((R==4)||(R==7)||(R==9))
            {
             res=num*5;
            }
            else
            {
             res=num;
            }
          
        }return res;
     
    }
    
    
    
    
}
