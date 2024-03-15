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
@Entity(name = "Editorial")
@Table(name = "Editorial_REL")
@ToString
public class Editorial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EDITORIAL_REL")
    @SequenceGenerator(name = "SEQ_EDITORIAL_REL", sequenceName = "SEQ_EDITORIAL_REL", allocationSize = 1)
    @Column(name = "EDI_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "EDI_NOMBRE", nullable = false)
    private String nombre;

    @OneToMany(targetEntity = Libro.class, fetch = FetchType.LAZY, mappedBy =  "editorial")
    private List<Libro> libros ;
}
