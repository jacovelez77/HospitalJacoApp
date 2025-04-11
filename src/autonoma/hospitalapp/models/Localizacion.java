package autonoma.hospitalapp.models;

/**
 * Representa una localización geográfica basada en coordenadas de longitud y latitud.
 * Esta clase puede ser utilizada para identificar la ubicación de un hospital u otra entidad relacionada.
 * 
 * Autor: Jacobo Velez Valencia
 */
public class Localizacion {

    private double longitud;
    private double latitud;

    /**
     * Constructor que permite crear una localización con coordenadas específicas.
     * 
     * @param longitud Coordenada de longitud (este-oeste)
     * @param latitud Coordenada de latitud (norte-sur)
     */
    public Localizacion(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    /**
     * Constructor por defecto no soportado actualmente.
     * Genera una excepción si se intenta usar.
     */
    Localizacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Obtiene la longitud de la localización.
     * 
     * @return la longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Establece una nueva longitud para la localización.
     * 
     * @param longitud la nueva longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene la latitud de la localización.
     * 
     * @return la latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Establece una nueva latitud para la localización.
     * 
     * @param latitud la nueva latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
