package ouc.fp.ongmanager;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLDelegacionDAO implements DAO<Delegacion>{
	
	private ListadoDelegaciones listadoDelegaciones = new ListadoDelegaciones();
	
    public XMLDelegacionDAO() {
    	
    }
    
	public ListadoDelegaciones getListadoDelegacioness() {
		return listadoDelegaciones;
	}

	public void setListadoDelegaciones(ListadoDelegaciones listadoDelegaciones) {
		this.listadoDelegaciones = listadoDelegaciones;
	}

	@Override
	public void crearNuevo(Delegacion d) throws JAXBException {
		listadoDelegaciones.add(d);
		JAXBContext context = JAXBContext.newInstance(Delegacion.class);
	    Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    
	    //Crea el directorio "xml" en caso de que no exista.
	    File f=new File("xml/");
	  	  if (!f.exists()) {
	  	    f.mkdirs();
	  	}
	    mar.marshal(d, new File("delegacion.xml"));
		System.out.println("Se ha creado una nueva delegación");
	}

	@Override
	public Optional<Delegacion> obtener(String id) {
		System.out.println("Se ha obtenido una delegación");
        //return encontrarTrabajadorPorId(id); 
		return null;
	}

	@Override
	public void actualizar(Delegacion d, String[] params) {
		encontrarDelegacionPorId(d.getIdSucursal()).setNombreSucursal(d.getNombreSucursal());
        System.out.println("La sucursal con ID " + d.getIdSucursal()  + " ha sido actualizada"); 
		
	}

	@Override
	public void borrar(Delegacion d) {
        System.out.println("La sucursal con ID " + d.getIdSucursal() + "ha sido eliminada"); 
	}

	@Override
	public List<Delegacion> obtenerTodos() throws JAXBException {
		if (listadoDelegaciones.getListadoDelegaciones() != null) {
			System.out.println("La ONG cuenta con " + listadoDelegaciones.getListadoDelegaciones().size() + " sedes:");
	    	for (Delegacion d : listadoDelegaciones.getListadoDelegaciones()) {
	    		System.out.println(d.toString());
	    	}
	    	JAXBContext context = JAXBContext.newInstance(ListadoDelegaciones.class);
	    	Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(listadoDelegaciones, new File("delegaciones.xml"));
	    } else {
	    	System.out.println("La lista de delegaciones está vacía.");
	    }
		return listadoDelegaciones.getListadoDelegaciones();
	}
	
    public Delegacion encontrarDelegacionPorId(String id) {
    	for (Delegacion d : listadoDelegaciones.getListadoDelegaciones()) {
    		if (d.getIdSucursal().equals(id)) {
    			return d;
    		}
    	}
    	return null;	
    }

}
