package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.Date;

public class Trabajador extends Personal implements Usuario {
	
	private String horarioLaboral;
	private String pass;
	
	
	public Trabajador() {
		super();
	}


	public Trabajador(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ArrayList<Proyecto> proyectosAsignados, String horarioLaboral, String pass) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.horarioLaboral = horarioLaboral;
		this.pass = pass;
	}


	public String getHorarioLaboral() {
		return horarioLaboral;
	}


	public void setHorarioLaboral(String horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public void abrirSesion() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void consultarProyectos(ListadoProyectos lp) {
		// TODO Auto-generated method stub
		
	}	

}
