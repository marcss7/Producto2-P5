package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Admin extends Personal implements Usuario {
	
	private String rootPass;
	private DAOFactory xmlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
	private DAO<Trabajador> trabajadorDAO = (XMLTrabajadorDAO) xmlDAOFactory.getTrabajadorDAO();
	
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
		int respuestaOpcion = 0;
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
        		respuestaOpcion = Integer.parseInt(br.readLine());
            } catch(NumberFormatException nfe) {
                System.out.println("Los caracteres introducidos no son válidos.");
            }
        	
        } while (Arrays.asList(opcionesValidas).contains(respuestaOpcion));
        
        switch(respuestaOpcion) {
        
           case 1:
        	   
        	  darAltaTrabajador();
        	  
        	  String respuestaNuevaAccion;

        	  do {
        		  System.out.println("¿Daseas dar de alta otro trabajador? (S/N)");
        		  respuestaNuevaAccion = br.readLine();
        		
        			if (respuestaNuevaAccion.equalsIgnoreCase("s")) {
        				darAltaTrabajador();
        			} else {
        				abrirSesion();
        			}
        			
        	  } while (respuestaNuevaAccion.equalsIgnoreCase("s"));
        	  
              break;
           
           case 2:
           	  imprimirListadoTrabajadores();
           	  abrirSesion();
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
	
	public void imprimirListadoTrabajadores() {
		trabajadorDAO.obtenerTodos();
		
	}
	
	public void darAltaTrabajador() throws IOException {
		Trabajador nuevoTrabajador = new Trabajador();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre del trabajador: ");
		nuevoTrabajador.setNombre(br.readLine());
		System.out.println("\nIntroduce los apellidos del trabajador: ");
		nuevoTrabajador.setApellidos(br.readLine());
		System.out.println("\nIntroduce el ID del trabajador: ");
		nuevoTrabajador.setId(br.readLine());
//		System.out.println("\nIntroduce el email del trabajador: ");
//		nuevoTrabajador.setEmail(br.readLine());
//		System.out.println("\nIntroduce la direccion del trabajador: ");
//		nuevoTrabajador.setDireccion(br.readLine());
//		System.out.println("\nIntroduce el horario del trabajador: ");
//		nuevoTrabajador.setHorarioLaboral(br.readLine());
		trabajadorDAO.crearNuevo(nuevoTrabajador);
		
	}

}
