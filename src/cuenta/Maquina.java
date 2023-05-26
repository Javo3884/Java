/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author disma
 */
public class Maquina {
    private String modelo;
    private Long precio;
    
    
    public String toString(){
    return "Redbanc";
    }
    
    public Maquina(String modelo, Long precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    
}
