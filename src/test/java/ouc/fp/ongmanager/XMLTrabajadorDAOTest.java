package ouc.fp.ongmanager;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.junit.Test;

//Test para comprobar que el metodo encontrarTrabajadorPorId() funciona correctamente.
public class XMLTrabajadorDAOTest {

	@Test
	public void testBorrar() throws JAXBException {

		//Inicializamos cuatro trabajadores que utilizaremos para las pruebas (importante que tengan ID definida).
		Trabajador t1 = new Trabajador("Jorge", "Masvidal", "22I", null, null, null, null, null, null, null, null, 0);
		Trabajador t2 = new Trabajador("Maria", "Rodriguez", "82E", null, null, null, null, null, null, null, null, 0);
		Trabajador t3 = new Trabajador("Sara", "Gomez", "75S", null, null, null, null, null, null, null, null, 0);
		Trabajador t4 = new Trabajador("Pablo", "Costa", "99M", null, null, null, null, null, null, null, null, 0);

		//Creamos un listado de trabajadores.
		List<Trabajador> listadoTrabajadores = new ArrayList<Trabajador>();

		//Agregamos los cuatro trabajadores a la lista.
		listadoTrabajadores.add(t1);
		listadoTrabajadores.add(t2);
		listadoTrabajadores.add(t3);
		listadoTrabajadores.add(t4);

		//Creamos instancia "lt" de la clase "ListadoTrabajadores"
		ListadoTrabajadores lt = new ListadoTrabajadores();
		//Asignamos la lista almacenada en "listadoTrabajadores" en la instancia "lt".
		lt.setListadoTrabajadores(listadoTrabajadores);

		XMLTrabajadorDAO xmlTrabajadorDao = new XMLTrabajadorDAO();

		//Asignamos una instancia "ListadoTrabajadores" al objeto "xmlTrabajadorDao".
		xmlTrabajadorDao.setListadoTrabajadores(lt);

		//En este caso, el resultado debería de ser un objeto de la clase "Trabajador", por tanto, no debemos recibir "null".
		assertNotNull(xmlTrabajadorDao.encontrarTrabajadorPorId("82E"));

		//En este caso, el resultado debería de ser "null", al no existir ningun trabajador con esa ID.
		assertNull(xmlTrabajadorDao.encontrarTrabajadorPorId("822E"));
	}

	//Si la prueba pasa, quiere decir que el método encuentra correctamente a los trabajadores en una lista mediante su selección por el campo "id".
	
}
