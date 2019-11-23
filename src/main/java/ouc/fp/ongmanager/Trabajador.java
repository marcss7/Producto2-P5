package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

/**
 * Esta clase representa a cada uno de los miembros del personal de la ONG
 * que tienen un contrato de trabajo y tienen un horario laboral.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
@XmlRootElement(name = "trabajador")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"idTrabajador", "horarioLaboral", "pass"})
public class Trabajador extends Personal implements Usuario {

	// CAMPOS

	private String horarioLaboral;
	private String pass;
	private int idTrabajador;
	private DAOFactory xmlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
	private DAO<Socio> xmlSocioDAO = (XMLSocioDAO) xmlDAOFactory.getSocioDAO();
	private DAOFactory sqlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.SQL);
	private DAO<Socio> sqlSocioDAO = (SQLSocioDAO) sqlDAOFactory.getSocioDAO();


	// CONSTRUCTORES

	/**
	 * Constructor que crea un nuevo objeto Trabajador sin inicializar sus campos.
	 * 
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public Trabajador() throws JAXBException {
		super();
	}

	/**
	 * Constructor que crea un nuevo objeto Trabajador inicializando sus campos.
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
	 * @param pass Atributo que guarda la password de loggin de la persona.
	 * @param id_trabajador Atributo que guarda el id del trabajador.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public Trabajador(String nombre, String apellidos, String id, String email,
					  String telefono, String direccion, Delegacion delegacionAsignada,
					  Date antiguedad, ListadoProyectos proyectosAsignados,
					  String horarioLaboral, String pass, int idTrabajador) throws JAXBException {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.horarioLaboral = horarioLaboral;
		this.pass = pass;
		this.idTrabajador = idTrabajador;
	}


	// MÉTODOS

	/**
	 * Metodo accesor de lectura que nos da el horario laboral del trabajador.
	 * 
	 * @return Nos devuelve el horario laboral del trabajador.
	 */
	@XmlElement(name = "horario")
	public String getHorarioLaboral() {
		return horarioLaboral;
	}


	/**
	 * Metodo accesor de escritura que asigna el horario laboral del trabajador.
	 * 
	 * @param horarioLaboral El horario laboral del trabajador.
	 */
	public void setHorarioLaboral(String horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}


	/**
	 * Metodo accesor de lectura que nos da la password del trabajador.
	 * 
	 * @return Nos devuelve la password del trabajador.
	 */
	@XmlElement(name = "pass")
	public String getPass() {
		return pass;
	}

	/**
	 * Metodo accesor de lectura que asigna la password del trabajador.
	 * 
	 * @param pass La password del trabajador.
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	/**
	 * Metodo accesor de lectura que nos da el id del trabajador.
	 * 
	 * @return Nos devuelve el id del trabajador.
	 */
	@XmlElement(name = "idTrabajador")
	public int getIdTrabajador() {
		return idTrabajador;
	}

	/**
	 * Metodo accesor de lectura que asigna el id del trabajador.
	 * 
	 * @param id_trabajador El id del trabajador.
	 */
	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	/**
	 * Metodo que genera el menu de acciones que puede realizar el trabajador
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
		Integer[] opcionesValidas = {1, 2, 3};
		String respuestaNuevaAccion;

		System.out.println("\n**********************");
		System.out.println(" Opciones de empleado");
		System.out.println("**********************");

		do {

			System.out.println("\nPor favor, introduce el número de la acción que deseas realizar: ");
			System.out.println("1 - Dar de alta un socio");
			System.out.println("2 - Imprimir listado de socios");
			System.out.println("3 - Salir");

			try {
				respuestaOpcion = Integer.parseInt(br.readLine());
			} catch(NumberFormatException nfe) {
				System.out.println("Los caracteres introducidos no son válidos.");
			}

		} while (!Arrays.asList(opcionesValidas).contains(respuestaOpcion));

		switch(respuestaOpcion) {

		case 1:
			darAltaSocio();

			do {

				do {
					System.out.println("¿Deseas dar de alta otro socio? (S/N)");
					respuestaNuevaAccion = br.readLine();
				} while (!respuestaNuevaAccion.equalsIgnoreCase("s") && !respuestaNuevaAccion.equalsIgnoreCase("n"));

				if (respuestaNuevaAccion.equalsIgnoreCase("s")) {
					darAltaSocio();
				}

			} while (!respuestaNuevaAccion.equalsIgnoreCase("n"));

			abrirSesion();

			break;

		case 2:
			imprimirListadoSocios();
			abrirSesion();

			break;

		case 3:
			System.out.println("La sesión se ha cerrado con éxito.");
			System.exit(0);

			break;

		}

	}

	/**
	 * Metodo que permite al empleado consultar el listado de proyectos
	 * en los que esta trabajando la ONG.
	 */
	@Override
	public void consultarProyectos(ListadoProyectos lp) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea una cadena de caracteres con los datos del trabajador.
	 * 
	 * @return Cadena con los datos del trabajador.
	 */
	@Override
	public String toString() {
		return this.nombre + " " + this.apellidos + " (ID empleado - " + this.id + ")";
	}

	/**
	 * Metodo que permite al empleado consultar el listado de socios.
	 * 
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public void imprimirListadoSocios() throws JAXBException {
		xmlSocioDAO.obtenerTodos();
	}

	/**
	 * Metodo que permite al empleado introducir por consola los
	 * datos de alta de un nuevo socio.
	 * 
	 * @throws IOException si se produce un error de entrada/salida.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws XPathExpressionException 
	 * @throws SQLException 
	 */
	private void darAltaSocio() throws IOException, JAXBException, XPathExpressionException, ParserConfigurationException, SAXException, SQLException {

		Socio nuevoSocio = new Socio();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre del socio: ");
		nuevoSocio.setNombre(br.readLine());
		System.out.println("\nIntroduce los apellidos del socio: ");
		nuevoSocio.setApellidos(br.readLine());
		System.out.println("\nIntroduce el NIF del socio: ");
		nuevoSocio.setId(br.readLine());
		System.out.println("\nIntroduce el email del socio: ");
		nuevoSocio.setEmail(br.readLine());
		boolean exito = false;
		while(!exito) {
		System.out.println("\nIntroduce el teléfono del socio: ");
        	try {
        		String numero = br.readLine();
        		validarNumeroTelefono(numero);
        		nuevoSocio.setTelefono(numero);
        		exito = true;
        	} catch (TelefonoNoValidoException e) {
        		System.out.println("Número no válido, por favor, introduzca un número de teléfono válido."); 
        	}
		}
		System.out.println("\nIntroduce la dirección del socio: ");
		nuevoSocio.setDireccion(br.readLine());
		exito = false;
		while (!exito) {
		System.out.println("\nIntroduce el tipo de aportacion del socio (M/T/A): ");
				switch (br.readLine().toUpperCase()) {
					case "M":
						nuevoSocio.setPeriodicidadCuota(TipoAportacion.MENSUAL);
						exito = true;
						break;
		
					case "T":
						nuevoSocio.setPeriodicidadCuota(TipoAportacion.TRIMESTRAL);
						exito = true;
						break;
		
					case "A":
						nuevoSocio.setPeriodicidadCuota(TipoAportacion.ANUAL);
						exito = true;
						break;
		
					default:
						break;
				}
				if(!exito) {System.out.println("Solo se aceptan los valores M, T y A, por favor, introduzca uno de los valores válidos."); }
		}
		exito = false;
		while (!exito) {
		System.out.println("\nIntroduce el importe de la cuota del socio: ");
			try {
				nuevoSocio.setImporteCuota(Float.parseFloat(br.readLine()));
				exito = true;
			} catch (NumberFormatException e) {
				System.out.println("La entrada recibida no es del tipo correcto, por favor, asegúrese de estar introduciendo un número.");
			}
		}
		xmlSocioDAO.crearNuevo(nuevoSocio);
		sqlSocioDAO.crearNuevo(nuevoSocio);

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
