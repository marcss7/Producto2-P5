package ouc.fp.ongmanager;

import java.util.ArrayList;

public class Entidad implements Financiador {
	
	private String nombreEntidad;
	private String cifEntidad;
	private Boolean isPrivada;
	
	
	
	
	
	
	public Entidad() {
		super();
	}




	public Entidad(String nombreEntidad, String cifEntidad, Boolean isPrivada) {
		super();
		this.nombreEntidad = nombreEntidad;
		this.cifEntidad = cifEntidad;
		this.isPrivada = isPrivada;
	}




	public String getNombreEntidad() {
		return nombreEntidad;
	}




	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}




	public String getCifEntidad() {
		return cifEntidad;
	}




	public void setCifEntidad(String cifEntidad) {
		this.cifEntidad = cifEntidad;
	}




	public Boolean getIsPrivada() {
		return isPrivada;
	}




	public void setIsPrivada(Boolean isPrivada) {
		this.isPrivada = isPrivada;
	}




	@Override
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos) {
		// TODO Auto-generated method stub
		
	}
	
	

}
