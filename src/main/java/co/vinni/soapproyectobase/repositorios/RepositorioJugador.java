package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Jugador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * En este repositorio se usa Crud repository, este tiene funcionalidad  de crud
 */
public interface RepositorioJugador extends CrudRepository<Jugador, Long> ,JpaSpecificationExecutor<Jugador>{
}
