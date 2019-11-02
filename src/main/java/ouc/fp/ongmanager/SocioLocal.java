package ouc.fp.ongmanager;

/**
 * Esta clase representa a las organizaciones locales que colaboran con los 
 * proyectos de la ONG  en las diferentes localizaciones.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class SocioLocal {
	
	//CAMPOS
	
	private String nombreSocioLocal;
	private String idSocioLocal;
	private String direccion;
	private String email;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto SocioLocal sin inicializar sus campos.
	 */
	public SocioLocal() {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto SocioLocal inicializando sus campos.
	 * 
	 * @param nombreSocioLocal Atributo que guarda el nombre del socio local.
	 * @param idSocioLocal Atributo que guarda el id del socio local.
	 * @param direccion Atributo que guarda la direccion del socio local.
	 * @param email Atributo que guarda el email del socio local.
	 */
	public SocioLocal(String nombreSocioLocal, String idSocioLocal, String direccion, String email) {
		super();
		this.nombreSocioLocal = nombreSocioLocal;
		this.idSocioLocal = idSocioLocal;
		this.direccion = direccion;
		this.email = email;
	}


	/**
	 * Metodo accesor de lectura que nos da el nombre del socio Local.
	 * 
	 * @return Nos devuelve el nombre del socio local.
	 */
	public String getNombreSocioLocal() {
		return nombreSocioLocal;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el nombre del socio local.
	 * 
	 * @param nombreSocioLocal El id del socio local.
	 */
	public void setNombreSocioLocal(String nombreSocioLocal) {
		this.nombreSocioLocal = nombreSocioLocal;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el id del socio Local.
	 * 
	 * @return Nos devuelve el id del socio local.
	 */
	public String getIdSocioLocal() {
		return idSocioLocal;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el id del socio Local.
	 * 
	 * @param idSocioLocal El id del socio local.
	 */
	public void setIdSocioLocal(String idSocioLocal) {
		this.idSocioLocal = idSocioLocal;
	}
	
	/**
	 * Metodo accesor de lectura que nos da la direccion del socio Local.
	 * 
	 * @return Nos devuelve la direccion del socio local.
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la direccion del socio Local.
	 * 
	 * @param direccion la direccion del socio local.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el email del socio Local.
	 * 
	 * @return Nos devuelve el email del socio local.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el email del socio Local.
	 * 
	 * @param email El email del socio local.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
