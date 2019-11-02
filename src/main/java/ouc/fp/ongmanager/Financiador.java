package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Interfaz que implementan todas aquellas clases que pueden aportar
 * ingresos a la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 * 
 */
public interface Financiador {
	
	/**
	 * Metodo que permite hacer una aportacion economica a la ONG.
	 * 
	 * @param listadoIngresos Listado de ingresos de la ONG.
	 */
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos);

}
