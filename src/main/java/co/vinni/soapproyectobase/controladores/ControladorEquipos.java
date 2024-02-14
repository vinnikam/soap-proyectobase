package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.servicios.ServicioEquipos;
import org.springframework.beans.factory.annotation.Autowired;

public class ControladorEquipos {

    @Autowired
    ServicioEquipos servicioEquipos;

    public void registrarEquipo(Equipo equipo) {
        servicioEquipos.registrarEquipo(equipo);
    }
}
