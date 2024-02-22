package co.vinni.soapproyectobase;


import co.vinni.soapproyectobase.entidades.Equipo;
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
    RespositorioEquipo repoEquipo;
    @Override
    public void run(String... args) throws Exception {


        Equipo e = new Equipo();
        e.setNombre("Millos");
        e.setDescripcion("Ël equipo de bogota");

        repoEquipo.save(e);

       List<Equipo> listEquip = repoEquipo.findAll();
       for (Equipo equipo : listEquip){
           System.out.println(equipo);

       }

    }
}
