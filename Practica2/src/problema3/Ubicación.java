/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package problema3;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Ubicación.
 * 
 * @author HP
 */
public class Ubicación
{
	/**
	 * Description of the property longitud.
	 */
	private float longitud = 0F;

	/**
	 * Description of the property latitud.
	 */
	private float latitud = 0F;

	/**
	 * Description of the property periodo.
	 */
	private String periodo = "";

	/**
	 * Description of the property distancia.
	 */
	private float distancia = 0F;

	// Start of user code (user defined attributes for Ubicación)

	// End of user code

	/**
	 * The constructor.
	 */
	public Ubicación() {
		// Start of user code constructor for Ubicación)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Ubicación)

	// End of user code
	/**
	 * Returns longitud.
	 * @return longitud 
	 */
	public float getLongitud() {
		return this.longitud;
	}

	/**
	 * Sets a value to attribute longitud. 
	 * @param newLongitud 
	 */
	public void setLongitud(float newLongitud) {
		this.longitud = newLongitud;
	}

	/**
	 * Returns latitud.
	 * @return latitud 
	 */
	public float getLatitud() {
		return this.latitud;
	}

	/**
	 * Sets a value to attribute latitud. 
	 * @param newLatitud 
	 */
	public void setLatitud(float newLatitud) {
		this.latitud = newLatitud;
	}

	/**
	 * Returns periodo.
	 * @return periodo 
	 */
	public String getPeriodo() {
		return this.periodo;
	}

	/**
	 * Sets a value to attribute periodo. 
	 * @param newPeriodo 
	 */
	public void setPeriodo(String newPeriodo) {
		this.periodo = newPeriodo;
	}

	/**
	 * Returns distancia.
	 * @return distancia 
	 */
	public float getDistancia() {
		return this.distancia;
	}

	/**
	 * Sets a value to attribute distancia. 
	 * @param newDistancia 
	 */
	public void setDistancia(float newDistancia) {
		this.distancia = newDistancia;
	}

}
