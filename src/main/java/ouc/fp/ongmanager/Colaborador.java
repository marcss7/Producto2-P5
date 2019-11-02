package ouc.fp.ongmanager;

import java.util.Date;

/**
 * Clase que representa a aquellas personas que se ofrecen a participar de manera puntual en una actividad.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 * 
 */
public class Colaborador extends Personal {
	
	// CAMPOS
	private String actividad;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Colaborador sin iniciar sus campos.
	 */
	public Colaborador() {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto Colaborador inicializando sus campos.
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
	 * @param actividad Atributo que guarda la actividad en la que colabora la persona. 
	 */
	public Colaborador(String nombre, String apellidos, String id, String email,
			           String telefono, String direccion, Delegacion delegacionAsignada,
			           Date antiguedad, ListadoProyectos proyectosAsignados, String actividad) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.actividad = actividad;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da la actividad en la que participa el colaborador.
	 * 
	 * @return Nos devuelve la actividad en la que participa.
	 */
	public String getActividad() {
		return actividad;
	}


	/**
	 * Metodo accesor de escritura que asigna la actividad en la que participa el colaborador.
	 * 
	 * @param actividad Actividad en la que participa. 
	 */
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	
}
