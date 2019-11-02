package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Esta clase representa a las lineas de actuacion prioritaria de los proyectos que se realizan en 
 * todos los paises donde la organizacion tiene representacion.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class LineaAccion {
	
	// CAMPOS
	
	private String nombreLinea;
	private String idLinea;
	private ArrayList<SublineaAccion> listadoSublineas;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto LineaAccion sin inicializar sus campos. 
	 */
	public LineaAccion() {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto LineaAccion inicializando sus campos.
	 * 
	 * @param nombreLinea Atributo que guarda el nombre de la linea de accion.
	 * @param idLinea Atributo que guarda el id de la linea de accion.
	 * @param listadoSublineas Atributo que guarda el listado de las sublineas de la linea de accion.
	 */
	public LineaAccion(String nombreLinea, String idLinea, ArrayList<SublineaAccion> listadoSublineas) {
		super();
		this.nombreLinea = nombreLinea;
		this.idLinea = idLinea;
		this.listadoSublineas = listadoSublineas;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el nombre de la linea de accion.
	 * 
	 * @return nos devuelve el nombre de la linea de accion.
	 */
	public String getNombreLinea() {
		return nombreLinea;
	}

	/**
	 * Metodo accesor de escritura que asigna el nombre de la linea de accion.
	 * 
	 * @param nombreLinea el nombre de la linea de accion.
	 */
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el id de la linea de accion.
	 * 
	 * @return nos devuelve el id de la linea de accion.
	 */
	public String getIdLinea() {
		return idLinea;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el id de la linea de accion.
	 * 
	 * @param idLinea id de la linea de accion.
	 */
	public void setIdLinea(String idLinea) {
		this.idLinea = idLinea;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el listado de las sublineas de accion de la linea de accion.
	 * 
	 * @return nos devuelve el listado de las sublineas de accion.
	 */
	public ArrayList<SublineaAccion> getListadoSublineas() {
		return listadoSublineas;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el listado de las sublineas de accion de la linea de accion.
	 * 
	 * @param listadoSublineas listado de las sublineas de accion.
	 */
	public void setListadoSublineas(ArrayList<SublineaAccion> listadoSublineas) {
		this.listadoSublineas = listadoSublineas;
	}

}
