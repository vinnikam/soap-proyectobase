package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Equipo")
@Table(name = "EQUIPOS_REL")
@ToString
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EQUIPOS_REL")
    @SequenceGenerator(name = "SEQ_EQUIPOS_REL", sequenceName = "SEQ_EQUIPOS_REL", allocationSize = 1)
    @Column(name = "EQU_CODIGO", nullable = false)
    private long serial;

    @Column(name = "EQU_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "EQU_DESCRIPCION", nullable = false)
    private String descripcion;

    @OneToOne(mappedBy = "equipo", cascade = CascadeType.ALL)
    private Estadio estadio;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    @ManyToMany(mappedBy = "equipos")
    List<Ciudad> ciudades;

}
