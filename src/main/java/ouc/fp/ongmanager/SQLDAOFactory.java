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
	public DAO<Trabajador> getTrabajadorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que permite acceder a un socio SQL data object.
	 * 
	 * @return Nos devuelve un socio SQL data object
	 */
	@Override
	public DAO<Socio> getSocioDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que permite acceder a un delegacion SQL data object.
	 * 
	 * @return Nos devuelve un delegacion SQL data object
	 */
	@Override
	public DAO<Delegacion> getDelegacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
