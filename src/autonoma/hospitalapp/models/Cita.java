/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */

/**
 * Representa una cita médica entre un paciente y un médico en una fecha determinada con un valor asociado.
 */
public class Cita {
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private double valor;

    /**
     * Crea una nueva cita médica.
     *
     * @param paciente el paciente que asistirá a la cita
     * @param medico el médico que atenderá la cita
     * @param fecha la fecha de la cita (formato String)
     * @param valor el costo o valor de la cita
     */
    public Cita(Paciente paciente, Medico medico, String fecha, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valor = valor;
    }

    /**
     * Obtiene el valor de la cita.
     *
     * @return el valor de la cita
     */
    public double getValor() {
        return valor;
    }

    /**
     * Obtiene el paciente asociado a la cita.
     *
     * @return el paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Obtiene el médico que atenderá la cita.
     *
     * @return el médico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Obtiene la fecha de la cita.
     *
     * @return la fecha de la cita como String
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece un nuevo valor para la cita.
     *
     * @param valor el nuevo valor de la cita
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Establece el paciente que asistirá a la cita.
     *
     * @param paciente el nuevo paciente
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Establece el médico que atenderá la cita.
     *
     * @param medico el nuevo médico
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * Establece la fecha de la cita.
     *
     * @param fecha la nueva fecha de la cita
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Simula la atención de la cita mostrando un mensaje con el nombre del médico, del paciente y la fecha.
     */
    public void atenderCita() {
        System.out.println("El médico " + medico.getNombre() +
                           " está atendiendo al paciente " + paciente.getNombre() +
                           " el día " + fecha);
    }

    /**
     * Representa a un médico con un nombre.
     */
    public static class Medico {
        private String nombre;

        /**
         * Crea un nuevo médico con el nombre proporcionado.
         *
         * @param nombre el nombre del médico
         */
        public Medico(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Obtiene el nombre del médico.
         *
         * @return el nombre del médico
         */
        public String getNombre() {
            return nombre;
        }
    }
}


