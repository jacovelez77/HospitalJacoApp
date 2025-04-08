/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Jacobo Velez Valencia
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosArchivos {

    public void crearArchivo(String archivo) {
        File f1 = new File(archivo);
        PrintWriter pw;

        try {
            pw = new PrintWriter(f1);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo(String archivo, String texto) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.print(texto);
            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<String> leerArchivo(String archivo) {
        List<String> lineas = new ArrayList<>();
        File f1 = new File(archivo);

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return lineas;
    }

    public void archivosDirectorio(String directorio) {
        File f1 = new File(directorio);

        String[] archivos = f1.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }

    public void guardarNomina(String archivo, Nomina nomina) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.println("ID Nomina: " + nomina.getId());
            pw.println("Fecha: " + nomina.getFecha());
            pw.println("Empleados:");

            for (Empleado e : nomina.getEmpleados()) {
                pw.println("Nombre: " + e.getNombre() + ", Salario: " + e.calcularSalario());
            }

            pw.println("Total Nomina: " + nomina.getTotalSalarioNomina());
            pw.println("----------------------------------");
            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Hospital asignarAtributosHospital(String archivo) {
        Hospital hospital = new Hospital();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");
                if (partes.length == 2) {
                    String nombreCampo = partes[0];
                    String valorCampo = partes[1];
                    
                    if (nombreCampo.equals("Nombre")) {
                        hospital.setNombre(valorCampo);
                    } else if (nombreCampo.equals("Direccion")) {
                        hospital.setDireccion(valorCampo);
                    } else if (nombreCampo.equals("Telefono")) {
                        hospital.setTelefono(valorCampo);
                    } else if (nombreCampo.equals("Presupuesto")) {
                        hospital.setPresupuesto(Double.parseDouble(valorCampo));
                    } else if (nombreCampo.equals("Fecha de Fundacion")) {
                        hospital.setFechaFundacion(valorCampo);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hospital;
    }

    public Gerente asignarAtributosGerente(String archivo) {
        Gerente gerente = new Gerente();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");
                if (partes.length == 2) {
                    String nombreCampo = partes[0];
                    String valorCampo = partes[1];
                    
                    if (nombreCampo.equals("Nombre")) {
                        gerente.setNombre(valorCampo);
                    } else if (nombreCampo.equals("Numero de documento")) {
                        gerente.setDocumentoIdentidad(valorCampo);
                    } else if (nombreCampo.equals("Edad")) {
                        gerente.setEdad(Integer.parseInt(valorCampo));
                    } else if (nombreCampo.equals("Carrera")) {
                        gerente.setCarrera(valorCampo);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gerente;
    }

   public Localizacion asignarAtributosLocalizacion(String archivo) {
        Localizacion localizacion = new Localizacion();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");
                if (partes.length == 2) {
                    String nombreCampo = partes[0];
                    String valorCampo = partes[1];
                    
                    if (nombreCampo.equals("Latitud")) {
                        localizacion.setLatitud(Double.parseDouble(valorCampo));
                    } else if (nombreCampo.equals("Longitud")) {
                        localizacion.setLongitud(Double.parseDouble(valorCampo));
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return localizacion;
    }
}
