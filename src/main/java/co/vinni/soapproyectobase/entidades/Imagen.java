package co.vinni.soapproyectobase.entidades;

import co.vinni.soapproyectobase.dto.EquipoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "IMAGENES_REL")
@Entity
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreArchivo;
    private String ruta; // Ruta donde se almacena el archivo

    @ManyToOne
    @JoinColumn(name = "EQU_CODIGO") //nombre del campo de la base de datos
    private Equipo equipo;
}
