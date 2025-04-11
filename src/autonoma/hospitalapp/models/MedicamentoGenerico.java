/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa un medicamento genérico en el sistema hospitalario.
 * Hereda de la clase {@link Medicamento} y define una lógica específica para
 * calcular su precio de venta.
 * 
 * En este caso, el precio de venta se calcula como un 10% adicional sobre el
 * costo base.
 * 
 * @author Jacobo Velez Valencia
 */
public class MedicamentoGenerico extends Medicamento {
    
    /**
     * Constructor de la clase MedicamentoGenerico.
     * 
     * @param nombre      Nombre del medicamento genérico.
     * @param descripcion Breve descripción del medicamento.
     * @param costo       Costo base del medicamento.
     */
    public MedicamentoGenerico(String nombre, String descripcion, double costo) {
        super(nombre, descripcion, costo);
    }

    /**
     * Calcula el precio de venta del medicamento genérico.
     * 
     * Se establece un incremento del 10% sobre el costo original del medicamento.
     */
    @Override
    protected void calcularPrecioVenta() {
        super.precioVenta = super.getCosto() * 1.10;
    }
}
