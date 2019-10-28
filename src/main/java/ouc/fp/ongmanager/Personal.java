package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.Date;

public class Personal extends Persona {

	private Delegacion delegacionAsignada;
	private Date antiguedad;
	private ArrayList<Proyecto> proyectosAsignados;
	
	
	public Personal() {
		super();
	}

	public Personal(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ArrayList<Proyecto> proyectosAsignados) {
		super(nombre, apellidos, id, email, telefono, direccion);
		this.delegacionAsignada = delegacionAsignada;
		this.antiguedad = antiguedad;
		this.proyectosAsignados = proyectosAsignados;
	}

	public Delegacion getDelegacionAsignada() {
		return delegacionAsignada;
	}

	public void setDelegacionAsignada(Delegacion delegacionAsignada) {
		this.delegacionAsignada = delegacionAsignada;
	}

	public Date getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Date antiguedad) {
		this.antiguedad = antiguedad;
	}

	public ArrayList<Proyecto> getProyectosAsignados() {
		return proyectosAsignados;
	}

	public void setProyectosAsignados(ArrayList<Proyecto> proyectosAsignados) {
		this.proyectosAsignados = proyectosAsignados;
	}
	
	
}
