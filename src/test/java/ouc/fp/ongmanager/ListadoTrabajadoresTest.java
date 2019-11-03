package ouc.fp.ongmanager;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.Test;

//Test para probar si los objetos de la clase "Trabajador" se suman correctamente en "ListadoTrabajadores".
public class ListadoTrabajadoresTest {

	@Test
	public void testAdd() throws JAXBException {
		

		//Inicializamos cuatro trabajadores que utilizaremos para las pruebas.

		Trabajador t1 = new Trabajador();
		Trabajador t2 = new Trabajador();
		Trabajador t3 = new Trabajador();
		Trabajador t4 = new Trabajador();
		
		List<Trabajador> listadoTrabajadores = new ArrayList<Trabajador>();
		assertEquals(0, listadoTrabajadores.size());
		listadoTrabajadores.add(t1);
		assertEquals(1, listadoTrabajadores.size());
		listadoTrabajadores.add(t2);
		assertEquals(2, listadoTrabajadores.size());
		listadoTrabajadores.add(t3);
		assertEquals(3, listadoTrabajadores.size());
		listadoTrabajadores.add(t4);
		assertEquals(4, listadoTrabajadores.size());
	}

}
