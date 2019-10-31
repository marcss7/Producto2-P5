package ouc.fp.ongmanager;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public interface Usuario {
	
	public void abrirSesion() throws IOException, JAXBException;
	
	public void consultarProyectos(ListadoProyectos lp);

}
