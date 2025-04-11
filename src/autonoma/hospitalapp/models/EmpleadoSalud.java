package autonoma.hospitalapp.models;

/**
 * Representa a un empleado del área de salud dentro del hospital.
 * Este tipo de empleado tiene una especialidad médica y su salario 
 * se calcula con base en las horas trabajadas y un porcentaje adicional por hora.
 * 
 * Hereda de {@link Empleado}.
 * 
 * @author Jacobo Velez Valencia
 */
public class EmpleadoSalud extends Empleado {

    private String especialiad;
    private double horasTrabajadas;

    /**
     * Crea un nuevo EmpleadoSalud con los datos especificados.
     *
     * @param especialiad la especialidad médica del empleado (por ejemplo, pediatría, cardiología, etc.)
     * @param horasTrabajadas la cantidad de horas que ha trabajado el empleado
     * @param nombre el nombre del empleado
     * @param edad la edad del empleado
     * @param numeroDocumento el número de documento del empleado
     * @param telefono el número de teléfono del empleado
     * @param salario el salario actual (base) registrado del empleado
     */
    public EmpleadoSalud(String especialiad, double horasTrabajadas, String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        super(nombre, edad, numeroDocumento, telefono, salario);
        this.especialiad = especialiad;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Obtiene la especialidad del empleado de salud.
     *
     * @return la especialidad médica del empleado
     */
    public String getEspecialiad() {
        return especialiad;
    }

    /**
     * Establece la especialidad del empleado de salud.
     *
     * @param especialiad la nueva especialidad médica
     */
    public void setEspecialiad(String especialiad) {
        this.especialiad = especialiad;
    }

    /**
     * Obtiene la cantidad de horas trabajadas por el empleado.
     *
     * @return las horas trabajadas
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Establece la cantidad de horas trabajadas por el empleado.
     *
     * @param horasTrabajadas el nuevo valor de horas trabajadas
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Calcula el salario del empleado de salud.
     * Se aplica un incremento del 1.2% del salario base por cada hora trabajada.
     *
     * @return el salario total calculado
     */
    @Override
    public double calcularSalario() {
        double salud = 0.012;
        return (getSalarioBase() * salud * horasTrabajadas) + getSalarioBase();
    }
}
