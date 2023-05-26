/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author disma
 */
public class CuentaAhorro extends Cuenta {
    
    private int numGiros;
    private boolean reajuste = true;

    public CuentaAhorro(int numGiros, int nuemro_de_Cuenta, long saldo, long saldo_en_Dolares) {
        super(nuemro_de_Cuenta, saldo, saldo_en_Dolares);
        this.numGiros = numGiros;
    }

    public int getNumGiros() {
        return numGiros;
    }

    public boolean isReajuste() {
        return reajuste;
    }

    public void setNumGiros(int numGiros) {
        this.numGiros = numGiros;
    }

    public void setReajuste(boolean reajuste) {
        this.reajuste = reajuste;
    }
    
    public void giro(long monto){
        
        this.numGiros = numGiros + 1;
        
        if(numGiros <= 5){
            
            this.reajuste = false;
            
        }
        
        //Muy dificil calcular el reajuste
        
    }
    
}
