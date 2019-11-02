package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase representa a cada uno de los proyectos que realiza la ONG.
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class Proyecto {
	
	// CAMPOS
	
	private String codigoProyeto;
	private String nombreProyecto;
	private String pais;
	private String localizacion;
	private LineaAccion lineaAccion;
	private SublineaAccion sublineaAccion;
	private Date fechaInicio;
	private Date fechaFin;
	private ArrayList<SocioLocal> listadoSocios;
	private ListadoFinanciadores listadoFinanciadores;
	private float importeFinanciacion;
	private ArrayList<String> accionesARealizar;
	private ArrayList<Personal> personalAsignado;
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Proyecto sin inicializar sus campos.
	 */
	public Proyecto() {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Proyecto inicializando sus campos.
	 * 
	 * @param codigoProyeto Atributo que guarda el codigo del proyecto.
	 * @param nombreProyecto Atributo que guarda el nombre del proyecto.
	 * @param pais Atributo que guarda el pais donde se realiza el proyecto.
	 * @param localizacion Atributo que guarda la localizacion del proyecto.
	 * @param lineaAccion Atributo que guarda la linea de accion del proyecto.
	 * @param sublineaAccion Atributo que guarda la sublinea de accion del proyecto.
	 * @param fechaInicio Atributo que guarda la fecha de inicio del proyecto.
	 * @param fechaFin Atributo que guarda la fecha de fin del proyecto.
	 * @param listadoSocios Atributo que guarda el listado de socios del proyecto.
	 * @param listadoFinanciadores Atributo que guarda el listado de financiadores del proyecto.
	 * @param importeFinanciacion Atributo que guarda el importe de la financiacion del proyecto.
	 * @param accionesARealizar Atributo que guarda las acciones a realizar del proyecto.
	 * @param personalAsignado Atributo que guarda el personal asignado en el proyecto.
	 */
	public Proyecto(String codigoProyeto, String nombreProyecto, String pais, String localizacion,
			LineaAccion lineaAccion, SublineaAccion sublineaAccion, Date fechaInicio, Date fechaFin,
			ArrayList<SocioLocal> listadoSocios, ListadoFinanciadores listadoFinanciadores, float importeFinanciacion,
			ArrayList<String> accionesARealizar, ArrayList<Personal> personalAsignado) {
		super();
		this.codigoProyeto = codigoProyeto;
		this.nombreProyecto = nombreProyecto;
		this.pais = pais;
		this.localizacion = localizacion;
		this.lineaAccion = lineaAccion;
		this.sublineaAccion = sublineaAccion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.listadoSocios = listadoSocios;
		this.listadoFinanciadores = listadoFinanciadores;
		this.importeFinanciacion = importeFinanciacion;
		this.accionesARealizar = accionesARealizar;
		this.personalAsignado = personalAsignado;
	}


	// METODPS
	/**
	 * Metodo accesor de lectura que nos da el codigo del proyecto.
	 * 
	 * @return Nos devuelve el codigo del proyecto.
	 */
	public String getCodigoProyeto() {
		return codigoProyeto;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el codigo del proyecto.
	 * 
	 * @param codigoProyeto El codigo del proyecto.
	 */
	public void setCodigoProyeto(String codigoProyeto) {
		this.codigoProyeto = codigoProyeto;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el nombre del proyecto.
	 * 
	 * @return Nos devuelve el nombre del proyecto
	 */
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el nombre del proyecto.
	 * 
	 * @param nombreProyecto El nombre del proyecto
	 */
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el pais donde se realiza del proyecto.
	 * 
	 * @return Nos devuelve el pais.
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Metodo accesor de escritura que asigna el pais del proyecto.
	 * 
	 * @param pais El pais del proyecto.
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	/**
	 * Metodo accesor de lectura que nos da la localizacion del proyecto.
	 * 
	 * @return Nos devuelve la localizacion del proyecto.
	 */
	public String getLocalizacion() {
		return localizacion;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la localizacion del proyecto.
	 * 
	 * @param localizacion La localizacion del proyecto.
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	/**
	 * Metodo accesor de lectura que nos da la linea de accion del proyecto.
	 * 
	 * @return Nos devuelve la linea de accion del proyecto.
	 */
	public LineaAccion getLineaAccion() {
		return lineaAccion;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la linea de accion del proyecto.
	 * 
	 * @param lineaAccion La linea de accion del proyecto.
	 */
	public void setLineaAccion(LineaAccion lineaAccion) {
		this.lineaAccion = lineaAccion;
	}
	
	/**
	 * Metodo accesor de lectura que nos la sublinea de accion del proyecto.
	 * 
	 * @return Nos devuelve la sublinea de accion del proyecto.
	 */
	public SublineaAccion getSublineaAccion() {
		return sublineaAccion;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la sublinea de accion del proyecto.
	 * 
	 * @param sublineaAccion La sublinea de accion del proyecto.
	 */
	public void setSublineaAccion(SublineaAccion sublineaAccion) {
		this.sublineaAccion = sublineaAccion;
	}
	
	/**
	 * Metodo accesor de lectura que nos da la fecha de inicio del proyecto.
	 * 
	 * @return Nos devuelve la fecha de inicio. 
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la fecha de inicio del proyecto.
	 * 
	 * @param fechaInicio Fecha en la que se inicia el proyecto.
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	/**
	 * Metodo accesor de lectura que nos da la fecha de fin del proyecto.
	 * 
	 * @return Nos devuelve la fecha de fin de proyecto.
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la fecha de fin del proyecto.
	 * 
	 * @param fechaFin La fecha de fin de proyecto.
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el lista de socios del proyecto.
	 * 
	 * @return Nos devuelve el listado de socios.
	 */
	public ArrayList<SocioLocal> getListadoSocios() {
		return listadoSocios;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el listado de socios del proyecto.
	 * 
	 * @param listadoSocios El listado de socios.
	 */
	public void setListadoSocios(ArrayList<SocioLocal> listadoSocios) {
		this.listadoSocios = listadoSocios;
	}
	
	/**
	 * Metodo accesor de lectura que nos el listado de financiadores del proyecto.
	 * 
	 * @return Nos devuelve el listado de financiadores.
	 */
	public ListadoFinanciadores getListadoFinanciadores() {
		return listadoFinanciadores;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la lista de financiadores del proyecto.
	 * 
	 * @param listadoFinanciadores La lista de financiadores del proyecto.
	 */
	public void setListadoFinanciadores(ListadoFinanciadores listadoFinanciadores) {
		this.listadoFinanciadores = listadoFinanciadores;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el importe de financiacion del proyecto.
	 * 
	 * @return Nos devuelve el importe de financiacion.
	 */
	public float getImporteFinanciacion() {
		return importeFinanciacion;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el importe de financiacion del proyecto.
	 * 
	 * @param importeFinanciacion El importe de financiacion.
	 */
	public void setImporteFinanciacion(float importeFinanciacion) {
		this.importeFinanciacion = importeFinanciacion;
	}
	
	/**
	 * Metodo accesor de lectura que nos da las acciones a realizar del proyecto.
	 * 
	 * @return Nos devuelve las acciones a realizar.
	 */
	public ArrayList<String> getAccionesARealizar() {
		return accionesARealizar;
	}
	
	/**
	 * Metodo accesor de escritura que asigna las acciones a realizar del proyecto.
	 * 
	 * @param accionesARealizar Las acciones a realizar.
	 */
	public void setAccionesARealizar(ArrayList<String> accionesARealizar) {
		this.accionesARealizar = accionesARealizar;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el personal asignado en el proyecto.
	 * 
	 * @return Nos devuelve el personal asignado.
	 */
	public ArrayList<Personal> getPersonalAsignado() {
		return personalAsignado;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el personal asignado en el proyecto.
	 * 
	 * @param personalAsignado El personal asignado.
	 */
	public void setPersonalAsignado(ArrayList<Personal> personalAsignado) {
		this.personalAsignado = personalAsignado;
	}
	
}
