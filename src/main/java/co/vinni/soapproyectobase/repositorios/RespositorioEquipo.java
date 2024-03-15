package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * En este repositorio se usa JPA repository, este tiene funcionalidad  de crud y contextos de persistencia, siendo más completa
 */
public interface RespositorioEquipo extends CrudRepository<Equipo, Long>, JpaSpecificationExecutor<Equipo> {
    @Query( "SELECT e FROM Equipo e JOIN FETCH e.jugadores where e.serial = :serial  ")
    List<Equipo> findEquipoAndEquiposJugadoresById(@Param( "serial") Long serial);

}
