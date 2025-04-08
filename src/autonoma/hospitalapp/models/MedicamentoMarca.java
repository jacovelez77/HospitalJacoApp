/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */
   public class MedicamentoMarca extends Medicamento {
   private String fabricante;

 
    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }   
     

    public String getFabricante() {
        return fabricante;
    }
   
    @Override
    protected void calcularPrecioVenta() {
        this.precioVenta = super.getCosto() * 1.25;
    }
}