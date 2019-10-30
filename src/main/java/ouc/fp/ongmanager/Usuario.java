package ouc.fp.ongmanager;

import java.io.IOException;

public interface Usuario {
	
	public void abrirSesion() throws IOException;
	
	public void consultarProyectos(ListadoProyectos lp);

}
