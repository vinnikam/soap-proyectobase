package co.vinni.soapproyectobase;

import co.vinni.soapproyectobase.controladores.ControladorEquipos;
import co.vinni.soapproyectobase.dto.EquipoDto;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.entidades.Estadio;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

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
        respositorioEquipo.save(equipo);

    }
}
