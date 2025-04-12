package autonoma.hospitalapp.models;

import java.util.ArrayList;

/**
 * La clase Hospital representa a un hospital dentro de la aplicación.
 * Contiene información sobre el hospital, sus empleados, presupuesto y operaciones.
 * Proporciona métodos para gestionar los empleados y el presupuesto.
 * 
 * @author Jacobo Velez Valencia
 */
public class Hospital {

    // Atributos de la clase
    private String nombre;
    private String direccion;
    private String telefono;
    private double presupuesto; // Presupuesto disponible en el hospital
    private double metaDeventasAnual; // Meta anual de ventas del hospital
    private String fechaFundacion; // Fecha en que el hospital fue fundado
    private boolean estado; // Estado del hospital (activo o inactivo)
    private Gerente gerente; // El gerente que administra el hospital
    private Localizacion localizacion; // Ubicación geográfica del hospital
    private ArrayList<Empleado> empleados; // Lista de empleados del hospital
    private Nomina nomina; // Información sobre la nómina de empleados

    /**
     * Constructor de la clase Hospital, con parámetros específicos para la meta de ventas,
     * el estado, el gerente y la localización.
     * 
     * @param metaDeventasAnual La meta anual de ventas.
     * @param estado Estado del hospital (activo o inactivo).
     * @param gerente El gerente que administra el hospital.
     * @param localizacion La ubicación geográfica del hospital.
     */
    public Hospital(double metaDeventasAnual, boolean estado, Gerente gerente, Localizacion localizacion) {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>(); // Inicializa la lista de empleados
        this.nomina = new Nomina(this.empleados); // Inicializa la nómina con la lista de empleados
    }

    /**
     * Constructor por defecto, inicializa los empleados y la nómina vacíos.
     */
    public Hospital() {
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

    // Métodos getter y setter para los atributos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getMetaDeventasAnual() {
        return metaDeventasAnual;
    }

    public void setMetaDeventasAnual(double metaDeventasAnual) {
        this.metaDeventasAnual = metaDeventasAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    /**
     * Agrega un nuevo empleado al hospital si no existe un empleado con el mismo número de documento.
     * 
     * @param nuevoEmpleado El nuevo empleado a agregar.
     * @return true si el empleado se agregó con éxito, false si ya existe.
     */
    public boolean agregarEmpleado(Empleado nuevoEmpleado) {
        // Verifica si ya existe un empleado con el mismo número de documento
        for (Empleado e : empleados) {
            if (e.getNumeroDocumento().equalsIgnoreCase(nuevoEmpleado.getNumeroDocumento())) {
                return false; // No se agrega si ya existe
            }
        }
        empleados.add(nuevoEmpleado); // Si no existe, se agrega
        return true;
    }

    /**
     * Obtiene un empleado por su número de documento.
     * 
     * @param documento El número de documento del empleado.
     * @return El empleado si se encuentra, o null si no se encuentra.
     */
    public Empleado obtenerEmpleadoPorDocumento(String documento) {
        return empleados.stream()
                .filter(e -> e.getNumeroDocumento().equalsIgnoreCase(documento))
                .findFirst()
                .orElse(null); // Devuelve null si no encuentra el empleado
    }

    /**
     * Actualiza la información de un empleado existente.
     * 
     * @param documento El número de documento del empleado a actualizar.
     * @param nuevoNombre El nuevo nombre del empleado.
     * @param nuevoTelefono El nuevo teléfono del empleado.
     * @return true si el empleado fue actualizado correctamente, false si no se encontró.
     */
    public boolean actualizarEmpleado(String documento, String nuevoNombre, String nuevoTelefono) {
        Empleado empleadoEncontrado = obtenerEmpleadoPorDocumento(documento);
        if (empleadoEncontrado != null) {
            empleadoEncontrado.setNombre(nuevoNombre);
            empleadoEncontrado.setTelefono(nuevoTelefono);
            return true;
        }
        return false; // Si no se encuentra el empleado, no se actualiza
    }

    /**
     * Elimina un empleado del hospital usando su número de documento.
     * 
     * @param numeroDocumento El número de documento del empleado a eliminar.
     * @return true si el empleado fue eliminado, false si no se encontraba.
     */
    public boolean eliminarEmpleado(String numeroDocumento) {
        return empleados.removeIf(e -> e.getNumeroDocumento().equalsIgnoreCase(numeroDocumento));
    }

    /**
     * Lista todos los empleados del hospital.
     * 
     * @return Una cadena con la lista de empleados.
     */
    public String listarEmpleados() {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : empleados) {
            sb.append(e).append("\n");
        }
        return sb.toString(); // Devuelve la lista de empleados como un string
    }

    /**
     * Aumenta el presupuesto del hospital sumando el precio de venta.
     * 
     * @param precioVenta El precio de venta a agregar al presupuesto.
     */
    public void aumentarPresupuesto(double precioVenta) {
        this.presupuesto += precioVenta;
    }

    /**
     * Descuenta una cantidad del presupuesto del hospital.
     * 
     * @param costo El costo a descontar del presupuesto.
     */
    public void descontarPresupuesto(double costo) {
        this.presupuesto -= costo;
    }

    /**
     * Obtiene el presupuesto en formato entero (sin decimales).
     * 
     * @return El presupuesto como un valor entero.
     */
    public int getPresupuestoInt() {
        return (int) presupuesto;
    }

    /**
     * Establece el estado del hospital manualmente (activo o inactivo).
     * 
     * @param estado El nuevo estado del hospital.
     */
    public void setEstadoManual(boolean estado) {
        this.estado = estado;
    }

    /**
     * Establece el presupuesto manualmente.
     * 
     * @param presupuesto El nuevo presupuesto.
     */
    public void setPresupuestoManual(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
