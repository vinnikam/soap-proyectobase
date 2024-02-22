package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Equipo")
@Table(name = "EQUIPOS")
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EQUIPOS")
    @SequenceGenerator(name = "SEQ_EQUIPOS", sequenceName = "SEQ_EQUIPOS", allocationSize = 1)
    @Column(name = "EQU_CODIGO", nullable = false)
    private long serial;

    @Column(name = "EQU_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "EQU_DESCRIPCION", nullable = false)
    private String descripcion;

}
