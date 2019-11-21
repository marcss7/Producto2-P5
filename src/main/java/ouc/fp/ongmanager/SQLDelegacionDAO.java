package ouc.fp.ongmanager;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Esta clase instancia objetos SQL DAO para interaccionar con
 * los objetos delegacion y persistirlos en la base de datos MySQL.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class SQLDelegacionDAO implements DAO<Delegacion> {

	/**
	 * Metodo para persistir en la base de datos MySQL un nuevo objeto
	 * Delegacion a partir de los datos almancenados en formato XML.
	 * 
	 * @param d Objeto Delegacion a persistir.
	 * @throws SQLException 
	 */
	@Override
	public void crearNuevo(Delegacion d) throws JAXBException, ParserConfigurationException, SAXException, IOException, SQLException {
		MySQLUtil conn = new MySQLUtil();
		File file = new File("xml/delegacion.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document xmlDoc = builder.parse(file);
		xmlDoc.getDocumentElement().normalize();

		String sql = "INSERT INTO delegaciones (nombre, direccion, telefono, sede_central)\n" +
				     "VALUES(?, ?, ?, ?)";
		
		try {
			conn.connect().setAutoCommit(false);
			PreparedStatement stmt = conn.connect().prepareStatement(sql);
			Node n = xmlDoc.getDocumentElement();
			
			stmt.setString(1, getTextContent(n, "nombre"));
			stmt.setString(2, getTextContent(n, "direccion"));
			stmt.setString(3, getTextContent(n, "telefono"));
			if (getTextContent(n, "isSedeCentral").equals("false")) {
				stmt.setBoolean(4, false);
			} else {
				stmt.setBoolean(4, true);
			}

			stmt.executeUpdate();
			conn.connect().commit();
			System.out.println("Se ha creado una nueva delegación: " + d.getNombreDelegacion());
			
		} catch (SQLException e) {
			e.printStackTrace();
			conn.connect().rollback();
		} finally {
			conn.disconnect();
		}
		
	}
	
	/**
	 * Metodo estatico que permite obtener el contenido de
	 * cada uno de los elementos del socio que se han guardado
	 * etiquetados en el XML.
	 * 
	 * @param nodo Nodo socio que queremos guardar.
	 * @param etiqueta Etiqueta del elemento.
	 * @return Contenido del elemento.
	 */
	static private String getTextContent(Node nodo,String etiqueta) {

		NodeList nlist = nodo.getChildNodes();
		for (int i = 0 ; i < nlist.getLength() ; i++) {
			Node n = nlist.item(i);
			String name = n.getNodeName();
			if ( name != null && name.equals(etiqueta) )
				return n.getTextContent();
		}
		return "";
	}

	/**
	 * Metodo para obtener un objeto delegacion persistido.
	 * 
	 * @param id Identificador unico del objeto delegacion.
	 * @return Objeto delegacion persistido.
	 */
	@Override
	public Optional<Delegacion> obtener(String id) {
		System.out.println("Se ha obtenido una delegación");
		return null;
	}

	/**
	 * Metodo para actualizar un objeto delegacion persistido.
	 * 
	 * @param s Objeto delegacion a actualizar.
	 * @param params Parametros del objeto delegacion a modificar.
	 */
	@Override
	public void actualizar(Delegacion d, String[] params) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Metodo para borrar un objeto delegacion persistido.
	 * 
	 * @param s Objeto delegacion a borrar.
	 */
	@Override
	public void borrar(Delegacion d) {
		System.out.println("La delegación con ID " + d.getIdDelegacion() + "ha sido eliminada"); 
		
	}

	/**
	 * Metodo para recuperar todos los objetos delegacion persistidos.
	 * 
	 * @return Listado con los objetos delegacion persistidos.
	 */
	@Override
	public List<Delegacion> obtenerTodos() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

}
