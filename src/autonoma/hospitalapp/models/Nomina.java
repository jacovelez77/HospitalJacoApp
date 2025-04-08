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

    public void generarNomina() {
        this.totalSalarioNomina = calcularTotalSalario();
        this.fecha = new Date();
    }

    public void descontarNomina(Hospital hospital) throws DeclararQuiebraException {
        double totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.calcularSalario();
        }
        hospital.setPresupuesto(hospital.getPresupuesto() - totalSalarios);

        if (hospital.getPresupuesto() < 0) {
            hospital.setEstado(false);
            throw new DeclararQuiebraException();
        }
    }
}