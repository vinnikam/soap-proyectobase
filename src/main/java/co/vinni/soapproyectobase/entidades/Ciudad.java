package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Ciudad")
@Table(name = "CIUDADES_REL")
@ToString
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CIUDADES_REL")
    @SequenceGenerator(name = "SEQ_CIUDADES_REL", sequenceName = "SEQ_CIUDADES_REL", allocationSize = 1)
    @Column(name = "CIU_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "CIU_NOMBRE", nullable = false)
    private String nombre;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "ciudad_equipo", joinColumns = @JoinColumn(name= "ciu_codigo", referencedColumnName = "CIU_CODIGO"),
            inverseJoinColumns = @JoinColumn(name = "equ_serial", referencedColumnName =  "EQU_CODIGO")
    )
    List<Equipo> equipos;
}
