/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */





package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz que define el comportamiento para clases que deseen implementar
 * la funcionalidad de escritura de archivos.
 * 
 * Las clases que implementen esta interfaz deben definir cómo escribir una
 * lista de cadenas de texto a una ruta específica.
 * 
 * Esto puede ser útil, por ejemplo, para guardar reportes, registros médicos,
 * listas de pacientes, etc.
 * 
 * @author  Jacobo Velez Valencia
 */
public interface Escritor {

    /**
     * Escribe el contenido de una lista de cadenas en un archivo ubicado en la ruta especificada.
     *
     * @param archivo una lista de líneas de texto que se desean escribir en el archivo
     * @param ruta la ruta absoluta o relativa del archivo de destino
     * @throws IOException si ocurre un error durante la escritura del archivo
     */
    public abstract void escribir(ArrayList<String> archivo, String ruta) throws IOException;
}
