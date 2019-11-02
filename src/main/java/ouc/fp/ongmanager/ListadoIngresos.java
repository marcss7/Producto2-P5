package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Esta clase representa el conjunto de todos los ingresos que se han realizado en la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class ListadoIngresos {
	
	// CAMPOS
	
	private ArrayList<Ingreso> listadoIngresos;

	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto ListadoIngresos sin inicializar sus campos. 
	 */
	public ListadoIngresos() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto ListadoIngresos inicializando sus campos.
	 *  
	 * @param listadoIngresos Atributo que guarda el listado de los ingresos realizados.
	 */
	public ListadoIngresos(ArrayList<Ingreso> listadoIngresos) {
		super();
		this.listadoIngresos = listadoIngresos;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el listado de los ingresos realizados.
	 * 
	 * @return Nos devuelve el listado de los ingresos realizados.
	 */
	public ArrayList<Ingreso> getListadoIngresos() {
		return listadoIngresos;
	}

	/**
	 * Metodo accesor de escritura que asigna el listado de los ingresos realizados.
	 * 
	 * @param listadoIngresos El listado de los ingresos realizados.
	 */
	public void setListadoIngresos(ArrayList<Ingreso> listadoIngresos) {
		this.listadoIngresos = listadoIngresos;
	}
	
}
