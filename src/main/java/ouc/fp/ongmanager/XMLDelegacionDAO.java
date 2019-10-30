package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class XMLDelegacionDAO implements DAO<Delegacion>{
	
	private List<Delegacion> listadoDelegaciones = new ArrayList<>();
	
    public XMLDelegacionDAO() {
    	
    }
    
	public List<Delegacion> getListadoDelegacioness() {
		return listadoDelegaciones;
	}

	public void setListadoDelegaciones(List<Delegacion> listadoDelegaciones) {
		this.listadoDelegaciones = listadoDelegaciones;
	}

	@Override
	public void crearNuevo(Delegacion d) {
		listadoDelegaciones.add(d);
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
    	listadoDelegaciones.remove(d.getIdSucursal()); 
        System.out.println("La sucursal con ID " + d.getIdSucursal() + "ha sido eliminada"); 
	}

	@Override
	public List<Delegacion> obtenerTodos() {
		if (listadoDelegaciones.size() != 0) {
			System.out.println("La ONG cuenta con " + listadoDelegaciones.size() + " sedes:");
	    	for (Delegacion d : listadoDelegaciones) {
	    		System.out.println(d.toString());
	    	}
	    } else {
	    	System.out.println("La lista de trabajadores está vacía.");
	    }
		return listadoDelegaciones;
	}
	
    public Delegacion encontrarDelegacionPorId(String id) {
    	for (Delegacion d : listadoDelegaciones) {
    		if (d.getIdSucursal().equals(id)) {
    			return d;
    		}
    	}
    	return null;	
    }

}
