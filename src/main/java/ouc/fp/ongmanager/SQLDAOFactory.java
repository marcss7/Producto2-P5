package ouc.fp.ongmanager;

/**
 * Esta clase factoria se usa para crear DAOs que usan
 * SQL para el almacenaje de los modelos.
 * 
 * @author Yaiza, Teresa y Marc.
 * @version 1.0
 *
 */
public class SQLDAOFactory extends DAOFactory {
	
	/**
	 * Metodo que permite acceder a un trabajador SQL data object.
	 * 
	 * @return Nos devuelve un trabajador SQL data object
	 */
	@Override
	public SQLTrabajadorDAO getTrabajadorDAO() {
		return new SQLTrabajadorDAO();
	}

	/**
	 * Metodo que permite acceder a un socio SQL data object.
	 * 
	 * @return Nos devuelve un socio SQL data object
	 */
	@Override
	public SQLSocioDAO getSocioDAO() {
		// TODO Auto-generated method stub
		return new SQLSocioDAO();
	}

	/**
	 * Metodo que permite acceder a un delegacion SQL data object.
	 * 
	 * @return Nos devuelve un delegacion SQL data object
	 */
	@Override
	public SQLDelegacionDAO getDelegacionDAO() {
		// TODO Auto-generated method stub
		return new SQLDelegacionDAO();
	}

}
