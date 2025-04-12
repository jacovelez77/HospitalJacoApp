/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.main;

import autonoma.hospitalapp.models.Gerente;
import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.views.VentanaPrincipal;

/**
 * Clase principal que lanza la aplicación HospitalApp.
 * Crea una instancia del Hospital y la pasa a la VentanaPrincipal.
 * 
 * @author Jacobo
 */
public class HospitalApp {

    public static void main(String[] args) {
        // Crear instancia del hospital
        Hospital hospital = new Hospital();

        // Crear y asignar un gerente al hospital
        Gerente gerente = new Gerente("Aaron Glassman", "84.941.564", 69, "Neurocirujano");
        hospital.setGerente(gerente);

        // Crear la ventana principal con el hospital
        VentanaPrincipal ventana = new VentanaPrincipal(hospital);
        ventana.setVisible(true);

        // Mostrar ventana de reportes con el hospital ya configurado
        //Reportes reportes = new Reportes(ventana, true, hospital, ventana);
        //reportes.setVisible(true);
    }
    
}


