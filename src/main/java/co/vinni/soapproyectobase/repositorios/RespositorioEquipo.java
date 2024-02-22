package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Equipo;

import java.util.List;

public interface RespositorioEquipo {
    public void registrarEquipo(Equipo equipo);
    public List<Equipo> consultarEquipos();
}
