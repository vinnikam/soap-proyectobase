package co.vinni.soapproyectobase.utilidades;

import co.vinni.soapproyectobase.entidades.Equipo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilidadArchivosTest {


    @Test
    @DisplayName("Test registrar objeto en archivo")
    void registrarObjeto() {
        Equipo equipo = Equipo
                .builder()
                .nombre("MILLOS")
                .descripcion("EL AZUL")
                .build();
        boolean rta =this.guardarObjeto(equipo);
        Assertions.assertTrue(rta);
    }
    @Test
    @DisplayName("Test registrar objeto en archivo")
    void leerObjeto() {
        Equipo equipo = Equipo
                .builder()
                .nombre("MILLOS")
                .descripcion("EL AZUL")
                .build();
        this.guardarObjeto(equipo);
        Equipo elequipo = (Equipo)UtilidadArchivos.obtener ("prueba.txt");
        System.out.println(elequipo);
        Assertions.assertNotNull(elequipo);
    }
    private boolean guardarObjeto(Object equipo){
        return UtilidadArchivos.guardar("prueba.txt", equipo);
    }


}
