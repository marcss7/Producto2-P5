package ouc.fp.ongmanager;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.junit.Test;

//Test para probar si los objetos de la clase "Delegacion" se suman correctamente en "ListadoDelegaciones".
public class ListadoDelegacionesTest {

	@Test
	public void testAdd() throws JAXBException {
		
		//Inicializamos cuatro delegaciones que utilizaremos para las pruebas.
		Delegacion d1 = new Delegacion();
		Delegacion d2 = new Delegacion();
		Delegacion d3 = new Delegacion();
		Delegacion d4 = new Delegacion();
		
		//Creamos un listado de delegaciones.
		List<Delegacion> listadoDelegaciones = new ArrayList<Delegacion>();
		assertEquals(0, listadoDelegaciones.size());
		listadoDelegaciones.add(d1); //El método "add" añade los objetos pasados como parámetros a la lista.
		assertEquals(1, listadoDelegaciones.size()); //Al añadir una delegación, se espera que el tamaño de la lista sea 1.
		listadoDelegaciones.add(d2);
		assertEquals(2, listadoDelegaciones.size());
		listadoDelegaciones.add(d3);
		assertEquals(3, listadoDelegaciones.size());
		listadoDelegaciones.add(d4);
		assertEquals(4, listadoDelegaciones.size());
	}
	
	//Si la prueba pasa, quiere decir que las delegaciones se añaden correctamente a la lista.

}
