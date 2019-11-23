package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

/**
 * Esta clase representa a la persona encargada de crear los proyectos, modificarlos,
 * asignar el personal y gestionar la financiación de la ONG.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class Admin extends Personal implements Usuario {
	
	// CAMPOS
	
	private String rootPass;
	private DAOFactory xmlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
	private DAOFactory sqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.SQL);
	private DAO<Trabajador> xmlTrabajadorDAO = (XMLTrabajadorDAO) xmlDAOFactory.getTrabajadorDAO();
	private DAO<Trabajador> sqlTrabajadorDAO = (SQLTrabajadorDAO) sqlDAOFactory.getTrabajadorDAO();
	private DAO<Delegacion> xmlDelegacionDAO = (XMLDelegacionDAO) xmlDAOFactory.getDelegacionDAO();
	private DAO<Delegacion> sqlDelegacionDAO = (SQLDelegacionDAO) sqlDAOFactory.getDelegacionDAO();
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor que crea un nuevo objeto Admin sin inicializar sus campos.
	 * 
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public Admin() throws JAXBException {
		super();
	}


	/**
	 * Constructor que crea un nuevo objeto Admin inicializando sus campos.
	 * 
	 * @param nombre Atributo que guarda el nombre de la persona.
	 * @param apellidos Atributo que guarda los apellidos de la persona.
	 * @param id Atributo que guarda el id de la persona.
	 * @param email Atributo que guarda el email de la persona.
	 * @param telefono Atributo que guarda el telefono de la persona.
	 * @param direccion Atributo que guarda la direccion de la persona.
	 * @param delegacionAsignada Atributo que guarda el nombre de la delegacion asignada a la persona.
	 * @param antiguedad Atributo que guarda la antiguedad en la ong de la persona.
	 * @param proyectosAsignados Atributo que guarda los proyectos asignados a la persona.
	 * @param horarioLaboral Atributo que guarda el horario laboral de la persona.
	 * @param pass Atributo que guarda la contraseña de loggin de la persona.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public Admin(String nombre, String apellidos, String id, String email,
			     String telefono, String direccion, Delegacion delegacionAsignada,
			     Date antiguedad, ListadoProyectos proyectosAsignados,
			     String horarioLaboral, String pass) throws JAXBException {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.rootPass = pass;
	}


	// METODOS
	
	/**
	 * Metodo accesor de lectura que nos da la password del admin.
	 * 
	 * @return Nos devuelve la password del admin. 
	 */
	public String getRootPass() {
		return rootPass;
	}

	/**
	 * Metodo accesor de escritura que asigna la password del admin.
	 * 
	 * @param rootPass password del admin. 
	 */
	public void setRootPass(String rootPass) {
		this.rootPass = rootPass;
	}

	/**
	 * Metodo que genera el menu de acciones que puede realizar el admin
	 * en la aplicacion cuando inicia sesion.
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws XPathExpressionException 
	 * @throws SQLException 
	 */
	@Override
	public void abrirSesion() throws IOException, JAXBException, XPathExpressionException, ParserConfigurationException, SAXException, SQLException {
		    	
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
        		  
        		  do {
        			  System.out.println("¿Deseas dar de alta otro trabajador? (S/N)");
            		  respuestaNuevaAccion = br.readLine();
        		  } while (!respuestaNuevaAccion.equalsIgnoreCase("s") && !respuestaNuevaAccion.equalsIgnoreCase("n"));
        		  
        		  if (respuestaNuevaAccion.equalsIgnoreCase("s")) {
        			  darAltaTrabajador();
      				}
        		  
        	  } while (!respuestaNuevaAccion.equalsIgnoreCase("n"));
        	  
        	  abrirSesion();
        	  
              break;
           
           case 2:
           	  imprimirListadoTrabajadores();
           	  abrirSesion();
              break;
              
           case 3:
         	  darAltaDelegacion();
         	  
        	  do {
        		  
        		  do {
        			  System.out.println("¿Deseas dar de alta otra delegación? (S/N)");
            		  respuestaNuevaAccion = br.readLine();
        		  } while (!respuestaNuevaAccion.equalsIgnoreCase("s") && !respuestaNuevaAccion.equalsIgnoreCase("n"));
        		  
        		  if (respuestaNuevaAccion.equalsIgnoreCase("s")) {
        			  darAltaDelegacion();
      				}
        		  
        	  } while (!respuestaNuevaAccion.equalsIgnoreCase("n"));
        	  
        	  abrirSesion();
         	  
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

	/**
	 * Metodo que permite al empleado consultar el listado de proyectos
	 * en los que esta trabajando la ONG y realizar una serie de acciones.
	 */
	@Override
	public void consultarProyectos(ListadoProyectos lp) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Metodo que permite al administrador consultar el listado
	 * de trabajadores de la ONG.
	 * 
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public void imprimirListadoTrabajadores() throws JAXBException {
		xmlTrabajadorDAO.obtenerTodos();
	}
	
	/**
	 * Metodo que permite al administrador consultar el listado
	 * de delegaciones de la ONG.
	 * 
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public void imprimirListadoDelegaciones() throws JAXBException {
		xmlDelegacionDAO.obtenerTodos();
	}
	
	/**
	 * Metodo que permite al empleado introducir por consola los
	 * datos de alta de un nuevo trabajador.
	 * 
	 * @throws IOException si se produce un error de entrada/salida.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws XPathExpressionException 
	 * @throws SQLException 
	 */
	private void darAltaTrabajador() throws IOException, JAXBException, XPathExpressionException, ParserConfigurationException, SAXException, SQLException {
		Trabajador nuevoTrabajador = new Trabajador();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre del trabajador: ");
		nuevoTrabajador.setNombre(br.readLine());
		System.out.println("\nIntroduce los apellidos del trabajador: ");
		nuevoTrabajador.setApellidos(br.readLine());
		System.out.println("\nIntroduce el NIF del trabajador: ");
		nuevoTrabajador.setId(br.readLine());
		System.out.println("\nIntroduce el email del trabajador: ");
		nuevoTrabajador.setEmail(br.readLine());
		boolean exito = false;
		while (!exito) {
		System.out.println("\nIntroduce el teléfono del trabajador: ");
			try {
				String numero = br.readLine();
				validarNumeroTelefono(numero);
				nuevoTrabajador.setTelefono(numero);
				exito = true;
			} catch (TelefonoNoValidoException e) {
				System.out.println("Número no válido, por favor, introduzca un número de teléfono válido."); 
			}
		}
		System.out.println("\nIntroduce la dirección del trabajador: ");
		nuevoTrabajador.setDireccion(br.readLine());
		exito = false;
		while (!exito) {
		System.out.println("\nIntroduce el número ID de la delegación del trabajador: ");
			try {
				Delegacion d = new Delegacion();
				d.setIdDelegacion(Integer.parseInt(br.readLine()));
				nuevoTrabajador.setDelegacionAsignada(d);
				exito = true;
			} catch (NumberFormatException e) {
				System.out.println("La entrada recibida no es del tipo correcto, por favor, asegúrese de estar introduciendo un número entero y que este sea válido (es decir, que el ID introducido exista y este asignado en la base de datos).");
			}
		}
		System.out.println("\nIntroduce el horario del trabajador: ");
		nuevoTrabajador.setHorarioLaboral(br.readLine());
		Date date = new Date();
		nuevoTrabajador.setAntiguedad(date);
		Random random = new Random();
		String pass = String.format("%06d", random.nextInt(1000000));
		nuevoTrabajador.setPass(pass);
		xmlTrabajadorDAO.crearNuevo(nuevoTrabajador);
		sqlTrabajadorDAO.crearNuevo(nuevoTrabajador);
		
	}
	
	/**
	 * Metodo que permite al empleado introducir por consola los
	 * datos de alta de una nueva delegacion.
	 * 
	 * @throws IOException si se produce un error de entrada/salida.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws XPathExpressionException 
	 * @throws SQLException 
	 */
	private void darAltaDelegacion() throws IOException, JAXBException, XPathExpressionException, ParserConfigurationException, SAXException, SQLException {
		Delegacion nuevaDelegacion = new Delegacion();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre de la delegación: ");
		nuevaDelegacion.setNombreDelegacion(br.readLine());
		System.out.println("\nIntroduce la dirección de la delegación: ");
		nuevaDelegacion.setDireccion(br.readLine());
		boolean exito = false;
		while (!exito) {
			System.out.println("\nIntroduce el teléfono de la delegación: ");
			try {
				String numero = br.readLine();
				validarNumeroTelefono(numero);
				nuevaDelegacion.setTelefono(numero);
				exito = true;
			} catch (TelefonoNoValidoException e) {
				System.out.println("Número no válido, por favor, introduzca un número de teléfono válido.");
			}
		}
		System.out.println("\nEs sede central (S/N): ");
		if (br.readLine().equalsIgnoreCase("s")) {
			nuevaDelegacion.setIsSedeCentral(true);
		} else {
			nuevaDelegacion.setIsSedeCentral(false);			
		}
		
		xmlDelegacionDAO.crearNuevo(nuevaDelegacion);
		sqlDelegacionDAO.crearNuevo(nuevaDelegacion);
		
	}
	
	/**
	 * Metodo que valida si el numero de telefono introducido es correcto.
	 * 
	 * @param numero Numero de telefono introducido.
	 */
	private void validarNumeroTelefono(String numero) {
		final String regexStr = "^(\\+34|0034|34)?[6789]\\d{8}$";
		if (!Pattern.matches(regexStr, numero)) {
			throw new TelefonoNoValidoException(numero);
		}
	}

}
