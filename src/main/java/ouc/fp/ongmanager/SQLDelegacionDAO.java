package ouc.fp.ongmanager;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class SQLDelegacionDAO implements DAO<Delegacion> {

	@Override
	public void crearNuevo(Delegacion t)
			throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Delegacion> obtener(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Delegacion t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Delegacion t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Delegacion> obtenerTodos() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

}
