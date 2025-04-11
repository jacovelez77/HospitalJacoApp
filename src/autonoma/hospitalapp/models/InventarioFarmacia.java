/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Representa el inventario de medicamentos de la farmacia del hospital.
 * Permite agregar y vender medicamentos, manteniendo sincronizado el presupuesto del hospital.
 * 
 * Autor: Jacobo Velez Valencia
 */
public class InventarioFarmacia {

    private List<Medicamento> medicamentos;
    private int añoActualizacion;

    /**
     * Constructor que inicializa el inventario con una lista vacía de medicamentos
     * y establece el año de actualización en 2025.
     */
    public InventarioFarmacia() {
        this.medicamentos = new ArrayList<>();
        this.añoActualizacion = 2025;
    }

    /**
     * Agrega un medicamento al inventario si el hospital tiene presupuesto suficiente.
     *
     * @param medicamento el medicamento a agregar
     * @param hospital el hospital asociado para validar y descontar presupuesto
     * @return true si se agregó exitosamente, false en caso contrario
     */
    public boolean agregarMedicamento(Medicamento medicamento, Hospital hospital) {
        if (medicamento == null || hospital == null) {
            return false;
        }

        double costoMedicamento = medicamento.getCosto();
        if (hospital.getPresupuesto() < costoMedicamento) {
            return false;
        }

        try {
            medicamentos.add(medicamento);
            hospital.descontarPresupuesto(costoMedicamento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Vende un medicamento si existe en el inventario, lo elimina y suma su precio de venta al presupuesto del hospital.
     *
     * @param nombre nombre del medicamento a vender
     * @param hospital el hospital al que se le agregará el valor de venta
     * @return el medicamento vendido si fue exitoso, null si no se encuentra
     */
    public Medicamento venderMedicamento(String nombre, Hospital hospital) {
        if (nombre == null || hospital == null || medicamentos.isEmpty()) {
            return null;
        }

        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                medicamentos.remove(m);
                hospital.aumentarPresupuesto(m.getPrecioVenta());
                return m;
            }
        }
        return null;
    }

    /**
     * Retorna la lista de todos los medicamentos actuales.
     *
     * @return lista de medicamentos en el inventario
     */
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Establece una nueva lista de medicamentos en el inventario.
     *
     * @param medicamentos lista de medicamentos
     */
    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * Retorna el año en el que se actualizó por última vez el inventario.
     *
     * @return año de actualización
     */
    public int getAñoActualizacion() {
        return añoActualizacion;
    }

    /**
     * Establece el año de actualización del inventario.
     *
     * @param añoActualizacion nuevo año
     */
    public void setAñoActualizacion(int añoActualizacion) {
        this.añoActualizacion = añoActualizacion;
    }
}
