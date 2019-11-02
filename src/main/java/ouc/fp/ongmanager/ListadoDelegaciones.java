package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase representa al listado de las delegaciones que conforman la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
@XmlRootElement(name = "delegaciones")
public class ListadoDelegaciones {
	
	// CAMPOS
    private List<Delegacion> listadoDelegaciones;
    
    
    // CONSTRUCTORES
    
	/**
	 * Constructor que llama a un nuevo objeto ListadoDelegaciones sin inicializar sus campos.
	 */
	public ListadoDelegaciones() {
		super();
	}
	
	/**
	 * Constructor que llama a un nuevo objeto ListadoDelegaciones inicializando sus campos.
	 * 
	 * @param listadoDelegaciones Listado con todas las delegaciones de la ONG.
	 */
	public ListadoDelegaciones(ArrayList<Delegacion> listadoDelegaciones) {
		super();
		this.listadoDelegaciones = listadoDelegaciones;
	}
    
	
	// METODOS
	
    /**
	 * Metodo accesor de lectura que nos da el listado de delegaciones.
	 * 
	 * @return Nos devuelve el listado de delegaciones. 
	 */
    @XmlElement(name = "delegacion")
    public List<Delegacion> getListadoDelegaciones() {
        return listadoDelegaciones;
    }

    /**
     * Metodo accesor de escritura que asigna el listado de delegaciones.
     * 
     * @param listadoDelegaciones El listado de delegaciones.
     */
    public void setListadoDelegaciones(List<Delegacion> listadoDelegaciones) {
        this.listadoDelegaciones = listadoDelegaciones;
    }

    /**
     * Este metodo nos permite agregar una delegacion al listado.
     * 
     * @param d Delegacion.
     */
    public void add(Delegacion d) {
    	
        if (this.listadoDelegaciones == null) {
            this.listadoDelegaciones = new ArrayList<Delegacion>();
        }
        this.listadoDelegaciones.add(d);

    }

}

