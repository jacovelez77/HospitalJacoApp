/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jacobo Velez Valencia
 */
package autonoma.hospitalapp.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz {@link Lector} para leer archivos de texto plano.
 * Utiliza codificación UTF-8 para garantizar compatibilidad con caracteres especiales.
 * 
 */
public class LectorArchivoTextoPlano implements Lector {

    /**
     * Lee el contenido de un archivo de texto ubicado en la ruta especificada.
     *
     * @param ruta la ruta del archivo que se desea leer
     * @return una lista de cadenas con cada línea del archivo como un elemento
     * @throws IOException si ocurre un error al abrir o leer el archivo
     */
    @Override
    public List<String> leer(String ruta) throws IOException {
        List<String> resultado = new ArrayList<>();

        try (BufferedReader buffer = new BufferedReader(new FileReader(ruta, StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = buffer.readLine()) != null) {
                resultado.add(linea);
            }
        }

        return resultado;
    }
}
