package ouc.fp.ongmanager;

public class SocioLocal {
	
	private String nombreSocioLocal;
	private String idSocioLocal;
	private String direccion;
	private String email;
	
	
	
	public SocioLocal() {
		super();
	}



	public SocioLocal(String nombreSocioLocal, String idSocioLocal, String direccion, String email) {
		super();
		this.nombreSocioLocal = nombreSocioLocal;
		this.idSocioLocal = idSocioLocal;
		this.direccion = direccion;
		this.email = email;
	}



	public String getNombreSocioLocal() {
		return nombreSocioLocal;
	}



	public void setNombreSocioLocal(String nombreSocioLocal) {
		this.nombreSocioLocal = nombreSocioLocal;
	}



	public String getIdSocioLocal() {
		return idSocioLocal;
	}



	public void setIdSocioLocal(String idSocioLocal) {
		this.idSocioLocal = idSocioLocal;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
