package ouc.fp.ongmanager;

/**
 * Esta clase instancia objetos XML DAO para interaccionar con
 * los objetos delegacion y persistirlos en formato XML.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLDelegacionDAO implements DAO<Delegacion>{
	
	// CAMPOS
	
	private ListadoDelegaciones listadoDelegaciones = new ListadoDelegaciones();
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto XMLDelegacionDAO sin inicializar sus campos.
	 */
    public XMLDelegacionDAO() {
    	
    }
    
	/**
	 * Constructor que crea un nuevo objeto XMLDelegacionDAO inicializando sus campos.
	 * 
	 * @param listadoDelegaciones Atributo que guarda el listado de las delegaciones de la ONG.
	 */
	public XMLDelegacionDAO(ListadoDelegaciones listadoDelegaciones) {
		super();
		this.listadoDelegaciones = listadoDelegaciones;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da el lista de delegaciones de la ONG.
	 * 
	 * @return Nos devuelve el listado de delegaciones.
	 */
	public ListadoDelegaciones getListadoDelegacioness() {
		return listadoDelegaciones;
	}

	/**
	 * Metodo accesor de escritura que asigna el listado de delegaciones de la ONG.
	 * 
	 * @param listadoDelegaciones El listado de delegaciones de la ONG.
	 */
	public void setListadoDelegaciones(ListadoDelegaciones listadoDelegaciones) {
		this.listadoDelegaciones = listadoDelegaciones;
	}

	/**
	 * Metodo para crear un nuevo objeto delegacion a persistir
	 * en formato XML.
	 * 
	 * @param d Objeto delegacion a persistir.
	 */
	@Override
	public void crearNuevo(Delegacion d) throws JAXBException {
		listadoDelegaciones.add(d);
		JAXBContext context = JAXBContext.newInstance(Delegacion.class);
	    Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    
	    //Crea el directorio "xml" en caso de que no exista.
	    File f = new File("xml/");
	  	  if (!f.exists()) {
	  	    f.mkdirs();
	  	}
	    
	    mar.marshal(d, new File("xml/delegacion.xml"));
	    
		System.out.println("Se ha creado una nueva delegación");
	}

	/**
	 * Metodo para obtener un objeto delegacion persistido.
	 * 
	 * @param id Identificador unico del objeto delegacion.
	 * @return Objeto delegacion persistido.
	 */
	@Override
	public Optional<Delegacion> obtener(String id) {
		System.out.println("Se ha obtenido una delegación");
        //return encontrarTrabajadorPorId(id); 
		return null;
	}

	/**
	 * Metodo para actualizar un objeto delegacion persistido.
	 * 
	 * @param d Objeto delegacion a actualizar.
	 * @param params Parametros del objeto delegacion a modificar.
	 */
	@Override
	public void actualizar(Delegacion d, String[] params) {
		encontrarDelegacionPorId(d.getIdDelegacion()).setNombreDelegacion(d.getNombreDelegacion());
        System.out.println("La sucursal con ID " + d.getIdDelegacion()  + " ha sido actualizada"); 
	}

	/**
	 * Metodo para borrar un objeto delegacion persistido.
	 * 
	 * @param d Objeto delegacion a borrar.
	 */
	@Override
	public void borrar(Delegacion d) {
        System.out.println("La sucursal con ID " + d.getIdDelegacion() + "ha sido eliminada"); 
	}

	/**
	 * Metodo para recuperar todos los objetos delegacion persistidos.
	 * 
	 * @return Listado con los objetos delegacion persistidos.
	 */
	@Override
	public List<Delegacion> obtenerTodos() throws JAXBException {
		if (listadoDelegaciones.getListadoDelegaciones() != null) {
			if(listadoDelegaciones.getListadoDelegaciones().size() > 1) {
			System.out.println("La ONG cuenta con " + listadoDelegaciones.getListadoDelegaciones().size() + " sedes:");
			} if (listadoDelegaciones.getListadoDelegaciones().size() == 1) {
				System.out.println("La ONG cuenta con " + listadoDelegaciones.getListadoDelegaciones().size() + " sede:");
			}
			for (Delegacion d : listadoDelegaciones.getListadoDelegaciones()) {
	    		System.out.println(d.toString());
	    	}
	    	JAXBContext context = JAXBContext.newInstance(ListadoDelegaciones.class);
	    	Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
		    //Crea el directorio "xml" en caso de que no exista.
		    File f = new File("xml/");
		  	  if (!f.exists()) {
		  	    f.mkdirs();
		  	}
			
			marshaller.marshal(listadoDelegaciones, new File("xml/delegaciones.xml"));
	    } else {
	    	System.out.println("La lista de delegaciones está vacía.");
	    }
		return listadoDelegaciones.getListadoDelegaciones();
	}
	
	/**
	 * Metodo que permite encontrar una delegacion dentro del
	 * listado de delegaciones en funcion de su id.
	 * 
	 * @param id Id de la delegacion buscada.
	 * @return Delegacion buscada.
	 */
    public Delegacion encontrarDelegacionPorId(int id) {
    	for (Delegacion d : listadoDelegaciones.getListadoDelegaciones()) {
    		if (d.getIdDelegacion() == id) {
    			return d;
    		}
    	}
    	return null;	
    }

}
