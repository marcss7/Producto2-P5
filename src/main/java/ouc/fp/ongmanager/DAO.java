package ouc.fp.ongmanager;

import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;

public interface DAO<T> {
	
    public void crearNuevo(T t) throws JAXBException;
    public Optional<T> obtener(String id); 
    public void actualizar(T t, String[] params); 
    public void borrar(T t);
    public List<T> obtenerTodos() throws JAXBException;

}
