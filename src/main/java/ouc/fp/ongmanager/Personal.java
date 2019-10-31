package ouc.fp.ongmanager;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Personal extends Persona {

	protected Delegacion delegacionAsignada;
	protected Date antiguedad;
	protected ListadoProyectos proyectosAsignados;

	public Personal() {
		super();
	}

	public Personal(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ListadoProyectos proyectosAsignados) {
		super(nombre, apellidos, id, email, telefono, direccion);
		//this.delegacionAsignada = delegacionAsignada;
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
	
	public ListadoProyectos getProyectosAsignados() {
		return proyectosAsignados;
	}

	public void setProyectosAsignados(ListadoProyectos proyectosAsignados) {
		this.proyectosAsignados = proyectosAsignados;
	}
}
