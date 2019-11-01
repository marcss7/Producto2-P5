package ouc.fp.ongmanager;

import java.util.ArrayList;

public class Donante extends Persona implements Financiador {
	
	private String idDonante;
	
	public Donante() {
		super();
	}

	public Donante(String nombre, String apellidos, String id, String email, int telefono, String direccion, String idSocio, TipoAportacion periodicidadCuota, String idDonante) {
		super(nombre, apellidos, id, email, telefono, direccion);
		this.idDonante = idDonante;
	}

	public String getIdDonante() {
		return idDonante;
	}

	public void setIdDonante(String idDonante) {
		this.idDonante = idDonante;
	}

	@Override
	public void realizarAportacion(ArrayList<Ingreso> listadoIngresos) {
		// TODO Auto-generated method stub
		
	}

}
