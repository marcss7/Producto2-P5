package ouc.fp.ongmanager;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

/**
 * Interfaz que implementan todas aquellas clases que
 * pueden usar la aplicacion de la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 * 
 */
public interface Usuario {
	
	/**
	 * Metodo que genera el menu de acciones que puede realizar el usuario
	 * en la aplicacion cuando inicia sesion.
	 * 
	 * @throws IOException si se produce un error de entrada/salida.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws XPathExpressionException 
	 * @throws SQLException 
	 */
	public void abrirSesion() throws IOException, JAXBException, XPathExpressionException, ParserConfigurationException, SAXException, SQLException;
	
	/**
	 * Metodo que permite al usuario consultar el listado de proyectos
	 * en los que esta trabajando la ONG.
	 * 
	 * @param lp Listado de proyectos.
	 */
	public void consultarProyectos(ListadoProyectos lp);

}
