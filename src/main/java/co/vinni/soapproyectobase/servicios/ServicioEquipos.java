package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import co.vinni.soapproyectobase.utilidades.UtilidadArchivos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServicioEquipos implements RespositorioEquipo, Serializable {
    private static final String ARCHIVOEQUIPOS = "equipos.vin";

    private List<Equipo> listaEquipos ;

    public ServicioEquipos(){

        if (listaEquipos == null){
            listaEquipos = consultarEquipos();
        }else{
            listaEquipos = new ArrayList<>();
        }
    }



        @Override
    public void registrarEquipo(Equipo equipo) {
        this.listaEquipos.add(equipo);
        UtilidadArchivos.guardar(ARCHIVOEQUIPOS, this.listaEquipos);
    }

    @Override
    public List<Equipo> consultarEquipos() {
        listaEquipos = (ArrayList<Equipo>)UtilidadArchivos.obtener(ARCHIVOEQUIPOS);
        if (listaEquipos == null){
            listaEquipos = new ArrayList<>();
        }
        return this.listaEquipos;
    }
}
