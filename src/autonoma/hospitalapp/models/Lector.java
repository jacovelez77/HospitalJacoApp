/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Jacobo Velez Valencia
 */
public interface Lector {
    List<String> leer(String ruta) throws IOException;
}
    

