package ouc.fp.ongmanager;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ListadoTrabajadoresTest {

	@Test
	public void testAdd() {
		
		Trabajador t1 = null;
		Trabajador t2 = null;
		Trabajador t3 = null;
		Trabajador t4 = null;
		
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
