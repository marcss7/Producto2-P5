package ouc.fp.ongmanager;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLSocioDAO implements DAO<Socio> {
	
	private ListadoSocios listadoSocios = new ListadoSocios();
	
    public XMLSocioDAO() {
    	
    }

	public ListadoSocios getListadoSocios() {
		return listadoSocios;
	}

	public void setListadoSocios(ListadoSocios listadoSocios) {
		this.listadoSocios = listadoSocios;
	}

	@Override
	public void crearNuevo(Socio s) throws JAXBException {
		listadoSocios.add(s);
		JAXBContext context = JAXBContext.newInstance(Socio.class);
	    Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    mar.marshal(s, new File("socio.xml"));
		System.out.println("Se ha creado un nuevo socio");
	}

	@Override
	public Optional<Socio> obtener(String id) {
		System.out.println("Se ha obtenido un socio");
        //return encontrarTrabajadorPorId(id); 
		return null;
	}

	@Override
	public void actualizar(Socio s, String[] params) {
    	encontrarSocioPorId(s.getId()).setNombre(s.getNombre()); 
        System.out.println("El socio con ID " + s.getId()  + " ha sido actualizado"); 
		
	}

	@Override
	public void borrar(Socio s) {
        System.out.println("El socio con ID " + s.getId() + "ha sido eliminado"); 
	}

	@Override
	public List<Socio> obtenerTodos() throws JAXBException {
		if (listadoSocios.getListadoSocios() != null) {
			System.out.println("La ONG cuenta con " + listadoSocios.getListadoSocios().size() + " socios:");
	    	for (Socio s : listadoSocios.getListadoSocios()) {
	    		System.out.println(s.toString());
	    	}
	    	
	    	JAXBContext context = JAXBContext.newInstance(ListadoSocios.class);
	    	Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(listadoSocios, new File("socios.xml"));
	    } else {
	    	System.out.println("La lista de socios está vacía.");
	    }
		return listadoSocios.getListadoSocios();
	}
	
    public Socio encontrarSocioPorId(String id) {
    	for (Socio s : listadoSocios.getListadoSocios()) {
    		if (s.getId().equals(id)) {
    			return s;
    		}
    	}
    	return null;	
    }

}
