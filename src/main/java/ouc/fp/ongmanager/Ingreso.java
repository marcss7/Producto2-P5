package ouc.fp.ongmanager;

import java.util.Date;

public class Ingreso {
	
	private float importeIngreso;
	private Date fechaIngreso;
	private Financiador financiador;
	private String conceptoIngreso;
	
	
	
	
	public Ingreso() {
		super();
	}




	public Ingreso(float importeIngreso, Date fechaIngreso, Financiador financiador, String conceptoIngreso) {
		super();
		this.importeIngreso = importeIngreso;
		this.fechaIngreso = fechaIngreso;
		this.financiador = financiador;
		this.conceptoIngreso = conceptoIngreso;
	}




	public float getImporteIngreso() {
		return importeIngreso;
	}




	public void setImporteIngreso(float importeIngreso) {
		this.importeIngreso = importeIngreso;
	}




	public Date getFechaIngreso() {
		return fechaIngreso;
	}




	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}




	public Financiador getFinanciador() {
		return financiador;
	}




	public void setFinanciador(Financiador financiador) {
		this.financiador = financiador;
	}




	public String getConceptoIngreso() {
		return conceptoIngreso;
	}




	public void setConceptoIngreso(String conceptoIngreso) {
		this.conceptoIngreso = conceptoIngreso;
	}
	
	
	
	
}
