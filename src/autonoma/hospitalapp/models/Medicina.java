/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */
public class Medicina {
    private String nombre;
    private String descripcion;
    private String enfermedadSuperada;

    public Medicina(String nombre, String descripcion, String enfermedadSuperada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadSuperada = enfermedadSuperada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnfermedadSuperada() {
        return enfermedadSuperada;
    }

    public void setEnfermedadSuperada(String enfermedadSuperada) {
        this.enfermedadSuperada = enfermedadSuperada;
    }
     public void asociarEnfermedad(Enfermedad enfermedad) {
        this.enfermedadSuperada= enfermedad.getNombre();
    }

}