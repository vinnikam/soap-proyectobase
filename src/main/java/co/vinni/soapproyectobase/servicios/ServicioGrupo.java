package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.entidades.Grupo;
import co.vinni.soapproyectobase.repositorios.RepositorioGrupo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ServicioGrupo {
    RepositorioGrupo repositorioGrupo;

    public void guardar(Grupo grupo)
    {
        repositorioGrupo.save(grupo);
    }

}
