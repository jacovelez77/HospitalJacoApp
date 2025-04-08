/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */

public class Cita {
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private double valor;

    public Cita(Paciente paciente, Medico medico, String fecha, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void atenderCita() {
        System.out.println("El médico " + medico.getNombre() +
                           " está atendiendo al paciente " + paciente.getNombre() +
                           " el día " + fecha);
    }

    public static class Medico {
        private String nombre;

        public Medico(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }
}

