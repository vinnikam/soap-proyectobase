package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.entidades.Equipo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServicioEquiposTest {
    ServicioEquipos servicio = new ServicioEquipos();

    ServicioEquiposTest(){
        servicio.registrarEquipo(new Equipo(1,"Millos",  "Ëquipo de Bogota"));
        servicio.registrarEquipo(new Equipo(2,"Fortaleza",  "Ëquipo de Bogota"));
        servicio.registrarEquipo(new Equipo(3,"Equidad",  "Ëquipo de Bogota"));

    }

    @Test
    void registrarEquipo() {


        Equipo e = new Equipo();

        servicio.registrarEquipo(e);
        servicio.registrarEquipo(new Equipo(1,"Millos",  "Ëquipo de Bogota"));
        List<Equipo> lista = servicio.consultarEquipos();
        Assertions.assertTrue(lista.size()>3);

    }

    @Test
    void consultarEquipos() {
        List<Equipo> lista = servicio.consultarEquipos();
        Assertions.assertEquals(3, lista.size());
    }
}
