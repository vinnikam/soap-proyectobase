package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.servicios.ServicioEquipos;

import java.util.List;

public class ControladorEquipos {

    private ServicioEquipos servicioEquipos;

    public ControladorEquipos() {
        this.servicioEquipos = new ServicioEquipos();
    }

    public void registrarEquipo(Equipo equipo) {
        servicioEquipos.registrarEquipo(equipo);
    }
    public List<Equipo> consultarEquipos(){
        return this.servicioEquipos.consultarEquipos();
    }
}
