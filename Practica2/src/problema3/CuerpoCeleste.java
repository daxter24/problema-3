/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package problema3;

import problema3.Ubicación;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author HP
 */
public class CuerpoCeleste {
	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property localizaciones.
	 */
	private Ubicació
	n localizaciones = null;

	/**
	 * Description of the property composicion.
	 */
	private String composicion = "";

	// Start of user code (user defined attributes for CuerpoCeleste)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}

	/**
	 * Description of the method desplazamiento.
	 * @param i 
	 * @param j 
	 * @return 
	 */
	public boolean desplazamiento(int i, int j) {
		// Start of user code for method desplazamiento
		boolean desplazamiento = false;
		return desplazamiento;
		// End of user code
	}

	// Start of user code (user defined methods for CuerpoCeleste)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public Ubicación getLocalizaciones() {
		return this.localizaciones;
	}

	/**
	 * Sets a value to attribute localizaciones. 
	 * @param newLocalizaciones 
	 */
	public void setLocalizaciones(Ubicación newLocalizaciones) {
	    this.localizaciones = newLocalizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}

	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

}
