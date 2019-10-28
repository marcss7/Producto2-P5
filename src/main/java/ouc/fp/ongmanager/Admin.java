package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.Date;

public class Admin extends Personal implements Usuario {
	
	private String rootPass;
	
	public Admin() {
		super();
	}


	public Admin(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ArrayList<Proyecto> proyectosAsignados, String horarioLaboral, String pass) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.rootPass = pass;
	}


	public String getRootPass() {
		return rootPass;
	}


	public void setRootPass(String rootPass) {
		this.rootPass = rootPass;
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
