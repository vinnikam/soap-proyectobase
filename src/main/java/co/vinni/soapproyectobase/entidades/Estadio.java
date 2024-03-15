package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Estadio")
@Table(name = "ESTADIOS_REL")
@ToString
public class Estadio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESTADIOS_REL")
    @SequenceGenerator(name = "SEQ_ESTADIOS_REL", sequenceName = "SEQ_ESTADIOS_REL", allocationSize = 1)
    @Column(name = "EST_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "EST_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "EST_CIUDAD", nullable = false)
    private String ciudad;

    @OneToOne
    @JoinColumn(name =  "EQU_SERIAL")
    private Equipo equipo;
}
