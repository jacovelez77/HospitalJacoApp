/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 *
 * @author Jacobo Velez Valencia
 */
  public class DeclararQuiebraException  extends RuntimeException{

        public DeclararQuiebraException() {
            super("El hospital ha entrado en quiebra");
        }
    }
