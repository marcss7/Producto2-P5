package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "delegaciones")
public class ListadoDelegaciones {
	
    private List<Delegacion> listadoDelegaciones;
    
    @XmlElement(name = "delegacion")
    public List<Delegacion> getListadoDelegaciones() {
        return listadoDelegaciones;
    }

   
    public void setListadoDelegaciones(List<Delegacion> listadoDelegaciones) {
        this.listadoDelegaciones = listadoDelegaciones;
    }

    public void add(Delegacion d) {
    	
        if (this.listadoDelegaciones == null) {
            this.listadoDelegaciones = new ArrayList<Delegacion>();
        }
        this.listadoDelegaciones.add(d);

    }

}

