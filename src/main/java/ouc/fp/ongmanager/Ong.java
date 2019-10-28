package ouc.fp.ongmanager;

import java.util.ArrayList;

public class Ong {
	
	private String nombreOng;
	private ArrayList<Delegacion> listadoDelegaciones;
	
	
	
	public Ong() {
		super();
	}



	public Ong(String nombreOng, ArrayList<Delegacion> listadoDelegaciones) {
		super();
		this.nombreOng = nombreOng;
		this.listadoDelegaciones = listadoDelegaciones;
	}



	public String getNombreOng() {
		return nombreOng;
	}



	public void setNombreOng(String nombreOng) {
		this.nombreOng = nombreOng;
	}



	public ArrayList<Delegacion> getListadoDelegaciones() {
		return listadoDelegaciones;
	}



	public void setListadoDelegaciones(ArrayList<Delegacion> listadoDelegaciones) {
		this.listadoDelegaciones = listadoDelegaciones;
	}
	
	
	
	

}
