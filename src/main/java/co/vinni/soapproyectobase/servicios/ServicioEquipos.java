package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.EquipoDto;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ServicioEquipos implements Serializable {


    private ModelMapper modelMapper;

    @Autowired
    RespositorioEquipo repoEquipo;

    public void registrarEquipo(EquipoDto equipoDto) {

        repoEquipo.save(modelMapper.map(equipoDto, Equipo.class));
    }
    public List<EquipoDto> obtenerEquipos() {
        TypeToken<List<EquipoDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repoEquipo.findAll(), typeToken.getType());

    }
}
