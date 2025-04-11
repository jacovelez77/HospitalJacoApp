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
 * Clase abstracta que representa a un empleado genérico de una empresa u organización.
 * Contiene atributos comunes como nombre, edad, documento de identidad, teléfono y salario.
 * Las subclases deben implementar el método {@code calcularSalario()}.
 */
public abstract class Empleado {

    private String nombre;
    private int edad;
    private String numeroDocumento;
    private String telefono;
    private final double salarioBase = 50000;
    private double salario;

    /**
     * Crea un nuevo empleado con los datos proporcionados.
     *
     * @param nombre el nombre del empleado
     * @param edad la edad del empleado
     * @param numeroDocumento el número de documento del empleado
     * @param telefono el número de teléfono del empleado
     * @param salario el salario actual del empleado
     */
    public Empleado(String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre el nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del empleado.
     *
     * @return la edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del empleado.
     *
     * @param edad la nueva edad del empleado
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el número de documento del empleado.
     *
     * @return el número de documento del empleado
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Establece el número de documento del empleado.
     *
     * @param numeroDocumento el nuevo número de documento
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * Obtiene el número de teléfono del empleado.
     *
     * @return el número de teléfono del empleado
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del empleado.
     *
     * @param telefono el nuevo número de teléfono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el salario actual del empleado.
     *
     * @return el salario del empleado
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario actual del empleado.
     *
     * @param salario el nuevo salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Obtiene el salario base común para todos los empleados.
     *
     * @return el salario base (constante)
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para calcular el salario real del empleado,
     * considerando factores adicionales según su tipo (bonificaciones, horas extras, comisiones, etc.).
     *
     * @return el salario calculado
     */
    public abstract double calcularSalario();
}

