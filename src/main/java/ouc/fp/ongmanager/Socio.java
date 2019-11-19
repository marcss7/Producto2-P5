package ouc.fp.ongmanager;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Esta clase representa a los socios de la ONG que pagan una cuota
 * periódica la cual puede ser mensual, trimestral o anual.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
@XmlRootElement(name = "socio")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"idSocio", "periodicidadCuota", "importeCuota"})
public class Socio extends Persona implements Financiador{
	
	// CAMPOS
	private int idSocio;
	private TipoAportacion periodicidadCuota;
	private float importeCuota;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Socio sin inicializar sus campos.
	 */
	public Socio() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Socio icializando sus campos.
	 * 
	 * @param nombre Atributo que guarda el nombre de la persona.
	 * @param apellidos Atributo que guarda los apellidos de la persona.
	 * @param id Atributo que guarda el id de la persona.
	 * @param email Atributo que guarda el email de la persona.
	 * @param telefono Atributo que guarda el telefono de la persona.
	 * @param direccion Atributo que guarda la direccion de la persona.
	 * @param idSocio Atributo que guarda el id de la persona.
	 * @param periodicidadCuota Atributo que guarda la periodicidad de la cuota de la persona.
	 * @param importeCuota Atributo que guarda el importe de la cuota de la persona.
	 */
	public Socio(String nombre, String apellidos, String id, String email,
			     String telefono, String direccion, int idSocio,
			     TipoAportacion periodicidadCuota, float importeCuota) {
		super(nombre, apellidos, id, email, telefono, direccion);
		this.idSocio = idSocio;
		this.periodicidadCuota = periodicidadCuota;
		this.importeCuota = importeCuota;
	}

	
	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el id del socio.
	 * 
	 * @return Nos devuelve el id del socio.
	 */
	@XmlElement(name = "idSocio")
	public int getIdSocio() {
		return idSocio;
	}


	/**
	 * Metodo accesor de escritura que asigna el id del socio.
	 * 
	 * @param idSocio El id del socio
	 */
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

	/**
	 * Metodo accesor de lectura que nos da la periodicidad de la cuota del socio.
	 * 
	 * @return Nos devuelve la periodicidad de la cuota.
	 */
	@XmlElement(name = "periodicidadCuota")
	public TipoAportacion getPeriodicidadCuota() {
		return periodicidadCuota;
	}

	/**
	 * Metodo accesor de escritura que asigna la periodicidad de la cuota del socio.
	 * 
	 * @param periodicidadCuota La periodicidad de la cuota.
	 */
	public void setPeriodicidadCuota(TipoAportacion periodicidadCuota) {
		this.periodicidadCuota = periodicidadCuota;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el imporye de la cuota del socio.
	 * 
	 * @return Nos devuelve el importe de la cuota.
	 */
	@XmlElement(name = "importeCuota")
	public float getImporteCuota() {
		return importeCuota;
	}

	/**
	 * Metodo accesor de escritura que asigna el importe de la cuota del socio.
	 * 
	 * @param importe_cuota El importe de la cuota.
	 */
	public void setImporteCuota(float importeCuota) {
		this.importeCuota = importeCuota;
	}


	/**
	 * Metodo que permite al socio hacer una aportacion a la ONG.
	 * 
	 * @param listadoIngresos Listado de ingresos de la ONG.
	 */
	@Override
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos) {
		// TODO Auto-generated method stub
		
	}
	
	/**
     * Crea una cadena de caracteres con los datos del socio.
     * 
     * @return Cadena con los datos del socio.
     */
	@Override
	public String toString() {
		return this.nombre + " " + this.apellidos + " (ID - " + this.idSocio + ")";
	}

}
