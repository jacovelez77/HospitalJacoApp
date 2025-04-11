package autonoma.hospitalapp.models;

/**
 * Clase abstracta que representa un medicamento genérico en el sistema hospitalario.
 * Contiene atributos comunes a todos los medicamentos, como el nombre, descripción,
 * costo y precio de venta. 
 * 
 * Las subclases deben implementar el método {@code calcularPrecioVenta()} para definir
 * la lógica de cálculo del precio de venta específico.
 * 
 * @author Jacobo Velez Valencia
 */
public abstract class Medicamento {
    
    private String nombre;
    private String descripcion;
    private double costo;
    protected double precioVenta;

    /**
     * Constructor que inicializa los atributos del medicamento.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Descripción del medicamento.
     * @param costo Costo de adquisición del medicamento.
     */
    public Medicamento(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta; // Este valor se espera que lo calcule la subclase.
    }

    /**
     * Obtiene el nombre del medicamento.
     * 
     * @return Nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del medicamento.
     * 
     * @param nombre Nuevo nombre del medicamento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del medicamento.
     * 
     * @return Descripción del medicamento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del medicamento.
     * 
     * @param descripcion Nueva descripción del medicamento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio de venta del medicamento.
     * 
     * @return Precio de venta.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio de venta del medicamento.
     * 
     * @param precioVenta Nuevo precio de venta.
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Obtiene el costo de adquisición del medicamento.
     * 
     * @return Costo del medicamento.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el costo del medicamento.
     * 
     * @param costo Nuevo costo del medicamento.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para calcular
     * el precio de venta del medicamento en base al costo y otras variables específicas.
     */
    protected abstract void calcularPrecioVenta();
}
