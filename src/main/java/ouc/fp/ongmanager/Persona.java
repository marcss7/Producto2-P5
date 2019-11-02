package ouc.fp.ongmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Esta clase representa a todas las personas, sean personal de la ONG, donantes o socios.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
@XmlRootElement(name = "persona")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"id", "nombre", "apellidos", "email", "telefono", "direccion"})
public class Persona {
	
	// CAMPOS
	
	protected String nombre;
	protected String apellidos;
	protected String id;
	protected String email;
	protected int telefono;
	protected String direccion;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Persona sin inicializar sus campos.
	 */
	public Persona() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Persona inicializando sus campos.
	 * 
	 * @param nombre Atributo que guarda el nombre de la persona.
	 * @param apellidos Atributo que guarda los apellidos de la persona.
	 * @param id Atributo que guarda el id de la persona.
	 * @param email Atributo que guarda el email de la persona.
	 * @param telefono Atributo que guarda el telefono de la persona.
	 * @param direccion Atributo que guarda la direccion de la persona.
	 */
	public Persona(String nombre, String apellidos, String id,
			       String email, int telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	
	// MÉTODOS
	
	/**
	 * Metodo accesor de lectura que nos da el nombre de la persona.
	 * 
	 * @return nos devuelve el nombre de la persona. 
	 */
	@XmlElement(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo accesor de escritura que asigna el nombre de la persona.
	 * 
	 * @param nombre El nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo accesor de lectura que nos da los apellidos de la persona.
	 * 
	 * @return Nos devuelve los apellidos de la persona.
	 */
	@XmlElement(name = "apellidos")
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo accesor de escritura que asigna los apellidos de la persona.
	 * 
	 * @param apellidos Los apellidos de la persona.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo accesor de lectura que nos da el id de la persona.
	 * 
	 * @return Nos devuelve el id de la persona.
	 */
	@XmlElement(name = "id")
	public String getId() {
		return id;
	}

	/**
	 * Metodo accesor de escritura que asigna los apellidos de la persona.
	 * 
	 * @param id El id de la persona.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Metodo accesor de lectura que nos da el email de la persona.
	 * 
	 * @return Nos devuelve el email de la persona. 
	 */
	@XmlElement(name = "email")
	public String getEmail() {
		return email;
	}

	/**
	 * Metodo accesor de escritura que asigna el email de la persona.
	 * 
	 * @param email El email de la persona. 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metodo accesor de lectura que nos da el telefono de la persona.
	 * 
	 * @return Nos devuelve el email de la persona.
	 */
	@XmlElement(name = "telefono")
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Metodo accesor de escritura que asigna el telefono de la persona.
	 * 
	 * @param telefono El telefono de la persona.
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo accesor de lectura que nos da la direccion de la persona.
	 * 
	 * @return Nos devuelve la direccion de la persona. 
	 */
	@XmlElement(name = "nombre")
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo accesor de escritura que asigna la direccion de la persona.
	 * 
	 * @param direccion Direccion de la persona.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
