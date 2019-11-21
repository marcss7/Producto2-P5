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
 * los objetos socio y persistirlos en la base de datos MySQL.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class SQLSocioDAO implements DAO<Socio> {

	/**
	 * Metodo para persistir en la base de datos MySQL un nuevo objeto
	 * Socio a partir de los datos almancenados en formato XML.
	 * 
	 * @param s Objeto socio a persistir.
	 * @throws SQLException 
	 */
	@Override
	public void crearNuevo(Socio s) throws JAXBException, ParserConfigurationException, SAXException, IOException, SQLException {
		
		MySQLUtil conn = new MySQLUtil();
		File file = new File("xml/socio.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document xmlDoc = builder.parse(file);
		xmlDoc.getDocumentElement().normalize();

		String sql = "INSERT INTO socios(nombre, apellidos, nif, email, telefono, direccion, cuota, importe_cuota)\n" +
				     "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn.connect().setAutoCommit(false);
			PreparedStatement stmt = conn.connect().prepareStatement(sql);
			Node n = xmlDoc.getDocumentElement();
			
			stmt.setString(1, getTextContent(n, "nombre"));
			stmt.setString(2, getTextContent(n, "apellidos"));
			stmt.setString(3, getTextContent(n, "id"));
			stmt.setString(4, getTextContent(n, "email"));
			stmt.setString(5, getTextContent(n, "telefono"));
			stmt.setString(6, getTextContent(n, "direccion"));
			
			switch (getTextContent(n, "periodicidadCuota")) {
				case "MENSUAL":
					stmt.setString(7, "M");
					break;
				case "TRIMESTRAL":
					stmt.setString(7, "T");
					break;
				case "ANUAL":
					stmt.setString(7, "A");
					break;
				default:
					stmt.setString(7, "");
					break;
			}
			
			stmt.setDouble(8, Double.parseDouble(getTextContent(n, "importeCuota")));
			stmt.executeUpdate();
			conn.connect().commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			conn.connect().rollback();
		} finally {
			conn.disconnect();
		}
		
		System.out.println("Se ha creado un nuevo socio: " + s.getNombre() + " " + s.getApellidos());
		
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
	 * Metodo para obtener un objeto socio persistido.
	 * 
	 * @param id Identificador unico del objeto socio.
	 * @return Objeto socio persistido.
	 */
	@Override
	public Optional<Socio> obtener(String id) {
		System.out.println("Se ha obtenido un socio");
		return null;
	}

	/**
	 * Metodo para actualizar un objeto socio persistido.
	 * 
	 * @param s Objeto socio a actualizar.
	 * @param params Parametros del objeto socio a modificar.
	 */
	@Override
	public void actualizar(Socio s, String[] params) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo para borrar un objeto socio persistido.
	 * 
	 * @param s Objeto socio a borrar.
	 */
	@Override
	public void borrar(Socio s) {
		System.out.println("El socio con ID " + s.getId() + "ha sido eliminado"); 

	}

	/**
	 * Metodo para recuperar todos los objetos socio persistidos.
	 * 
	 * @return Listado con los objetos socio persistidos.
	 */
	@Override
	public List<Socio> obtenerTodos() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

}
