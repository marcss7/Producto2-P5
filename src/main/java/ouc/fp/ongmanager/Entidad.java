package ouc.fp.ongmanager;

import java.util.ArrayList;

/**
 * Clase que Representa a las empresas, instituciones y organizaciones públicas
 * o privadas que realizan aportaciones puntuales a la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 * 
 */
public class Entidad implements Financiador {
	
	// CAMPOS
	
	private String nombreEntidad;
	private String cifEntidad;
	private Boolean isPrivada;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Entidad sin inicializar sus campos.
	 */
	public Entidad() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Entidad inicializando sus campos.
	 * 
	 * @param nombreEntidad Atributo que guarda el nombre de la entidad. 
	 * @param cifEntidad Atributo que guarda el cif de la entidad.
	 * @param isPrivada Atributo que guarda si la entidad es privada o no.
	 */
	public Entidad(String nombreEntidad, String cifEntidad, Boolean isPrivada) {
		super();
		this.nombreEntidad = nombreEntidad;
		this.cifEntidad = cifEntidad;
		this.isPrivada = isPrivada;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el nombre de la entidad.
	 * 
	 * @return Nos devuelve el nombre de la entidad.
	 */
	public String getNombreEntidad() {
		return nombreEntidad;
	}

	/**
	 * Metodo accesor de escritura que asigna el nombre de la entidad.
	 * 
	 * @param nombreEntidad Nombre de la entidad.
	 */
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	/**
	 * Metodo accesor de lectura que nos da el cif de la entidad.
	 * 
	 * @return Nos devuelve el cif de la entidad.
	 */
	public String getCifEntidad() {
		return cifEntidad;
	}

	/**
	 * Metodo accesor de escritura que asigna el cif de la entidad.
	 * 
	 * @param cifEntidad el cif de la entidad.
	 */
	public void setCifEntidad(String cifEntidad) {
		this.cifEntidad = cifEntidad;
	}

	/**
	 * Metodo accesor de lectura que nos dice si una entidad es privada o no.
	 * 
	 * @return Nos devuelve true si es privada, false si no lo es.
	 */
	public Boolean getIsPrivada() {
		return isPrivada;
	}

	/**
	 *Metodo accesor de escritura que establece si una entidad es privada o no.
	 *
	 * @param isPrivada True si la entidad es privada, false si no lo es.
	 */
	public void setIsPrivada(Boolean isPrivada) {
		this.isPrivada = isPrivada;
	}

	/**
	 * Metodo que permite a la entidad hacer una aportacion a la ONG.
	 * 
	 * @param listadoIngresos Listado de ingresos de la ONG.
	 */
	@Override
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos) {
		// TODO Auto-generated method stub
		
	}

}
