package ouc.fp.ongmanager;

/**
 * Esta clase factoria se usa para crear DAOs que usan
 * XML para el almacenaje de los modelos.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class XMLDAOFactory extends DAOFactory {

	/**
	 * Metodo que permite acceder a un trabajador XML data object.
	 * 
	 * @return Nos devuelve un trabajador XML data object
	 */
	@Override
	public XMLTrabajadorDAO getTrabajadorDAO() {
		return new XMLTrabajadorDAO();
	}

	/**
	 * Metodo que permite acceder a un socio XML data object.
	 * 
	 * @return Nos devuelve un socio XML data object
	 */
	@Override
	public XMLSocioDAO getSocioDAO() {
		// TODO Auto-generated method stub
		return new XMLSocioDAO();
	}

	/**
	 * Metodo que permite acceder a un delegacion XML data object.
	 * 
	 * @return Nos devuelve un delegacion XML data object
	 */
	@Override
	public XMLDelegacionDAO getDelegacionDAO() {
		// TODO Auto-generated method stub
		return new XMLDelegacionDAO();
	}

}
