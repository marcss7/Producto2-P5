package ouc.fp.ongmanager;

import java.util.ArrayList;

public class Delegacion {
	
	private String nombreSucursal;
	private String idSucursal;
	private String direccion;
	private int telefono;
	private ArrayList<Personal> personalAdscrito;
	private ArrayList<Proyecto> listadoProyectos;
	private Boolean isSedeCentral;
	
	
	
	public Delegacion() {
		super();
	}



	public Delegacion(String nombreSucursal, String idSucursal, String direccion, int telefono,
			ArrayList<Personal> personalAdscrito, ArrayList<Proyecto> listadoProyectos, Boolean isSedeCentral) {
		super();
		this.nombreSucursal = nombreSucursal;
		this.idSucursal = idSucursal;
		this.direccion = direccion;
		this.telefono = telefono;
		this.personalAdscrito = personalAdscrito;
		this.listadoProyectos = listadoProyectos;
		this.isSedeCentral = isSedeCentral;
	}



	public String getNombreSucursal() {
		return nombreSucursal;
	}



	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}



	public String getIdSucursal() {
		return idSucursal;
	}



	public void setIdSucursal(String idSucursal) {
		this.idSucursal = idSucursal;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public ArrayList<Personal> getPersonalAdscrito() {
		return personalAdscrito;
	}



	public void setPersonalAdscrito(ArrayList<Personal> personalAdscrito) {
		this.personalAdscrito = personalAdscrito;
	}



	public ArrayList<Proyecto> getListadoProyectos() {
		return listadoProyectos;
	}



	public void setListadoProyectos(ArrayList<Proyecto> listadoProyectos) {
		this.listadoProyectos = listadoProyectos;
	}



	public Boolean getIsSedeCentral() {
		return isSedeCentral;
	}



	public void setIsSedeCentral(Boolean isSedeCentral) {
		this.isSedeCentral = isSedeCentral;
	}
	
	
	

}
