package ouc.fp.ongmanager;

import java.util.ArrayList;

public class ListadoFinanciadores {

	private ArrayList<Financiador> listadoFinanciadores;
	
	public ListadoFinanciadores() {
		super();
	}
	
	public ListadoFinanciadores(ArrayList<Financiador> listadoFinanciadores) {
		super();
		this.listadoFinanciadores = listadoFinanciadores;
	}



	public ArrayList<Financiador> getListadoFinanciadores() {
		return listadoFinanciadores;
	}



	public void setListadoFinanciador(ArrayList<Financiador> listadoFinanciadores) {
		this.listadoFinanciadores = listadoFinanciadores;
	}
	
	
}

