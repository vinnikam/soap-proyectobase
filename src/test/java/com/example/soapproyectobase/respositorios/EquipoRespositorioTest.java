package com.example.soapproyectobase.respositorios;

import static org.assertj.core.api.Assertions.assertThat;

import co.vinni.soapproyectobase.SoapProyectobaseApplication;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@RequiredArgsConstructor
@ContextConfiguration(classes= SoapProyectobaseApplication.class)
@SpringBootTest
public class EquipoRespositorioTest {


    final RespositorioEquipo respositorioEquipo;
    @DisplayName("Test de equipos")
    @Test
    void testGuardarEquipo(){
        //BDD
        //1 GIVEN - CONFIGURACION

        Equipo equipo = Equipo
                .builder()
                .nombre( "Millos")
                .descripcion( "El de bogota ")
                .build();
        //2 WHEN  - ACCION
        Equipo equipoG = respositorioEquipo.save(equipo);
        //3 THEN - VERIFICAR
        assertThat(equipoG).isNotNull();
        assertThat(equipoG.getSerial()).isGreaterThan(0);


    }
}
