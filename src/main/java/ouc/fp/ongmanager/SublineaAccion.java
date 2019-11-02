package ouc.fp.ongmanager;

/**
 * Esta clase representa a las diferentes sublineas de accion
 * que tiene cada linea de accion de la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class SublineaAccion {
	
	// CAMPOS
	
	private String nombreSublinea;
	private String idSublinea;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto SublineaAccion sin inicializar sus campos.
	 */
	public SublineaAccion() {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto SublineaAccion inicializando sus campos.
	 * 
	 * @param nombreSublinea Atributo que guarda el nombre de la sublinea de accion.
	 * @param idSublinea Atributo que guarda el id de la sublinea de accion.
	 */
	public SublineaAccion(String nombreSublinea, String idSublinea) {
		super();
		this.nombreSublinea = nombreSublinea;
		this.idSublinea = idSublinea;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el nombre de la sublinea de accion.
	 * 
	 * @return Nos devuelve el nombre de la sublinea de accion.
	 */
	public String getNombreSublinea() {
		return nombreSublinea;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el nombre de la sublinea de accion.
	 * 
	 * @param nombreSublinea El nombre de la sublinea de accion.
	 */
	public void setNombreSublinea(String nombreSublinea) {
		this.nombreSublinea = nombreSublinea;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el id de la sublinea de accion.
	 * 
	 * @return Nos devuelve el id de la sublinea de accion.
	 */
	public String getIdSublinea() {
		return idSublinea;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el id de la sublinea de accion.
	 * 
	 * @param idSublinea El id de la sublinea de accion.
	 */
	public void setIdSublinea(String idSublinea) {
		this.idSublinea = idSublinea;
	}
	
}
