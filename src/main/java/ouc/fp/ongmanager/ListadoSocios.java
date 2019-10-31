package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "socios")
public class ListadoSocios {
	
    private List<Socio> listadoSocios;
    
    @XmlElement(name = "socio")
    public List<Socio> getListadoSocios() {
        return listadoSocios;
    }

   
    public void setListadoSocios(List<Socio> listadoSocios) {
        this.listadoSocios = listadoSocios;
    }

    public void add(Socio s) {
    	
        if (this.listadoSocios == null) {
            this.listadoSocios = new ArrayList<Socio>();
        }
        this.listadoSocios.add(s);

    }

}

