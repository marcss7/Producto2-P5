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

public class SQLTrabajadorDAO implements DAO<Trabajador> {
	
	/**
	 * Metodo para persistir en la base de datos MySQL un nuevo objeto
	 * Trabajador a partir de los datos almancenados en formato XML.
	 * 
	 * @param t Objeto Trabajador a persistir.
	 * @throws SQLException 
	 */
	@Override
	public void crearNuevo(Trabajador t) throws JAXBException, ParserConfigurationException, SAXException, IOException, SQLException {
		MySQLUtil conn = new MySQLUtil();
		File file = new File("xml/trabajador.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document xmlDoc = builder.parse(file);
		xmlDoc.getDocumentElement().normalize();

		String sql = "INSERT INTO trabajadores (nombre, apellidos, nif, email, telefono, direccion, delegacion, antiguedad, horario_laboral, pass)\n" +
				     "VALUES(?, ?, ?, ?, ?, ?, ?, str_to_date(?, '%Y-%m-%d'), ?, ?)";
		
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
			stmt.setInt(7, Integer.parseInt(getTextContent(n, "delegacion")));
			stmt.setString(8, getTextContent(n, "antiguedad"));
			stmt.setString(9, getTextContent(n, "horario"));
			stmt.setString(10, getTextContent(n, "pass"));
			stmt.executeUpdate();
			conn.connect().commit();
			System.out.println("Se ha creado un nuevo trabajador: " + t.getNombre() + " " + t.getApellidos());
			
		} catch (SQLException e) {
			e.printStackTrace();
			conn.connect().rollback();
		} finally {
			conn.disconnect();
		}
		
	}

	/**
	 * Metodo estatico que permite obtener el contenido de
	 * cada uno de los elementos del trabajador que se han guardado
	 * etiquetados en el XML.
	 * 
	 * @param nodo Nodo trabajador que queremos guardar.
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
	 * Metodo para obtener un objeto trabajador persistido.
	 * 
	 * @param id Identificador unico del objeto trabajador.
	 * @return Objeto trabajador persistido.
	 */
	@Override
	public Optional<Trabajador> obtener(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo para actualizar un objeto trabajador persistido.
	 * 
	 * @param s Objeto trabajador a actualizar.
	 * @param params Parametros del objeto trabajador a modificar.
	 */
	@Override
	public void actualizar(Trabajador t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Metodo para borrar un objeto trabajador persistido.
	 * 
	 * @param s Objeto trabajador a borrar.
	 */
	@Override
	public void borrar(Trabajador t) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Metodo para recuperar todos los objetos trabajador persistidos.
	 * 
	 * @return Listado con los objetos trabajador persistidos.
	 */
	@Override
	public List<Trabajador> obtenerTodos() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

}
