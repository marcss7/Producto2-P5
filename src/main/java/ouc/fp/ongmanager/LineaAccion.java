package ouc.fp.ongmanager;

import java.util.ArrayList;

public class LineaAccion {
	
	private String nombreLinea;
	private String idLinea;
	private ArrayList<SublineaAccion> listadoSublineas;
	
	
	
	public LineaAccion() {
		super();
	}



	public LineaAccion(String nombreLinea, String idLinea, ArrayList<SublineaAccion> listadoSublineas) {
		super();
		this.nombreLinea = nombreLinea;
		this.idLinea = idLinea;
		this.listadoSublineas = listadoSublineas;
	}



	public String getNombreLinea() {
		return nombreLinea;
	}



	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}



	public String getIdLinea() {
		return idLinea;
	}



	public void setIdLinea(String idLinea) {
		this.idLinea = idLinea;
	}



	public ArrayList<SublineaAccion> getListadoSublineas() {
		return listadoSublineas;
	}



	public void setListadoSublineas(ArrayList<SublineaAccion> listadoSublineas) {
		this.listadoSublineas = listadoSublineas;
	}
	
	

}
