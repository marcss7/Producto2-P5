package ouc.fp.ongmanager;

public abstract class DAOFactory {

	// Lista de tipos DAO soportado por la factoría.
	  public static final int XML = 1;
	  public static final int SQL = 2;

	  // Hay un método para cada DAO que puede ser creado.
	  // Las factorías tendrán que implementar estos métodos.
	  public abstract DAO getTrabajadorDAO();
	  public abstract DAO getSocioDAO();
	  public abstract DAO getDelegacionDAO();

	  public static DAOFactory getDAOFactory(int whichFactory) {
	  
	    switch (whichFactory) {
	      case 1: 
	          return new XMLDAOFactory();
	      case 2: 
	          return new SQLDAOFactory();
	      default: 
	          return null;
	    }
	  }
	
}
