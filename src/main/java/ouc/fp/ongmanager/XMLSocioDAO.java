package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class XMLSocioDAO implements DAO<Socio> {
	
	private List<Socio> listadoSocios = new ArrayList<>();
	
    public XMLSocioDAO() {
    	
    }

	public List<Socio> getListadoSocios() {
		return listadoSocios;
	}

	public void setListadoSocios(List<Socio> listadoSocios) {
		this.listadoSocios = listadoSocios;
	}

	@Override
	public void crearNuevo(Socio s) {
		listadoSocios.add(s);
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
		listadoSocios.remove(s.getId()); 
        System.out.println("El socio con ID " + s.getId() + "ha sido eliminado"); 
	}

	@Override
	public List<Socio> obtenerTodos() {
		if (listadoSocios.size() != 0) {
			System.out.println("La ONG cuenta con " + listadoSocios.size() + " socios:");
	    	for (Socio s : listadoSocios) {
	    		System.out.println(s.toString());
	    	}
	    } else {
	    	System.out.println("La lista de socios está vacía.");
	    }
		return listadoSocios;
	}
	
    public Socio encontrarSocioPorId(String id) {
    	for (Socio s : listadoSocios) {
    		if (s.getId().equals(id)) {
    			return s;
    		}
    	}
    	return null;	
    }

}
