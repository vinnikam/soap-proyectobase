package co.vinni.soapproyectobase.dto;

import co.vinni.soapproyectobase.entidades.Imagen;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EquipoDto implements Serializable{
    private long serial;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;
    @NotBlank(message = "El escudo es obligatorio")
    private String escudo;

    private List<Imagen> imagenes = new ArrayList<>();

    public void addImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}
