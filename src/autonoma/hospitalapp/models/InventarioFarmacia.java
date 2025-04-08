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


 public class InventarioFarmacia {
    

    private List<Medicamento> medicamentos;
    private int añoActualizacion;

    public InventarioFarmacia() {
        this.medicamentos = new ArrayList<>();
        this.añoActualizacion = 2025;
    }
    
   
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
    }  catch (Exception e) {
        return false;
    }
}

public Medicamento venderMedicamento(String nombre, Hospital hospital) {
    if (nombre == null || hospital == null || medicamentos.isEmpty()) {
        return null;
    }
        return null;
    }
 }