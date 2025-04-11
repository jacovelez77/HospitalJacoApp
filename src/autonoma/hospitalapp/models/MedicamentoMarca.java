/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa un medicamento de marca dentro del sistema hospitalario.
 * Hereda de la clase {@link Medicamento} y agrega un atributo específico: el
 * fabricante del medicamento.
 * 
 * El precio de venta se calcula como un 25% adicional sobre el costo base.
 * 
 * @author Jacobo Velez Valencia
 */
public class MedicamentoMarca extends Medicamento {
    
    /**
     * Nombre del fabricante del medicamento.
     */
    private String fabricante;

    /**
     * Constructor de la clase MedicamentoMarca.
     * 
     * @param nombre      Nombre del medicamento.
     * @param descripcion Descripción del medicamento.
     * @param costo       Costo base del medicamento.
     * @param fabricante  Nombre del fabricante del medicamento.
     */
    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }

    /**
     * Devuelve el nombre del fabricante del medicamento.
     * 
     * @return Nombre del fabricante.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Calcula el precio de venta del medicamento de marca.
     * 
     * Se aplica un incremento del 25% sobre el costo base.
     */
    @Override
    protected void calcularPrecioVenta() {
        this.precioVenta = super.getCosto() * 1.25;
    }
}
