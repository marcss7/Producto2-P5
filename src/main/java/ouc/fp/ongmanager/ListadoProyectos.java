package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Esta clase que representa el listado de proyectos que se estan realizando en la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class ListadoProyectos {

	// CAMPOS
	
	private ArrayList<Proyecto> listadoProyectos;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto ListadoProyectos sin inicializar sus campos. 
	 */
	public ListadoProyectos() {
		super();
	}

	/**
	 *  Constructor que crea un nuevo objeto ListadoProyectos inicializando sus campos.
	 *  
	 * @param listadoProyectos El listado de proyectos que se estan realizando en la ONG.
	 */
	public ListadoProyectos(ArrayList<Proyecto> listadoProyectos) {
		super();
		this.listadoProyectos = listadoProyectos;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el listado de los
	 * proyectos que se estan realizando actualmente en la ONG.
	 * @return nos devuelve el listado de los proyectos que se estan realizando.
	 */
	public ArrayList<Proyecto> getListadoProyectos() {
		return listadoProyectos;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el listado de los
	 * proyectos que se estan realizando actualmente en la ONG.
	 * 
	 * @param listadoProyectos El listado de los proyectos que se estan realizando.
	 */
	public void setListadoProyectos(ArrayList<Proyecto> listadoProyectos) {
		this.listadoProyectos = listadoProyectos;
	}
	
}
