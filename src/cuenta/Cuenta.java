/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author disma
 */
public class Cuenta {
    
    private int nuemro_de_Cuenta;
    private long  saldo;
    private long saldo_en_Dolares;
  
   long monto;
   
   public void deposita( long monto)    
    {
       this.saldo = this.saldo + this.monto;
    }
  
 public void giro( long monto)    
    {
       this.saldo = this.saldo-this.monto;
    }
  
   public  long ObtenerSaldo()
  {
     return saldo;
  }
  
  int numero;
  
  public boolean tieneNumeroDeCuenta(int numero)
  {
        return this.nuemro_de_Cuenta > this.numero;
  }
  
  public void depositaDolar(long monto)
  {
      this.saldo_en_Dolares = this.saldo_en_Dolares + this.monto;
  }
  
  public void giroDolar(long monto)
  {
       this.saldo_en_Dolares = this.saldo_en_Dolares - this.monto;
  }

  public long obtieneSaldoDolar()
  {
    return saldo_en_Dolares;
   }
  
    public Cuenta(int nuemro_de_Cuenta, long saldo, long saldo_en_Dolares) {
        this.nuemro_de_Cuenta = nuemro_de_Cuenta;
        this.saldo = saldo;
        this.saldo_en_Dolares = saldo_en_Dolares;
    }

    public int getNuemro_de_Cuenta() {
        return nuemro_de_Cuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getSaldo_en_Dolares() {
        return saldo_en_Dolares;
    }

    public void setNuemro_de_Cuenta(int nuemro_de_Cuenta) {
        this.nuemro_de_Cuenta = nuemro_de_Cuenta;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void setSaldo_en_Dolares(long saldo_en_Dolares) {
        this.saldo_en_Dolares = saldo_en_Dolares;
    }    
}
 