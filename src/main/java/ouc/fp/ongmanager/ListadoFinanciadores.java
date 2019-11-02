package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Esta clase representa al listado de los financiadores de los proyectos de la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class ListadoFinanciadores {

	// CAMPOS
	
	private ArrayList<Financiador> listadoFinanciadores;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que llama a un nuevo objeto ListadoFinanciadores sin inicializar sus campos.
	 */
	public ListadoFinanciadores() {
		super();
	}
	
	
	/**
	 * Constructor que llama a un nuevo objeto listadoFinanciadores inicializando sus campos.
	 * 
	 * @param listadoFinanciadores
	 */
	public ListadoFinanciadores(ArrayList<Financiador> listadoFinanciadores) {
		super();
		this.listadoFinanciadores = listadoFinanciadores;
	}

	
	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el listado de financiadores.
	 * 
	 * @return Nos devuelve el listado de financiadores. 
	 */
	public ArrayList<Financiador> getListadoFinanciadores() {
		return listadoFinanciadores;
	}

	/**
	 * Metodo accesor de escritura que asigna el listado de financiadores.
	 * @param listadoFinanciadores el listado de financiadores.
	 */
	public void setListadoFinanciador(ArrayList<Financiador> listadoFinanciadores) {
		this.listadoFinanciadores = listadoFinanciadores;
	}
	
	
}

