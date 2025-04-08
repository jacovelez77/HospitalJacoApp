/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;
/**
 *
 * @author Jacobo Velez Valencia
 */
public class MalaFormulacionException extends Exception {
    
    public MalaFormulacionException(String mensaje) {
        super("Error en la formulación médica:");
    }
}
