package ouc.fp.ongmanager;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String id;
	protected String email;
	protected int telefono;
	protected String direccion;
	
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, String id, String email, int telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	

}
