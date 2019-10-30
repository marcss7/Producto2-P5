package ouc.fp.ongmanager;

public class XMLDAOFactory extends DAOFactory {

	@Override
	public XMLTrabajadorDAO getTrabajadorDAO() {
		return new XMLTrabajadorDAO();
	}

	@Override
	public XMLSocioDAO getASocioDAO() {
		// TODO Auto-generated method stub
		return new XMLSocioDAO();
	}

	@Override
	public XMLDelegacionDAO getDelegacionDAO() {
		// TODO Auto-generated method stub
		return new XMLDelegacionDAO();
	}

}
