package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import co.vinni.soapproyectobase.utilidades.UtilidadArchivos;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class ServicioEquipos implements RespositorioEquipo, Serializable {


    @Override
    public void registrarEquipo(Equipo equipo) {
        UtilidadArchivos.guardar("datoequipo", equipo);
    }
}
