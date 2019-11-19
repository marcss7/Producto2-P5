package ouc.fp.ongmanager;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase que representa cada una de las delegaciones que forman la ONG
 * y que se encuentran repartidas por todo el territorio español.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
@XmlRootElement(name = "delegacion")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"idDelegacion", "nombreDelegacion", "telefono", "direccion", "isSedeCentral", "personalAdscrito", "listadoProyectos"})
public class Delegacion {
	
	// CAMPOS
	private String nombreDelegacion;
	private int idDelegacion;
	private String direccion;
	private String telefono;
	private ArrayList<Personal> personalAdscrito;
	private ArrayList<Proyecto> listadoProyectos;
	private Boolean isSedeCentral;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Delegacion sin iniciar sus campos.
	 */
	public Delegacion() {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto Delegacion inicializando sus campos.
	 * 
	 * @param nombreDelegacion Atributo que guarda el nombre de la delegacion.
	 * @param idDelegacion Atributo que guarda el id de la delegacion. 
	 * @param direccion Atributo que guarda la direccion de la delegacion.
	 * @param telefono Atributo que guarda el telefono de la delegacion.
	 * @param personalAdscrito Atributo que guarda el personal de la delegacion.
	 * @param listadoProyectos Atributo que guarda el listado de proyectos de la delegacion.
	 * @param isSedeCentral Atributo que guarda el id de la sede central a la que pertenece la delegacion. 
	 */
	public Delegacion(String nombreDelegacion, int idDelegacion, String direccion, String telefono,
			ArrayList<Personal> personalAdscrito, ArrayList<Proyecto> listadoProyectos, Boolean isSedeCentral) {
		super();
		this.nombreDelegacion = nombreDelegacion;
		this.idDelegacion = idDelegacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.personalAdscrito = personalAdscrito;
		this.listadoProyectos = listadoProyectos;
		this.isSedeCentral = isSedeCentral;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el nombre de la delegacion.
	 * 
	 * @return nos devuelve el nombre de la delegacion.	 
	 *
	 */
	@XmlElement(name = "nombre")
	public String getNombreDelegacion() {
		return nombreDelegacion;
	}

	/**
	 * Metodo accesor de escritura que asigna el nombre de la delegacion.
	 * 
	 * @param nombreDelegacion nombre de la delegacion.
	 */
	public void setNombreDelegacion(String nombreDelegacion) {
		this.nombreDelegacion = nombreDelegacion;
	}

	/**
	 * Metodo accesor de lectura que nos da el id de la delegacion.
	 * 
	 * @return id de la delegacion.
	 */
	@XmlElement(name = "id")
	public int getIdDelegacion() {
		return idDelegacion;
	}

	/**
	 * Metodo accesor de escritura que asigna la id de la delegacion.
	 * 
	 * @param idDelegacion id de la delegacion
	 */
	public void setIdDelegacion(int idDelegacion) {
		this.idDelegacion = idDelegacion;
	}

	/**
	 * Metodo accesor de lectura que nos da la direccion de la delegacion.
	 * 
	 * @return la direccion de la delegacion.
	 */
	@XmlElement(name = "direccion")
	public String getDireccion() {
		return direccion;
	}

	/**
	* Metodo accesor de escitura que asigna la direccion de la delegacion.
	* 
	* @param direccion la direccion de la delegacion.
	*/
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 *  Metodo accesor de lectura que nos da el telefono de la delegacion.
	 *  
	 * @return el telefono de la delegacion. 
	 */
	@XmlElement(name = "telefono")
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo accesor de escitura que asigna el telefono de la delegacion.
	 * 
	 * @param telefono telefono de la delegacion.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo accesor de lectura que nos da el personal de la delegacion.
	 * 
	 * @return la lista de personal que pertenece a la delegacion.
	 */
	@XmlElement(name = "personal")
	public ArrayList<Personal> getPersonalAdscrito() {
		return personalAdscrito;
	}

	/**
	 * Metodo accesor de escitura que asigna el personal de la delegacion. 
	 * 
	 * @param personalAdscrito lista del personal de la delegacion.
	 */
	public void setPersonalAdscrito(ArrayList<Personal> personalAdscrito) {
		this.personalAdscrito = personalAdscrito;
	}

	/**
	 * Metodo accesor de lectura que nos da el listado de proyectos de la delegacion.
	 * 
	 * @return el listado de proyectos de la delegacion. 
	 */
	@XmlElement(name = "proyectos")
	public ArrayList<Proyecto> getListadoProyectos() {
		return listadoProyectos;
	}

	/**
	 * Metodo accesor de escritura que asigna el listado de proyectos de la delegacion.
	 * 
	 * @param listadoProyectos Listado de proyectos de la delegacion. 
	 */
	public void setListadoProyectos(ArrayList<Proyecto> listadoProyectos) {
		this.listadoProyectos = listadoProyectos;
	}

    /**
     * Metodo accesor de lectura que nos dice si una delegacion es sede central.
     * 
     * @return True si es sede central, false si no lo es.
     */
	@XmlElement(name = "isSedeCentral")
	public Boolean getIsSedeCentral() {
		return isSedeCentral;
	}

	/**
	 * Metodo accesor de escritura que asigna a una delegacion el rol de sede central.
	 * 
	 * @param isSedeCentral True si es la sede central, false si no lo es.
	 */
	public void setIsSedeCentral(Boolean isSedeCentral) {
		this.isSedeCentral = isSedeCentral;
	}
	
	/**
     * Crea una cadena de caracteres con los datos de la sede.
     * 
     * @return Cadena con los datos de la sede.
     */
	 public String toString() {
		 if (isSedeCentral) {
			 return this.nombreDelegacion + " (SEDE CENTRAL ID - " + this.idDelegacion + ")";
		 } else {
			 return this.nombreDelegacion + " (ID - " + this.idDelegacion + ")";
		 }
	 }

}
