package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEstudiante extends JpaRepository<Estudiante, Long> {
}
