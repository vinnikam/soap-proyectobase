package co.vinni.soapproyectobase;

import co.vinni.soapproyectobase.controladores.ControladorEquipos;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.utilidades.UtilidadConsola;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * author Vinni 2023
 */
@SpringBootApplication
public class SoapProyectobaseApplication {

    public static void main(String[] args) {
        System.out.println("proyecto base");
        Equipo elequipo = new Equipo();
        String valor = UtilidadConsola.leer("Digite serial :");
        elequipo.setSerial(Long.parseLong(valor));
        valor = UtilidadConsola.leer( "Digite el nombre :");
        elequipo.setNombre(valor);
        valor = UtilidadConsola.leer( "Digite la descripción :");
        elequipo.setDescripcion(valor);

        ControladorEquipos controladorEquipos = new ControladorEquipos();
        controladorEquipos.registrarEquipo(elequipo);
        System.out.println( " - - - -- - - -");
        System.out.println( " - Listado de equipos -");
        List<Equipo> listado = controladorEquipos.consultarEquipos();
        for (Equipo equipo: listado
             ) {
            System.out.println(equipo);
        }
    }

}
