/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa una medicina dentro del sistema hospitalario.
 * Contiene información básica como el nombre, la descripción y la
 * enfermedad que ayuda a superar.
 * 
 * Puede asociarse directamente a una instancia de {@link Enfermedad}.
 * 
 * @author Jacobo Velez Valencia
 */
public class Medicina {

    /**
     * Nombre de la medicina.
     */
    private String nombre;

    /**
     * Descripción breve de la medicina.
     */
    private String descripcion;

    /**
     * Nombre de la enfermedad que esta medicina ayuda a superar.
     */
    private String enfermedadSuperada;

    /**
     * Constructor de la clase Medicina.
     * 
     * @param nombre             Nombre de la medicina.
     * @param descripcion        Descripción de la medicina.
     * @param enfermedadSuperada Nombre de la enfermedad que esta medicina trata.
     */
    public Medicina(String nombre, String descripcion, String enfermedadSuperada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadSuperada = enfermedadSuperada;
    }

    /**
     * Obtiene el nombre de la medicina.
     * 
     * @return Nombre de la medicina.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la medicina.
     * 
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la medicina.
     * 
     * @return Descripción de la medicina.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la medicina.
     * 
     * @param descripcion Descripción a asignar.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la enfermedad que esta medicina supera.
     * 
     * @return Nombre de la enfermedad.
     */
    public String getEnfermedadSuperada() {
        return enfermedadSuperada;
    }

    /**
     * Establece la enfermedad que esta medicina supera.
     * 
     * @param enfermedadSuperada Nombre de la enfermedad.
     */
    public void setEnfermedadSuperada(String enfermedadSuperada) {
        this.enfermedadSuperada = enfermedadSuperada;
    }

    /**
     * Asocia una instancia de {@link Enfermedad} a la medicina, asignando su nombre.
     * 
     * @param enfermedad Objeto de tipo Enfermedad a asociar.
     */
    public void asociarEnfermedad(Enfermedad enfermedad) {
        this.enfermedadSuperada = enfermedad.getNombre();
    }
}
