/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jacobo Velez Valencia
 */
package autonoma.hospitalapp.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz {@link Escritor} que permite escribir contenido en archivos de texto plano.
 * 
 * Esta clase utiliza codificación UTF-8 y sobrescribe el contenido del archivo si ya existe.
 * Es útil para guardar información como reportes, registros o listados en formato de texto simple.
 * 
 * Autor: Jacobo Velez Valencia
 */
public class EscritorArchivoTextoPlano implements Escritor {

    /**
     * Escribe el contenido proporcionado en un archivo de texto ubicado en la ruta especificada.
     * 
     * Cada elemento de la lista será escrito en una línea separada dentro del archivo.
     * 
     * @param contenido lista de líneas de texto a escribir
     * @param ruta ruta completa (relativa o absoluta) donde se creará o sobrescribirá el archivo
     * @throws IOException si ocurre un error al escribir en el archivo
     */
    public void escribir(List<String> contenido, String ruta) throws IOException {
        File archivo = new File(ruta);
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, StandardCharsets.UTF_8))) {
            for (String linea : contenido) {
                pw.println(linea);
            }
        }
    }

    @Override
    public void escribir(ArrayList<String> archivo, String ruta) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

