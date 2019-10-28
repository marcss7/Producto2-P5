package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
	
	private String codigoProyeto;
	private String nombreProyecto;
	private String pais;
	private String localizacion;
	private LineaAccion lineaAccion;
	private SublineaAccion sublineaAccion;
	private Date fechaInicio;
	private Date fechaFin;
	private ArrayList<SocioLocal> listadoSocios;
	private ArrayList<Financiador> listadoFinanciadores;
	private float importeFinanciacion;
	private ArrayList<String> accionesARealizar;
	private ArrayList<Personal> personalAsignado;
	
	
	
	
	
	public Proyecto() {
		super();
	}





	public Proyecto(String codigoProyeto, String nombreProyecto, String pais, String localizacion,
			LineaAccion lineaAccion, SublineaAccion sublineaAccion, Date fechaInicio, Date fechaFin,
			ArrayList<SocioLocal> listadoSocios, ArrayList<Financiador> listadoFinanciadores, float importeFinanciacion,
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





	public String getCodigoProyeto() {
		return codigoProyeto;
	}





	public void setCodigoProyeto(String codigoProyeto) {
		this.codigoProyeto = codigoProyeto;
	}





	public String getNombreProyecto() {
		return nombreProyecto;
	}





	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}





	public String getPais() {
		return pais;
	}





	public void setPais(String pais) {
		this.pais = pais;
	}





	public String getLocalizacion() {
		return localizacion;
	}





	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}





	public LineaAccion getLineaAccion() {
		return lineaAccion;
	}





	public void setLineaAccion(LineaAccion lineaAccion) {
		this.lineaAccion = lineaAccion;
	}





	public SublineaAccion getSublineaAccion() {
		return sublineaAccion;
	}





	public void setSublineaAccion(SublineaAccion sublineaAccion) {
		this.sublineaAccion = sublineaAccion;
	}





	public Date getFechaInicio() {
		return fechaInicio;
	}





	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}





	public Date getFechaFin() {
		return fechaFin;
	}





	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}





	public ArrayList<SocioLocal> getListadoSocios() {
		return listadoSocios;
	}





	public void setListadoSocios(ArrayList<SocioLocal> listadoSocios) {
		this.listadoSocios = listadoSocios;
	}





	public ArrayList<Financiador> getListadoFinanciadores() {
		return listadoFinanciadores;
	}





	public void setListadoFinanciadores(ArrayList<Financiador> listadoFinanciadores) {
		this.listadoFinanciadores = listadoFinanciadores;
	}





	public float getImporteFinanciacion() {
		return importeFinanciacion;
	}





	public void setImporteFinanciacion(float importeFinanciacion) {
		this.importeFinanciacion = importeFinanciacion;
	}





	public ArrayList<String> getAccionesARealizar() {
		return accionesARealizar;
	}





	public void setAccionesARealizar(ArrayList<String> accionesARealizar) {
		this.accionesARealizar = accionesARealizar;
	}





	public ArrayList<Personal> getPersonalAsignado() {
		return personalAsignado;
	}





	public void setPersonalAsignado(ArrayList<Personal> personalAsignado) {
		this.personalAsignado = personalAsignado;
	}
	
	
	
}
