/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg7_distancia_punto;

/**
 *
 * @author Angie
 */
public class clsPunto {

    private double x;
    private double y;

    public clsPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public clsPunto() {
        double r;
       
        r= (int)(Math.random()*1000);
        this.x = r;
       r= (int)(Math.random()*1000);
        this.y = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(clsPunto p) {
        return (Math.sqrt((this.x - p.getX()) * (this.x - p.getX())
                + (this.y - p.getY()) * (this.y - p.getY())));
    }
    
 public double[] burbuja(double [] V)
 {
    double aux;
     for (int j = 0; j < V.length-1; j++) {
         for (int k = 0; k < V.length-j-1; k++)
             if(V[k+1]<V[k])
             {
              aux=V[k+1];
              V[k+1]=V[k];
              V[k]=aux;
              
             }
             
         }
     return V;
     }
 
 

}
