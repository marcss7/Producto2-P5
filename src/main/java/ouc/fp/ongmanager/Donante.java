package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Esta clase representa a las personas físicas que realizan donaciones puntuales a la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class Donante extends Persona implements Financiador {
	
	// CAMPOS
	
	private String idDonante;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Donante sin iniciar sus campos.
	 */
	public Donante() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Donante inicializando sus campos.
	 * 
	 * @param nombre Atributo que guarda el nombre de la persona.
	 * @param apellidos Atributo que guarda los apellidos de la persona.
	 * @param id Atributo que guarda el id de la persona.
	 * @param email Atributo que guarda el email de la persona.
	 * @param telefono Atributo que guarda el telefono de la persona.
	 * @param direccion Atributo que guarda la direccion de la persona.
	 * @param idDonante Atributo que guarda el id de donante de la persona. 
	 * @param periodicidadCuota Atributo que guarda la periodicidad de la cuota de la persona.
	 */
	public Donante(String nombre, String apellidos, String id, String email,
			       int telefono, String direccion, TipoAportacion periodicidadCuota, String idDonante) {
		super(nombre, apellidos, id, email, telefono, direccion);
		this.idDonante = idDonante;
	}

	
	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el id del donante.
	 * 
	 * @return Nos devuelve el id del donante.
	 */
	public String getIdDonante() {
		return idDonante;
	}

	/**
	 * Metodo accesor de escritura que asigna el id del donante.
	 * 
	 * @param idDonante Id del donante. 
	 */
	public void setIdDonante(String idDonante) {
		this.idDonante = idDonante;
	}
	
	/**
	 * Metodo que permite al donante hacer una aportacion a la ONG.
	 * 
	 * @param listadoIngresos Listado de ingresos de la ONG.
	 */
	@Override
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos) {
		// TODO Auto-generated method stub
		
	}

}
