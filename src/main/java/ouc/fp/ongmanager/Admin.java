package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Admin extends Personal implements Usuario {
	
	private String rootPass;
	
	public Admin() {
		super();
	}


	public Admin(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ArrayList<Proyecto> proyectosAsignados, String horarioLaboral, String pass) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.rootPass = pass;
	}


	public String getRootPass() {
		return rootPass;
	}


	public void setRootPass(String rootPass) {
		this.rootPass = rootPass;
	}


	@Override
	public void abrirSesion() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	int respuesta = 0;
    	int opcionesValidas[] = {1, 2, 3, 4, 5};
    	
    	System.out.println("\n***************************");
    	System.out.println(" Opciones de administrador");
    	System.out.println("***************************");
    	
        do {
        	System.out.println("\nPor favor, introduce el número de la acción que deseas realizar: ");
        	System.out.println("1 - Dar de alta un trabajador");
        	System.out.println("2 - Imprimir listado de trabajadores");
        	System.out.println("3 - Dar de alta una delegación");
        	System.out.println("4 - Imprimir listado delegaciones");
        	System.out.println("5 - Salir");
        	
        	try {
        		respuesta = Integer.parseInt(br.readLine());
            } catch(NumberFormatException nfe) {
                System.out.println("Los caracteres introducidos no son válidos.");
            }
        	System.out.println(respuesta);
        } while (Arrays.asList(opcionesValidas).contains(respuesta));
        
        switch(respuesta) {
           case 1:
           	  System.out.println("Dar de alta un trabajador");
              break;
           
           case 2:
           	  System.out.println("Imprimir listado trabajadores");
              break;
              
           case 3:
            	  System.out.println("Dar de alta una delegación");
               break;
               
           case 4:
            	  System.out.println("Imprimir listado delegaciones");
               break;
              
           case 5:
        	  System.out.println("La sesión se ha cerrado con éxito.");
        	  System.exit(0);
              break;
        }
    
	}


	@Override
	public void consultarProyectos(ListadoProyectos lp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
