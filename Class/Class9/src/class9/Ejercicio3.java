/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author Angie
 */
public class Ejercicio3 {

    double[] salarios = new double[4];
    
 public  void Mañana(double salario)
    {
      
        for (int i = 0; i <salarios.length; i++) {
            
            if(salarios[i]==0)
            {
              salarios[i]=salario;
              break;
            }
        }
    
    }
    
    public double Suma()
    {
        double SumaSalarios=0;
        
        
        for (int i = 0; i < salarios.length; i++) {
            
            SumaSalarios+=salarios[i];
        }
     
        return SumaSalarios;
    }

}
