/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.DeclararQuiebraException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jacobo Velez Valencia
 * 
 */
public class Nomina {

    private int id;
    private static int contadorId = 1;
    private Date fecha;
    private double totalSalarioNomina;
    private ArrayList<Empleado> empleados;

    public Nomina(ArrayList<Empleado> empleados) {
        this.id = contadorId++;
        this.fecha = new Date();
        this.empleados = empleados;
        this.totalSalarioNomina = calcularTotalSalario();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalSalarioNomina() {
        return totalSalarioNomina;
    }

    public void setTotalSalarioNomina(double totalSalarioNomina) {
        this.totalSalarioNomina = totalSalarioNomina;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    private double calcularTotalSalario() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }

  /**
 * Genera la nómina del hospital actualizando el total de salarios y la fecha de generación.
 */
public void generarNomina() {
    // Calcula la suma total de salarios de todos los empleados
    this.totalSalarioNomina = calcularTotalSalario();

    // Asigna la fecha actual como fecha de generación de la nómina
    this.fecha = new Date();
}

/**
 * Descuenta el total de la nómina del presupuesto del hospital.
 * Si el presupuesto resulta negativo, cambia el estado del hospital a inactivo
 * y lanza una excepción indicando quiebra.
 *
 * @param hospital Hospital al que se le descontará el valor de la nómina.
 * @throws DeclararQuiebraException Si el presupuesto del hospital queda por debajo de 0.
 */
public void descontarNomina(Hospital hospital) throws DeclararQuiebraException {
    double totalSalarios = 0;

    // Suma todos los salarios de los empleados
    for (Empleado empleado : empleados) {
        totalSalarios += empleado.calcularSalario();
    }

    // Resta el total de salarios del presupuesto del hospital
    hospital.setPresupuesto(hospital.getPresupuesto() - totalSalarios);

    // Si el presupuesto queda en negativo, el hospital entra en quiebra
    if (hospital.getPresupuesto() < 0) {
        hospital.setEstado(false); // Hospital queda inactivo
        throw new DeclararQuiebraException(); // Se lanza una excepción personalizada
    }
}

}