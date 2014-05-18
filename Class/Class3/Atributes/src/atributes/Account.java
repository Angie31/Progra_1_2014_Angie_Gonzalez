/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributes;

/**
 *
 * @author Angie
 */
public class Account {
    //Variables
    private  double saldoInicial;
    private boolean hayError;
    //Metodo constructor 
    public Account()
    {
       saldoInicial=0;
       hayError=false;
    }
    //Este método sirve para aumentar la cuenta de un usuario 
    //Monto= Parametro para recibir el nuevo monto 
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    //Este método sirve para disminuir la cuenta de un usuario 
    //Monto= Parámetro para recibir el nuevo monto 
    public void Retiro(double monto)
    {
       if(getSaldoInicial()>=monto)
        setSaldoInicial(getSaldoInicial() - monto);
       else
           setHayError(true);
    }

 
    //Metodo set 
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }
    
    
    
}
