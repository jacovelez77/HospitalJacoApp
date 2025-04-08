/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */
 public class MedicamentoGenerico extends Medicamento {
  
  
    public MedicamentoGenerico(String nombre, String descripcion, double costo) {
        super(nombre, descripcion, costo);
    }

    @Override
    protected void calcularPrecioVenta() {
        super.precioVenta = super.getCosto() * 1.10;
    }
}