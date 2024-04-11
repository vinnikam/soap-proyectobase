package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Equipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class RespositorioEquipoTest {

    @Autowired
    RespositorioEquipo respositorioEquipo;

    @Autowired
    TestEntityManager testEntityManager;
    @BeforeEach
    void setUp() {

    }
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
