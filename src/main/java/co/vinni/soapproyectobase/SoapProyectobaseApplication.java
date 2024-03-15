package co.vinni.soapproyectobase;

import co.vinni.soapproyectobase.controladores.ControladorEquipos;
import co.vinni.soapproyectobase.dto.EquipoDto;
import co.vinni.soapproyectobase.entidades.Ciudad;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.entidades.Estadio;
import co.vinni.soapproyectobase.entidades.Jugador;
import co.vinni.soapproyectobase.repositorios.RepositorioCiudad;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * author Vinni 2023
 */
@SpringBootApplication
@Log4j2
public class SoapProyectobaseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SoapProyectobaseApplication.class, args);
        System.out.println("proyecto base");

    }
    @Autowired
    RespositorioEquipo respositorioEquipo;

    @Autowired
    RepositorioCiudad repositorioCiudad;
    @Override
    public void run(String... args) throws Exception {
        /** Ejemplo de creacion del equipo y el estadio **/
        Equipo equipo = new Equipo()  ;
        equipo.setNombre( "Millos");
        equipo.setDescripcion("El de Bogota");
        Estadio estadio= new Estadio();
        estadio.setCiudad("Bogotá");
        estadio.setNombre("El campin");
        estadio.setEquipo(equipo);
        equipo.setEstadio(estadio);


        System.out.println( " Creacion de Jugadores");
        Jugador jugador = new Jugador(0, "Matias", "Delantero ", equipo);
        Jugador jugador1 = new Jugador(0, "Matias1", "Delantero1 ", equipo);

        List<Jugador> jugadorList = new ArrayList<>();
        jugadorList.add(jugador);
        jugadorList.add(jugador1);

        equipo.setJugadores(jugadorList);
        Equipo equipoSave = respositorioEquipo.save(equipo);

        System.out.println(equipoSave.getNombre());
        equipoSave.getJugadores().forEach(dato -> {
            System.out.println(dato.getNombre());
        });
        Equipo equipo2 = new Equipo()  ;
        equipo2.setNombre( "Millos");
        equipo2.setDescripcion("El de Bogota");

        respositorioEquipo.save(equipo2);

        List<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo);
        equipos.add(equipo2);

        Ciudad ciudad1 = new Ciudad(0,"Bogota", equipos);

        List<Equipo> equipos1 = new ArrayList<>();
        equipos1.add(equipo);
        Ciudad ciudad2 = new Ciudad(0,"Bogota", equipos1);

        repositorioCiudad.save(ciudad1);
        repositorioCiudad.save(ciudad2);


        Optional elqui = respositorioEquipo.findById(equipoSave.getSerial());
        List<Equipo> otros1 = respositorioEquipo.findEquipoAndEquiposJugadoresById(equipoSave.getSerial());

//        if (elqui.get() != null){
//            Equipo otro = (Equipo) elqui.get();
//            System.out.println(otro.getNombre());
//           List<Jugador> otros =  otro.getJugadores();
//            otros.forEach(dato -> {
//                System.out.println(dato.getNombre());
//            });
//        }


    }
}
