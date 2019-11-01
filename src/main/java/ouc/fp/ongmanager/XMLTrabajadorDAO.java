package ouc.fp.ongmanager;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLTrabajadorDAO implements DAO<Trabajador>{
	
	private ListadoTrabajadores listadoTrabajadores = new ListadoTrabajadores();
	
    public XMLTrabajadorDAO() {
    	
    }

	public ListadoTrabajadores getListadoTrabajadores() {
		return listadoTrabajadores;
	}

	public void setListadoTrabajadores(ListadoTrabajadores listadoTrabajadores) {
		this.listadoTrabajadores = listadoTrabajadores;
	}

	@Override
	public void crearNuevo(Trabajador t) throws JAXBException {
		listadoTrabajadores.add(t);
		JAXBContext context = JAXBContext.newInstance(Trabajador.class);
	    Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    
	    //Crea el directorio "xml" en caso de que no exista.
		File f=new File("xml/");
	    if (!f.exists()) {
	      f.mkdirs();
	    }
	    mar.marshal(t, new File("xml/trabajador.xml"));
		System.out.println("Se ha creado un nuevo trabajador");
	}

	@Override
	public Optional<Trabajador> obtener(String id) {
		System.out.println("Se ha obtenido un trabajador");
        //return encontrarTrabajadorPorId(id); 
		return null;
	}

	@Override
	public void actualizar(Trabajador t, String[] params) {
    	encontrarTrabajadorPorId(t.getId()).setNombre(t.getNombre()); 
        System.out.println("El trabajador con ID " + t.getId()  + " ha sido actualizado"); 
		
	}

	@Override
	public void borrar(Trabajador t) {
        System.out.println("El trabajador con ID " + t.getId() + "ha sido eliminado"); 
	}

	@Override
	public List<Trabajador> obtenerTodos() throws JAXBException {
		if (listadoTrabajadores.getListadoTrabajadores() != null) {
			System.out.println("La ONG cuenta con " + listadoTrabajadores.getListadoTrabajadores().size() + " trabajadores:");
	    	for (Trabajador t : listadoTrabajadores.getListadoTrabajadores()) {
	    		System.out.println(t.toString());
	    	}
	    	
	    	JAXBContext context = JAXBContext.newInstance(ListadoTrabajadores.class);
	    	Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(listadoTrabajadores, new File("xml/trabajadores.xml"));
			
	    } else {
	    	System.out.println("La lista de trabajadores está vacía.");
	    }
		return listadoTrabajadores.getListadoTrabajadores();
	}
	
    public Trabajador encontrarTrabajadorPorId(String id) {
    	for (Trabajador t : listadoTrabajadores.getListadoTrabajadores()) {
    		if (t.getId().equals(id)) {
    			return t;
    		}
    	}
    	return null;	
    }

}
