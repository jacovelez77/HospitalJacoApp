package autonoma.hospitalapp.models;

/**
 * Representa a un empleado operativo dentro del hospital. 
 * Este tipo de empleado tiene un área de trabajo específica y su salario
 * se calcula con base en un porcentaje adicional sobre el salario base.
 * 
 * Hereda de {@link Empleado}.
 * 
 * @author Jacobo Velez Valencia
 */
public class EmpleadoOperativo extends Empleado {

    private String areaTrabajo;

    /**
     * Crea un nuevo EmpleadoOperativo con los datos especificados.
     *
     * @param areaTrabajo el área en la que el empleado realiza sus funciones (por ejemplo, limpieza, seguridad, etc.)
     * @param nombre el nombre del empleado
     * @param edad la edad del empleado
     * @param numeroDocumento el número de documento de identificación
     * @param telefono el número de teléfono de contacto
     * @param salario el salario base registrado del empleado
     */
    public EmpleadoOperativo(String areaTrabajo, String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        super(nombre, edad, numeroDocumento, telefono, salario);
        this.areaTrabajo = areaTrabajo;
    }

    /**
     * Obtiene el área de trabajo del empleado operativo.
     *
     * @return el área de trabajo
     */
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    /**
     * Establece un nuevo valor para el área de trabajo.
     *
     * @param areaTrabajo el nuevo área de trabajo
     */
    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    /**
     * Calcula el salario real del empleado operativo.
     * Se aplica un incremento del 20% sobre el salario base.
     *
     * @return el salario calculado con el incremento correspondiente
     */
    @Override
    public double calcularSalario() {
        double operativo = 0.2;
        return (getSalarioBase() * operativo) + getSalarioBase();
    }
}
