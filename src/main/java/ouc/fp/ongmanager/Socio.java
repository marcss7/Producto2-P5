package ouc.fp.ongmanager;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "socio")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Socio extends Persona implements Financiador{
	
	private String idSocio;
	private TipoAportacion periodicidadCuota;
	
	
	public Socio() {
		super();
	}


	public Socio(String nombre, String apellidos, String id, String email, int telefono, String direccion, String idSocio, TipoAportacion periodicidadCuota) {
		super(nombre, apellidos, id, email, telefono, direccion);
		this.idSocio = idSocio;
		this.periodicidadCuota = periodicidadCuota;
	}

	@XmlElement(name = "idSocio")
	public String getIdSocio() {
		return idSocio;
	}


	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}


	public TipoAportacion getPeriodicidadCuota() {
		return periodicidadCuota;
	}


	public void setPeriodicidadCuota(TipoAportacion periodicidadCuota) {
		this.periodicidadCuota = periodicidadCuota;
	}


	@Override
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellidos + " (ID - " + this.id + ")";
	}
	

}
