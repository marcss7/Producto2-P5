package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Trabajador extends Personal implements Usuario {
	
	private String horarioLaboral;
	private String pass;
	
	
	public Trabajador() {
		super();
	}


	public Trabajador(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ArrayList<Proyecto> proyectosAsignados, String horarioLaboral, String pass) {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.horarioLaboral = horarioLaboral;
		this.pass = pass;
	}


	public String getHorarioLaboral() {
		return horarioLaboral;
	}


	public void setHorarioLaboral(String horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public void abrirSesion() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	int respuesta = 0;
    	int opcionesValidas[] = {1, 2, 3};
    	
    	System.out.println("\n**********************");
    	System.out.println(" Opciones de empleado");
    	System.out.println("**********************");
    	
        do {
        	System.out.println("\nPor favor, introduce el número de la acción que deseas realizar: ");
        	System.out.println("1 - Dar de alta un socio");
        	System.out.println("2 - Imprimir listado de socios");
        	System.out.println("3 - Salir");
        	
        	try {
        		respuesta = Integer.parseInt(br.readLine());
            } catch(NumberFormatException nfe) {
                System.out.println("Los caracteres introducidos no son válidos.");
            }
        	System.out.println(respuesta);
        } while (Arrays.asList(opcionesValidas).contains(respuesta));
        
        switch(respuesta) {
           case 1:
           	  System.out.println("Dar de alta un socio");
              break;
           
           case 2:
           	  System.out.println("Imprimir listado de socios");
              break;
              
           case 3:
        	  System.out.println("La sesión se ha cerrado con éxito.");
        	  System.exit(0);
              break;
        }
		
	}


	@Override
	public void consultarProyectos(ListadoProyectos lp) {
		// TODO Auto-generated method stub
		
	}
	
	 @Override
	 public String toString() {
	    return this.nombre + " " + this.apellidos + " (ID - " + this.id + ")";
	 }

}
