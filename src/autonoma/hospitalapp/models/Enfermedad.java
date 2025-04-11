package autonoma.hospitalapp.models;

/**
 * Representa una enfermedad registrada en el sistema del hospital.
 * Contiene información básica como el nombre y una descripción de la enfermedad.
 * 
 * Esta clase podría ser usada para asociarse a un paciente, diagnóstico o historial clínico.
 * 
 * Autor: Jacobo Velez Valencia
 */
class Enfermedad {
    private String nombre;
    private String descripcion;

    /**
     * Crea una nueva instancia de Enfermedad.
     *
     * @param nombre el nombre de la enfermedad (por ejemplo, "Gripe", "Diabetes")
     * @param descripcion una breve descripción o detalle de la enfermedad
     */
    public Enfermedad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la enfermedad.
     *
     * @return el nombre de la enfermedad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción de la enfermedad.
     *
     * @return la descripción de la enfermedad
     */
    public String getDescripcion() {
        return descripcion;
    }
}
