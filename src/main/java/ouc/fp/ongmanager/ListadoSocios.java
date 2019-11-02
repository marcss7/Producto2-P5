package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase representa al listado de socios que pertenecen a la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
@XmlRootElement(name = "socios")
public class ListadoSocios {
	
	// CAMPOS
    private List<Socio> listadoSocios;
    
    
	// CONSTRUCTORES
	
	/**
	 * Constructor que llama a un nuevo objeto ListadoSocios sin inicializar sus campos.
	 */
	public ListadoSocios() {
		super();
	}
	
	/**
	 * Constructor que llama a un nuevo objeto ListadoSocios inicializando sus campos.
	 * 
	 * @param listadoSocios Listado con todos los socios de la ONG.
	 */
	public ListadoSocios(ArrayList<Socio> listadoSocios) {
		super();
		this.listadoSocios = listadoSocios;
	}
    
	
	// METODOS
	
    /**
     * Metodo accesor de lectura que nos da el listado de socios de la ONG.
     * 
     * @return Nos devuelve el listado de socios. 
     */
    @XmlElement(name = "socio")
    public List<Socio> getListadoSocios() {
        return listadoSocios;
    }

    /**
     * Metodo accesor de escritura que asigna el listado de socios de la ONG.
     * 
     * @param listadoSocios El listado de socios.
     */
    public void setListadoSocios(List<Socio> listadoSocios) {
        this.listadoSocios = listadoSocios;
    }

    /**
     * Metodo que permite agregar un socio al listado de socios.
     * @param s Socio.
     */
    public void add(Socio s) {
    	
        if (this.listadoSocios == null) {
            this.listadoSocios = new ArrayList<Socio>();
        }
        this.listadoSocios.add(s);

    }

}

