/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author USER
 */
 import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String documento;
    private int edad;
    private String telefono;
    private String correo;
    private String estado;
    private List<Enfermedad> enfermedades;
    private List<Medicamento> medicamentos;

    public Paciente(String nombre, String documento, int edad, String telefono, String correo, String estado, List<Enfermedad> enfermedades, List<Medicamento> medicamentos) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
    }

   

    public void agregarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
        estado = "critico";
    }

    public void curarEnfermedad(Medicamento medicamento, Enfermedad enfermedad) {
        boolean tieneEnfermedad = false;
        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equals(enfermedad.getNombre())) {
                tieneEnfermedad = true;
                break;
            }
        }

        if (!tieneEnfermedad) {
            System.out.println(" El paciente no tiene la enfermedad '" + enfermedad.getNombre() + "'.");
            estado = "critico";
            return;
        }

        for (Medicamento m : medicamentos) {
            if (m.getNombre().equals(medicamento.getNombre())) {
                System.out.println("️ El medicamento '" + medicamento.getNombre() + "' ya fue recetado.");
                estado = "critico";
                return;
            }
        }

        enfermedades.removeIf(e -> e.getNombre().equals(enfermedad.getNombre()));
        medicamentos.add(medicamento);
        System.out.println(" Enfermedad '" + enfermedad.getNombre() + "curada con " + medicamento.getNombre() + " ");

        if (enfermedades.isEmpty()) {
            estado = "saludable";
        }
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}