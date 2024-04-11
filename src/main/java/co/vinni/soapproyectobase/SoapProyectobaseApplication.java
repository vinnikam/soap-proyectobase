package co.vinni.soapproyectobase;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * author Vinni 2023
 */
@SpringBootApplication
@Log4j2
public class SoapProyectobaseApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SoapProyectobaseApplication.class, args);
        System.out.println("proyecto base + test");

    }



}
