package ouc.fp.ongmanager;

import java.util.Date;

public class Colaborador extends Personal {
	
	private String actividad;
	
	

	public Colaborador() {
		super();
	}



	public Colaborador(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ListadoProyectos proyectosAsignados, String actividad) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.actividad = actividad;
	}



	public String getActividad() {
		return actividad;
	}



	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	
	
	

}
