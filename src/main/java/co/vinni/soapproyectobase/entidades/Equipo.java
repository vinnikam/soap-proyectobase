package co.vinni.soapproyectobase.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Equipo implements Serializable {
    private long serial;
    private String nombre;
    private String descripcion;

}
