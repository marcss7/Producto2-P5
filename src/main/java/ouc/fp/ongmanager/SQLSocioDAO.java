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
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SQLSocioDAO implements DAO<Socio> {
	


	@Override
	public void crearNuevo(Socio t) throws JAXBException, ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		MySQLUtil conn = new MySQLUtil();
		File file = new File("xml/socio.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document xmlDoc = builder.parse(file);
		xmlDoc.getDocumentElement().normalize();
		
			
			String sql = "INSERT INTO socios(\n" +
	        	      "  nombre, apellidos, nif, email, telefono,\n" +
	           	      "  direccion, cuota, importe_cuota)\n" +
	                  "VALUES(?, ?, ?, ?, ?,\n" +
	                  "?, ?, ?)";
			try {
			    PreparedStatement stmt = conn.connect().prepareStatement(sql);
				Node n = xmlDoc.getDocumentElement();
				stmt.setString(1, getTextContent(n, "nombre"));
				stmt.setString(2, getTextContent(n, "apellidos"));
				stmt.setString(3, getTextContent(n, "id"));
				stmt.setString(4, getTextContent(n, "email"));
				stmt.setString(5, getTextContent(n, "telefono"));
				stmt.setString(6, getTextContent(n, "direccion"));
				stmt.setString(7, "A");
				stmt.setDouble(8, Double.parseDouble(getTextContent(n, "importeCuota")));
				stmt.executeUpdate();
			} catch (SQLException e) {
			    e.printStackTrace();
			} finally {
				conn.disconnect();
			}
	}
	
	
	static private String getTextContent(Node parentNode,String childName)
	{
		
	    NodeList nlist = parentNode.getChildNodes();
	    for (int i = 0 ; i < nlist.getLength() ; i++) {
	    Node n = nlist.item(i);
	    String name = n.getNodeName();
	    if ( name != null && name.equals(childName) )
	        return n.getTextContent();
	    }
	    return "";
	}

	@Override
	public Optional<Socio> obtener(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Socio t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Socio t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Socio> obtenerTodos() throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}
 
}
