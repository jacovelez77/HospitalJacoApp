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
 * Representa a un gerente dentro del sistema hospitalario.
 * Un gerente tiene datos personales como nombre, documento de identidad, edad y carrera profesional.
 * Esta clase permite gestionar y actualizar dicha información.
 * 
 * Autor: Jacobo Velez Valencia
 */
public class Gerente {

    private String nombre;
    private String documentoIdentidad;
    private int edad;
    private String carrera;

    /**
     * Crea un nuevo objeto Gerente con todos los datos iniciales especificados.
     *
     * @param nombre el nombre del gerente
     * @param documentoIdentidad el número de documento de identidad
     * @param edad la edad del gerente
     * @param carrera la carrera profesional del gerente
     */
    public Gerente(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Constructor vacío. Crea un objeto Gerente con valores nulos o por defecto.
     * 
     * Nota: Actualmente, este constructor no establece ningún valor inicial válido.
     * Podría mejorarse asignando valores por defecto explícitos o eliminándose si no se usa.
     */
    public Gerente() {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Actualiza todos los datos del gerente.
     *
     * @param nombre nuevo nombre del gerente
     * @param documentoIdentidad nuevo número de documento
     * @param edad nueva edad
     * @param carrera nueva carrera profesional
     */
    public void actualizarDatos(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Devuelve los datos del gerente en formato legible.
     *
     * @return una cadena con los datos concatenados
     */
    public String obtenerDatos() {
        return "Nombre: " + nombre + " | Documento: " + documentoIdentidad +
               " | Edad: " + edad + " | Carrera: " + carrera;
    }
}
