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
@Entity(name = "Autor")
@Table(name = "Autor_REL")
@ToString
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AUTOR_REL")
    @SequenceGenerator(name = "SEQ_AUTOR_REL", sequenceName = "SEQ_AUTOR_REL", allocationSize = 1)
    @Column(name = "AUT_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "AUT_NOMBRE", nullable = false)
    private String nombre;
}
