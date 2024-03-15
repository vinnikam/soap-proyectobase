package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Jugador")
@Table(name = "JUGARORES_REL")
public class Jugador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JUGARORES_REL")
    @SequenceGenerator(name = "SEQ_JUGARORES_REL", sequenceName = "SEQ_JUGARORES_REL", allocationSize = 1)
    @Column(name = "JUG_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "JUG_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "JUG_POSICION", nullable = false)
    private String posicion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EQUI_SERIAL")
    private Equipo equipo;
}
