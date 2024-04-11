package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.EquipoDto;
import co.vinni.soapproyectobase.entidades.Equipo;
import co.vinni.soapproyectobase.exception.ResourceNotFoundException;
import co.vinni.soapproyectobase.repositorios.RespositorioEquipo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ServicioEquipos implements Serializable {


    final ModelMapper modelMapper;

    private final RespositorioEquipo repoEquipo;

    public EquipoDto registrar(EquipoDto equipoDto) {

        Equipo elEquipo = repoEquipo.save(modelMapper.map(equipoDto, Equipo.class));
        return modelMapper.map(elEquipo, EquipoDto.class);
    }
    public List<EquipoDto> obtenerEquipos() {
        TypeToken<List<EquipoDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repoEquipo.findAll(), typeToken.getType());

    }
    public EquipoDto obtenerEquipo(long serial) {
        Equipo equipo = repoEquipo.findById(serial).orElseThrow(
            ResourceNotFoundException::new);

        return modelMapper.map(equipo, EquipoDto.class);

    }
    public Optional<Equipo> obtenerEquipoXID(long serial) {


        return repoEquipo.findById(serial);

    }
    public EquipoDto actualizar(EquipoDto equipoDto) {
        repoEquipo.save(modelMapper.map(equipoDto, Equipo.class));
        return equipoDto;

    }
    public void eliminar(long serial) {

        repoEquipo.deleteById(serial);


    }
}
