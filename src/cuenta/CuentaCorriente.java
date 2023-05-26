/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author disma
 */
import java.time.LocalDate;

public class CuentaCorriente  extends Cuenta{
    
    private LocalDate ultimaComision;

    public CuentaCorriente(LocalDate ultimaComision, int nuemro_de_Cuenta, long saldo, long saldo_en_Dolares) {
        super(nuemro_de_Cuenta, saldo, saldo_en_Dolares);
        this.ultimaComision = ultimaComision;
    }
    
    public LocalDate getUltimaComision() {
        return ultimaComision;
    }

    public void setUltimaComision(LocalDate ultimaComision) {
        this.ultimaComision = ultimaComision;
    }
    
    public void comision()
    {
        LocalDate fechaActual = LocalDate.now();
        if ( fechaActual.getMonthValue() !=  ultimaComision.getMonthValue()){
            
             setSaldo(getSaldo() - 40000);
            
        }
    }
     

    public void giro(long monto){
         
        if (this.monto <=200000){
            setSaldo(getSaldo()-this.monto);
            System.out.println( "transaccion completada" );
        } else {
            
            System.out.println( "el monto es demasiado alto" );
        
        }
    
    }
    
    
     
}
    
