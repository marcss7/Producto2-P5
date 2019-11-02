package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.xml.bind.JAXBException;

/**
 * Clase que contiene el main que lanza la aplicación.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 * 
 */
public class App {
	
	public static void main( String[] args ) throws IOException, JAXBException {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	int respuesta = 0;
    	Integer[] opcionesValidas = {1, 2, 3};
    	
    	System.out.println("*************************");
    	System.out.println(" Bienvenido a ONGManager");
    	System.out.println("*************************");
    	
        do {
        	System.out.println("\nPor favor, introduce el número de la acción que deseas realizar: ");
        	System.out.println("1 - Iniciar sesión como adminitrador");
        	System.out.println("2 - Iniciar sesión como empleado");
        	System.out.println("3 - Salir");
        	
        	try {
        		respuesta = Integer.parseInt(br.readLine());
            } catch(NumberFormatException nfe) {
                System.out.println("Los caracteres introducidos no son válidos.");
            }
        	
        } while (!Arrays.asList(opcionesValidas).contains(respuesta));
        
        switch(respuesta) {
           case 1:
        	  Admin admin = new Admin();
           	  admin.abrirSesion();
              break;
           
           case 2:
        	  Trabajador trabajador = new Trabajador();
        	  trabajador.abrirSesion();
              break;
              
           case 3:
        	  System.out.println("La sesión se ha cerrado con éxito.");
        	  System.exit(0);
              break;
        }
    }
}
