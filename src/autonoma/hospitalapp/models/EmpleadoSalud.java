/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */
public class EmpleadoSalud extends Empleado {

    private String especialiad;
    private double horasTrabajadas;

    public EmpleadoSalud(String especialiad, double horasTrabajadas, String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        super(nombre, edad, numeroDocumento, telefono, salario);
        this.especialiad = especialiad;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getEspecialiad() {
        return especialiad;
    }

    public void setEspecialiad(String especialiad) {
        this.especialiad = especialiad;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        double salud = 0.012;
        return (getSalarioBase() * salud * horasTrabajadas) + getSalarioBase();
    }
}

