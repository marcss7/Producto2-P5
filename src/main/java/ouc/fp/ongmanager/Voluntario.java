package ouc.fp.ongmanager;

import java.util.Date;

public class Voluntario extends Personal {
	
	private String disponibilidad;
	private Boolean isInternacional;
	
	
	
	public Voluntario() {
		super();
	}

	public Voluntario(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ListadoProyectos proyectosAsignados, String disponibilidad, Boolean isInternacional) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.disponibilidad = disponibilidad;
		this.isInternacional = isInternacional;
	}



	public String getDisponibilidad() {
		return disponibilidad;
	}



	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}



	public Boolean getIsInternacional() {
		return isInternacional;
	}



	public void setIsInternacional(Boolean isInternacional) {
		this.isInternacional = isInternacional;
	}
	

}
