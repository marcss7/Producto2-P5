package ouc.fp.ongmanager;

import java.util.Date;

/**
 * Esta clase representa a cada una de las persona que se comprometen de una
 * manera estable y continuada en los equipos y proyectos de trabajo de la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 * 
 */
public class Voluntario extends Personal {
	
	// CAMPOS
	
	private String disponibilidad;
	private Boolean isInternacional;
	
	
	// CONSTRUCTORES
	/**
	 * Constructor que crea un nuevo objeto Voluntario sin iniciar sus campos.
	 */
	public Voluntario() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Voluntario inicializando sus campos.
	 * 
	 * @param nombre Atributo que guarda el nombre de la persona.
	 * @param apellidos Atributo que guarda los apellidos de la persona.
	 * @param id Atributo que guarda el id de la persona.
	 * @param email Atributo que guarda el email de la persona.
	 * @param telefono Atributo que guarda el telefono de la persona.
	 * @param direccion Atributo que guarda la direccion de la persona.
	 * @param delegacionAsignada Atributo que guarda el nombre de la delegacion asignada a la persona.
	 * @param antiguedad Atributo que guarda la antiguedad en la ong de la persona.
	 * @param proyectosAsignados Atributo que guarda los proyectos asignados a la persona.
	 * @param disponibilidad Atributo que guarda la disponibilidad de la persona.
	 * @param isInternacional Atributo que guarda si la persona colabora internacionalmente o no.
	 */
	public Voluntario(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ListadoProyectos proyectosAsignados, String disponibilidad, Boolean isInternacional) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.disponibilidad = disponibilidad;
		this.isInternacional = isInternacional;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da la disponibilidad del voluntario.
	 * 
	 * @return Nos devuelve la disponibilidad.
	 */
	public String getDisponibilidad() {
		return disponibilidad;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la disponibilidad del voluntario.
	 * 
	 * @param disponibilidad Nos devuelve la disponibilidad que tiene el voluntario.
	 */
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	/**
	 * Metodo accesor de lectura que nos indica si el voluntario es internacional o no.
	 * 
	 * @return Nos devuelve true si el voluntario es internacional, false si no lo es.
	 */
	public Boolean getIsInternacional() {
		return isInternacional;
	}
	
	/**
	 * Metodo accesor de escritura que asigna si el voluntario es internacional.
	 * 
	 * @param isInternacional True si es internacional, false si no lo es.
	 */
	public void setIsInternacional(Boolean isInternacional) {
		this.isInternacional = isInternacional;
	}
	
}
