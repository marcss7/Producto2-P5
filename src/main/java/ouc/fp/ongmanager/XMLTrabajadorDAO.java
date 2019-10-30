package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class XMLTrabajadorDAO implements DAO<Trabajador>{
	
	private List<Trabajador> listadoTrabajadores = new ArrayList<>();
	
    public XMLTrabajadorDAO() {
    	
    }

	public List<Trabajador> getListadoTrabajadores() {
		return listadoTrabajadores;
	}

	public void setListadoTrabajadores(List<Trabajador> listadoTrabajadores) {
		this.listadoTrabajadores = listadoTrabajadores;
	}

	@Override
	public void crearNuevo(Trabajador t) {
		listadoTrabajadores.add(t);
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
    	listadoTrabajadores.remove(t.getId()); 
        System.out.println("El trabajador con ID " + t.getId() + "ha sido eliminado"); 
	}

	@Override
	public List<Trabajador> obtenerTodos() {
		if (listadoTrabajadores.size() != 0) {
			System.out.println("La ONG cuenta con " + listadoTrabajadores.size() + " trabajadores:");
	    	for (Trabajador t : listadoTrabajadores) {
	    		System.out.println(t.toString());
	    	}
	    } else {
	    	System.out.println("La lista de trabajadores está vacía.");
	    }
		return listadoTrabajadores;
	}
	
    public Trabajador encontrarTrabajadorPorId(String id) {
    	for (Trabajador t : listadoTrabajadores) {
    		if (t.getId().equals(id)) {
    			return t;
    		}
    	}
    	return null;	
    }

}
