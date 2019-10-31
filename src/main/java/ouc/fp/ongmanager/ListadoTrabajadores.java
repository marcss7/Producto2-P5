package ouc.fp.ongmanager;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trabajadores")
public class ListadoTrabajadores {
	
    private List<Trabajador> listadoTrabajadores;
    
    @XmlElement(name = "trabajador")
    public List<Trabajador> getListadoTrabajadores() {
        return listadoTrabajadores;
    }

   
    public void setListadoTrabajadores(List<Trabajador> listadoTrabajadores) {
        this.listadoTrabajadores = listadoTrabajadores;
    }

    public void add(Trabajador t) {
    	
        if (this.listadoTrabajadores == null) {
            this.listadoTrabajadores = new ArrayList<Trabajador>();
        }
        this.listadoTrabajadores.add(t);

    }

}
