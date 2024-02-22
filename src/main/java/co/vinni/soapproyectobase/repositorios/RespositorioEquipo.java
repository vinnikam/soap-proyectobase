package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RespositorioEquipo extends JpaRepository<Equipo, Long>, JpaSpecificationExecutor<Equipo> {

}
