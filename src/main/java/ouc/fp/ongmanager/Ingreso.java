package ouc.fp.ongmanager;

import java.util.Date;

/**
 * Esta clase representa cada una de las aportaciones a traves de las cuales se financia la ONG 
 * y que le llegan a traves de diversos tipos de financiadores, tanto publicos como privados.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class Ingreso {
	
	// CAMPOS
	
	private float importeIngreso;
	private Date fechaIngreso;
	private Financiador financiador;
	private String conceptoIngreso;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Ingreso sin inicializar sus campos. 
	 */
	public Ingreso() {
		super();
	}



	/**
	 * Constructor que crea un nuevo objeto Ingreso inicializando sus campos.
	 * 
	 * @param importeIngreso Atributo que guarda el importe del ingreso.
	 * @param fechaIngreso Atributo que guarda la fecha del ingreso.
	 * @param financiador Atributo que guarda el financiador del ingreso.
	 * @param conceptoIngreso Atributo que guarda el concepto del ingreso.
	 */
	public Ingreso(float importeIngreso, Date fechaIngreso, Financiador financiador, String conceptoIngreso) {
		super();
		this.importeIngreso = importeIngreso;
		this.fechaIngreso = fechaIngreso;
		this.financiador = financiador;
		this.conceptoIngreso = conceptoIngreso;
	}

	
	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el importe del ingreso.
	 * 
	 * @return nos devuelve el importe del ingreso.
	 */
	public float getImporteIngreso() {
		return importeIngreso;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el importe del ingreso.
	 * 
	 * @param importeIngreso el importe del ingreso.
	 */
	public void setImporteIngreso(float importeIngreso) {
		this.importeIngreso = importeIngreso;
	}
	
	/**
	 * Metodo accesor de lectura que nos da la fecha del ingreso.
	 * 
	 * @return nos devuelve la fecha en que se realizo el ingreso. 
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	/**
	 * Metodo accesor de escritura que asigna la fecha del ingreso.
	 * 
	 * @param fechaIngreso la fecha en que se realizo el ingreso.
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el financiador que realizo el ingreso.
	 * 
	 * @return nos devuelve el financiador que hizo el ingreso.
	 */
	public Financiador getFinanciador() {
		return financiador;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el financiador que hizo el ingreso.
	 * 
	 * @param financiador financiador que realizo el ingreso.
	 */
	public void setFinanciador(Financiador financiador) {
		this.financiador = financiador;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el concepto del ingreso.
	 * 
	 * @return nos devuelve el concepto del ingreso
	 */
	public String getConceptoIngreso() {
		return conceptoIngreso;
	}
	
	/**
	 * Metodo accesor de escritura que asigna el concepto del ingreso.
	 * 
	 * @param conceptoIngreso el concepto del ingreso.
	 */
	public void setConceptoIngreso(String conceptoIngreso) {
		this.conceptoIngreso = conceptoIngreso;
	}
	
}
