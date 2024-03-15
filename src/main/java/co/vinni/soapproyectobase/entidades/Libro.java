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
@Entity (name = "Libro")
@Table(name = "Libro_REL")
@ToString
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LIBRO_REL")
    @SequenceGenerator(name = "SEQ_LIBRO_REL", sequenceName = "SEQ_LIBRO_REL", allocationSize = 1)
    @Column(name = "LIB_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "LIB_NOMBRE", nullable = false)
    private String nombre;

    @OneToOne(targetEntity = Autor.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "AUT_CODIGO")
    private Autor autor;

    @ManyToOne(targetEntity = Editorial.class)
    @JoinColumn(name = "EDI_CODIGO")
    private Editorial editorial;
}
