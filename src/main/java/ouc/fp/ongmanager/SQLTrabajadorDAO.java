package ouc.fp.ongmanager;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class SQLTrabajadorDAO implements DAO<Trabajador> {

	@Override
	public void crearNuevo(Trabajador t)
			throws JAXBException, ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Trabajador> obtener(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Trabajador t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Trabajador t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Trabajador> obtenerTodos() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

}
