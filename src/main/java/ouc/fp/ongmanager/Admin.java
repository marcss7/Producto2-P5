package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.JAXBException;

public class Admin extends Personal implements Usuario {
	
	private String rootPass;
	private DAOFactory xmlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
	private DAO<Trabajador> trabajadorDAO = (XMLTrabajadorDAO) xmlDAOFactory.getTrabajadorDAO();
	private DAO<Delegacion> delegacionDAO = (XMLDelegacionDAO) xmlDAOFactory.getDelegacionDAO();
	
	public Admin() throws JAXBException {
		super();
	}


	public Admin(String nombre, String apellidos, String id, String email, int telefono, String direccion, Delegacion delegacionAsignada, Date antiguedad, ListadoProyectos proyectosAsignados, String horarioLaboral, String pass) throws JAXBException {
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
	public void abrirSesion() throws IOException, JAXBException {
		    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int respuestaOpcion = 0;
		Integer[] opcionesValidas = {1, 2, 3, 4, 5};
  	    String respuestaNuevaAccion;
		
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
        	
        } while (!Arrays.asList(opcionesValidas).contains(respuestaOpcion));
        
        switch(respuestaOpcion) {
        
           case 1:
        	   
        	  darAltaTrabajador();

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
         	  darAltaDelegacion();

         	  do {
         		  System.out.println("¿Daseas dar de alta otra delegación? (S/N)");
         		  respuestaNuevaAccion = br.readLine();
         		
         			if (respuestaNuevaAccion.equalsIgnoreCase("s")) {
         				darAltaDelegacion();
         			} else {
         				abrirSesion();
         			}
         			
         	  } while (respuestaNuevaAccion.equalsIgnoreCase("s"));
         	  
               break;
               
           case 4:
        	   imprimirListadoDelegaciones();
        	   abrirSesion();
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
	
	public void imprimirListadoTrabajadores() throws JAXBException {
		trabajadorDAO.obtenerTodos();
	}
	
	public void imprimirListadoDelegaciones() throws JAXBException {
		delegacionDAO.obtenerTodos();
	}
	
	public void darAltaTrabajador() throws IOException, JAXBException {
		Trabajador nuevoTrabajador = new Trabajador();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre del trabajador: ");
		nuevoTrabajador.setNombre(br.readLine());
		System.out.println("\nIntroduce los apellidos del trabajador: ");
		nuevoTrabajador.setApellidos(br.readLine());
		System.out.println("\nIntroduce el ID del trabajador: ");
		nuevoTrabajador.setId(br.readLine());
		System.out.println("\nIntroduce el teléfono del trabajador: ");
		nuevoTrabajador.setTelefono((Integer.parseInt(br.readLine())));
		trabajadorDAO.crearNuevo(nuevoTrabajador);
		
	}
	
	public void darAltaDelegacion() throws IOException, JAXBException {
		Delegacion nuevaDelegacion = new Delegacion();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre de la delegación: ");
		nuevaDelegacion.setNombreSucursal(br.readLine());
		System.out.println("\nIntroduce el ID de la delegación: ");
		nuevaDelegacion.setIdSucursal(br.readLine());
		System.out.println("\nEs sede central (S/N): ");
		if (br.readLine().equalsIgnoreCase("s")) {
			nuevaDelegacion.setIsSedeCentral(true);
		} else {
			nuevaDelegacion.setIsSedeCentral(false);			
		}
		
		delegacionDAO.crearNuevo(nuevaDelegacion);
		
	}

}
