package ouc.fp.ongmanager;


/**
 * Esta clase representa a la ONG que conforma las diferentes delegaciones.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class Ong {
	
	// CAMPOS
	
	private String nombreOng;
	private ListadoDelegaciones listadoDelegaciones;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Ong sin inicializar sus campos. 
	 */
	public Ong() {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto Ong inicializando sus campos.
	 * 
	 * @param nombreOng Atributo que guarda el nombre de la ONG.
	 * @param listadoDelegaciones Atributo que guarda el listado de delegaciones que pertenecen a la ONG.
	 */
	public Ong(String nombreOng, ListadoDelegaciones listadoDelegaciones) {
		super();
		this.nombreOng = nombreOng;
		this.listadoDelegaciones = listadoDelegaciones;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el nombre de la ONG.
	 * 
	 * @return Nos devuelve el nombre de la ONG.
	 */
	public String getNombreOng() {
		return nombreOng;
	}


	/**
	 * Metodo accesor de escritura que asigna el nombre de la ONG.
	 *  
	 * @param nombreOng El nombre de la ONG.
	 */
	public void setNombreOng(String nombreOng) {
		this.nombreOng = nombreOng;
	}


	/**
	 * Metodo accesor de lectura que nos da el listado de delegaciones que pertenecen a la ONG.
	 *  
	 * @return nos devuelve el lista de delegaciones.
	 */
	public ListadoDelegaciones getListadoDelegaciones() {
		return listadoDelegaciones;
	}


	/**
	 * Metodo accesor de escritura que asigna el listado de delegaciones que pertenecen a la ONG.
	 * 
	 * @param listadoDelegaciones El listado de las delegaciones.
	 */
	public void setListadoDelegaciones(ListadoDelegaciones listadoDelegaciones) {
		this.listadoDelegaciones = listadoDelegaciones;
	}
	
}
