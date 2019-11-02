package ouc.fp.ongmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
@XmlType(propOrder={"horarioLaboral", "pass"})
public class Trabajador extends Personal implements Usuario {

	// CAMPOS

	private String horarioLaboral;
	private String pass;
	private DAOFactory xmlDAOFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
	private DAO<Socio> socioDAO = (XMLSocioDAO) xmlDAOFactory.getSocioDAO();


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
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public Trabajador(String nombre, String apellidos, String id, String email,
			int telefono, String direccion, Delegacion delegacionAsignada,
			Date antiguedad, ListadoProyectos proyectosAsignados,
			String horarioLaboral, String pass) throws JAXBException {
		super(nombre, apellidos, id, email, telefono, direccion, delegacionAsignada, antiguedad, proyectosAsignados);
		this.horarioLaboral = horarioLaboral;
		this.pass = pass;
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
	 * Metodo que genera el menu de acciones que puede realizar el trabajador
	 * en la aplicacion cuando inicia sesion.
	 */
	@Override
	public void abrirSesion() throws IOException, JAXBException {
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
		socioDAO.obtenerTodos();
	}

	/**
	 * Metodo que permite al empleado introducir por consola los
	 * datos de alta de un nuevo socio.
	 * 
	 * @throws IOException si se produce un error de entrada/salida.
	 * @throws JAXBException si se produce una excepción de tipo JAXB.
	 */
	public void darAltaSocio() throws IOException, JAXBException {

		Socio nuevoSocio = new Socio();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIntroduce el nombre del socio: ");
		nuevoSocio.setNombre(br.readLine());
		System.out.println("\nIntroduce los apellidos del socio: ");
		nuevoSocio.setApellidos(br.readLine());
		System.out.println("\nIntroduce el ID del socio: ");
		nuevoSocio.setIdSocio(br.readLine());
		System.out.println("\nIntroduce el email del socio: ");
		nuevoSocio.setEmail(br.readLine());
		System.out.println("\nIntroduce el teléfono del socio: ");
        try {
        	nuevoSocio.setTelefono((Integer.parseInt(br.readLine())));
        } catch (Exception e) {
        	nuevoSocio.setTelefono(000000000);
        }
		System.out.println("\nIntroduce el tipo de aportacion del socio (M/T/A): ");
		switch (br.readLine()) {
			case "M":
				nuevoSocio.setPeriodicidadCuota(TipoAportacion.MENSUAL);
				break;
	
			case "T":
				nuevoSocio.setPeriodicidadCuota(TipoAportacion.TRIMESTRAL);
				break;
	
			case "A":
				nuevoSocio.setPeriodicidadCuota(TipoAportacion.ANUAL);
				break;
	
			default:
				break;
		}

		socioDAO.crearNuevo(nuevoSocio);

	}

}
