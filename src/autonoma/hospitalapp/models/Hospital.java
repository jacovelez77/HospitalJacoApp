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

public class Hospital {

    private String nombre;
    private String direccion;
    private String telefono;
    private double presupuesto;
    private double metaDeventasAnual;
    private String fechaFundacion;
    private boolean estado;
    private Gerente gerente;
    private Localizacion localizacion;
    private ArrayList<Empleado> empleados;
    private Nomina nomina;

    public Hospital(double metaDeventasAnual, boolean estado, Gerente gerente, Localizacion localizacion) {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

    public Hospital() {
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getMetaDeventasAnual() {
        return metaDeventasAnual;
    }

    public void setMetaDeventasAnual(double metaDeventasAnual) {
        this.metaDeventasAnual = metaDeventasAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

 
   public boolean agregarEmpleado(Empleado nuevoEmpleado) {
    for (Empleado e : empleados) {
        if (e.getNumeroDocumento().equalsIgnoreCase(nuevoEmpleado.getNumeroDocumento())) {
            return false; 
        }
    }
    empleados.add(nuevoEmpleado);
    return true;
}


  public Empleado obtenerEmpleadoPorDocumento(String documento) {
    return empleados.stream()
            .filter(e -> e.getNumeroDocumento().equalsIgnoreCase(documento))
            .findFirst()
            .orElse(null);
}


  public boolean actualizarEmpleado(String documento, String nuevoNombre, String nuevoTelefono) {
    Empleado empleadoEncontrado = obtenerEmpleadoPorDocumento(documento);
    if (empleadoEncontrado != null) {
        empleadoEncontrado.setNombre(nuevoNombre);
        empleadoEncontrado.setTelefono(nuevoTelefono);
        return true;
    }
    return false;
}


  public boolean eliminarEmpleado(String numeroDocumento) {
    return empleados.removeIf(e -> e.getNumeroDocumento().equalsIgnoreCase(numeroDocumento));
}


  public String listarEmpleados() {
    StringBuilder sb = new StringBuilder();
    for (Empleado e : empleados) {
        sb.append(e).append("\n");
    }
    return sb.toString();
}


    public void aumentarPresupuesto(double precioVenta) {
        this.presupuesto += precioVenta;
    }

    public void descontarPresupuesto(double costo) {
        this.presupuesto -= costo;
    }

    public int getPresupuestoInt() {
        return (int) presupuesto;
    }

    public void setEstadoManual(boolean b) {
        this.estado = b;
    }

    public void setPresupuestoManual(double d) {
        this.presupuesto = d;
    }
}
